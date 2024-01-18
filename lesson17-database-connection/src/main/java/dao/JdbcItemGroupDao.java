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

public class JdbcItemGroupDao implements ItemGroupDao{

	private static final int BATCH_SIZE = 50;
	
	private Connection connection;
	private Statement st;
	private PreparedStatement pst;
	private ResultSet rs;
	
	private static final String Q_GET_ALL_ITEM_GROUPS = ""
			+ "SELECT * FROM item_group";
	/*
	 --> Dùng statement và nỗi chuỗi
	private static final String Q_GET_ITEM_GROUPS_BY_ID = ""
			+ "SELECT * FROM item_group WHERE ID = ";
	*/
	
	private static final String Q_GET_ITEM_GROUPS_BY_ID = ""
			+ "SELECT * FROM item_group WHERE ID = ?";
	
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.ID,\n"
			+ "	   itg.NAME,\n"
			+ "	   group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') DETAIL_INFO,\n"
			+ "       sum(itd.AMOUNT) TOTAL_OF_ITEMS\n"
			+ "  FROM item_group itg\n"
			+ "  JOIN item it\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME;";
	
	private static final String Q_INSERT_ITEM_GROUP = ""
			+ "INSERT INTO item_group(ID, NAME)\n"
			+ "VALUES(?, ?)";
			
	private static final String Q_UPDATE_ITEM_GROUP = ""
			+ "UPDATE item_group\n"
			+ "	  SET NAME = ?\n"
			+ " WHERE ID = ?";
	
	
	
	/**
	 * Constructor
	 */
	public JdbcItemGroupDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		List<ItemGroup> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_GET_ALL_ITEM_GROUPS);
			while(rs.next()) {
				ItemGroup ig = new ItemGroup();
				ig.setId(rs.getInt("ID"));
				ig.setName(rs.getString("NAME"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		List<ItemGroupDto> result = new ArrayList<>();
		try {
			st = connection.createStatement();
			rs = st.executeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP);
			while(rs.next()) {
				ItemGroupDto ig = new ItemGroupDto();
				ig.setIgId(rs.getInt("ID"));
				ig.setIgName(rs.getString("NAME"));
				ig.setTotalOfItems(rs.getLong("TOTAL_OF_ITEMS"));
				ig.setItems(rs.getString("DETAIL_INFO"));
				result.add(ig);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		try {
			pst = connection.prepareStatement(Q_GET_ITEM_GROUPS_BY_ID);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			if(rs.next()) {
				 result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
	
	/*
	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		String sql = "SELECT * FROM item_group WHERE NAME = '" + name + "'";
		try {
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				 result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	*/
	
	@Override
	public ItemGroup get(String name) {
		ItemGroup result = null;
		String sql = "SELECT * FROM item_group WHERE NAME = ?";
		try {
			pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			rs = pst.executeQuery();
			if(rs.next()) {
				 result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	
	/*
	   --> Sử dụng Statement và nỗi chuỗi
	@Override
	public ItemGroup get(int id) {
		ItemGroup result = null;
		try {
			String sql = Q_GET_ITEM_GROUPS_BY_ID + id;
			st = connection.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()) {
				 result = new ItemGroup(rs.getInt("ID"), rs.getString("NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, st);
		}
		return result;
	}
	*/
	
	@Override
	public void save(ItemGroup itemGroup) {
		try {
			pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP);
			pst.setInt(1, itemGroup.getId());
			pst.setString(2, itemGroup.getName());
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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

				// cứ batch chứa 50ptu thì execute bớt 1 lần
				if (++batchCount % BATCH_SIZE == 0) {
					pst.executeBatch();
				}
			}
			// execute all(còn lại)
			pst.executeBatch();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		}finally {
			SqlUtils.close(pst);
		}
	}
}
