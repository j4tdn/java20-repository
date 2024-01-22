package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import connection.DbConnection;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;
import utils.SqlUtils;

public class JdbcItemGroupDao implements ItemGroupDao {
	
	private static final int BATCH_SIZE = 50;

	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	private static final String Q_GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM item_group";
	
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.ID,\n"
			+ "	   itg.NAME,\n"
			+ "       sum(itd.AMOUNT) TOTAL_OF_ITEMS,\n"
			+ "	   group_concat(concat(it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') "
			+ "ITEM_DETAILS_INFO\n"
			+ "  FROM item_group itg\n"
			+ "  JOIN item it\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME;";
	
	// -> Statement
	// private static final String Q_GET_ITEM_GROUPS_BY_ID = ""
	//		+ "SELECT * FROM item_group WHERE ID = ";
	
	// -> PreparedStatement
	private static final String Q_GET_ITEM_GROUP_BY_ID = ""
			+ "SELECT * FROM item_group WHERE ID = ?";
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * FROM item_group WHERE `NAME` = ?";
	
	private static final String Q_INSERT_ITEM_GROUP = ""
			+ "INSERT INTO item_group(ID, NAME)\n"
			+ "VALUES(?, ?)";
	
	private static final String Q_UPDATE_ITEM_GROUP = ""
			+ "UPDATE item_group\n"
			+ "   SET NAME = ?\n"
			+ " WHERE ID = ?";
	
	private static final String Q_MERGE_ITEM_GROUP = ""
			+ "CALL P_MERGE_INTO_ITEM_GROUP(?, ?)";
	
	/**
	 * Constructor
	 */
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		var result = new ArrayList<ItemGroup>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL_ITEM_GROUPS);
			// rs
			// ID	NAME
			// 1	 Áo
			// 2	 Quần
			// ...
			while (rs.next()) {
				ItemGroup ig = new ItemGroup();
				ig.setId(rs.getInt("ID"));
				ig.setName(rs.getString("NAME"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		var result = new ArrayList<ItemGroupDto>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP);
			while (rs.next()) {
				ItemGroupDto ig = new ItemGroupDto();
				ig.setIgId(rs.getInt("ID"));
				ig.setIgName(rs.getString("NAME"));
				ig.setTotalOfItems(rs.getLong("TOTAL_OF_ITEMS"));
				ig.setItems(rs.getString("ITEM_DETAILS_INFO"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		try {
			/*
			-> Statement:
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ITEM_GROUPS_BY_ID + id);
			*/
			pst = connection.prepareStatement(Q_GET_ITEM_GROUP_BY_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if (rs.next()) {
				result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}

	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		try {
			/*
			-> Statement:
			String sql = "Q_GET_ITEM_GROUPS_BY_NAME = '" + name + "'"; 
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			-> nếu truyền name = x' OR '1=1 -> câu lệch sql luôn đúng
			-> có thể get() xem database -> nguy hiểm nếu hàm get() xem đc password
			*/
			pst = connection.prepareStatement(Q_GET_ITEM_GROUP_BY_NAME);
			pst.setString(1, name);
			rs = pst.executeQuery();
			while (rs.next()) {
				result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		try {
			pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void save(Collection<ItemGroup> groups) {
		try {
			int batchCount = 0;
			pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP);
			for (ItemGroup itemGroup: groups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				// cứ batch chứa 50 phần tử execute bớt 1 lần
				if (++batchCount % BATCH_SIZE == 0)
					pst.executeBatch();
			}
			pst.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		try {
			pst = connection.prepareStatement(Q_UPDATE_ITEM_GROUP);
			pst.setString(1, itemGroup.getName());
			pst.setInt(2, itemGroup.getId());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void merge(ItemGroup itemGroup) {
		try {
			pst = connection.prepareCall(Q_MERGE_ITEM_GROUP);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			pst.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public void merge(Collection<ItemGroup> groups) {
		try {
			int batchCount = 0;
			pst = connection.prepareCall(Q_MERGE_ITEM_GROUP);
			for (ItemGroup itemGroup: groups) {
				pst.setInt(1, itemGroup.getId());
				pst.setString(2, itemGroup.getName());
				pst.addBatch();
				// cứ batch chứa 50 phần tử execute bớt 1 lần
				if (++batchCount % BATCH_SIZE == 0)
					pst.executeBatch();
			}
			pst.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			SqlUtils.close(pst);
		}
	}
}
