package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import connection.DbConnection;
import persistence.Item;
import persistence.ItemGroup;
import utils.DateUtils;
import utils.SqlUtils;

public class JdbcItemDao implements ItemDao{
	
	private static final String Q_GET_ALL_ITEMS = ""
			+ "SELECT it.*,\n"
			+ "	      ig.ID IG_ID,\n"
			+ "		  ig.NAME IG_NAME"
			+ "  FROM item_group ig\n"
			+ "  JOIN item it\n"
			+ "    ON it.ITEM_GROUP_ID = ig.ID";
	
	private static final String Q_GET_ITEMS_BY_SALES_DATE = ""
			+ "SELECT it.*\n"
			+ "  FROM item it\n"
			+ "  JOIN item_detail id\n"
			+ "    ON it.ID = id.ITEM_ID\n"
			+ "  JOIN order_detail odd\n"
			+ "    ON odd.ITEM_DETAIL_ID = id.ID\n"
			+ "  JOIN `order` od\n"
			+ "    ON odd.ORDER_ID = od.ID\n"
			+ " WHERE CAST(od.CREATED_AT AS DATE) = ?";
			
	
	private static Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;

	public JdbcItemDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public List<Item> getAll() {
		List<Item> result = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(Q_GET_ALL_ITEMS);
			rs = pst.executeQuery();
			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("ID"));
				item.setName(rs.getString("NAME"));
				item.setMaterial(rs.getString("MATERIAL"));
				item.setBuyPrice(rs.getBigDecimal("BUY_PRICE"));
				item.setColor(rs.getString("COLOR"));
				// quan tâm đến tên column (alias) khi query trả về
				ItemGroup group = new ItemGroup(rs.getInt("IG_ID"), rs.getString("IG_NAME"));
				item.setGroup(group);
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
	
	// mysql: DATE, TIME, DATETIME
	
	// jdbc: pst.setDate(java.sql.Date), pst.setTime(java.sql.Time), pst.setTimeStamp(datetime)
	
	// JAVA: java.util.Date, Calendar
	// 	   : LocalDate, LocalTime, LocalDateTime
	
	@Override
	public List<Item> getItemsBySalesDate(LocalDate date) {
		List<Item> result = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(Q_GET_ITEMS_BY_SALES_DATE);
			// convert localDate to java.sql.Date
			// pst.setDate(1, Date.valueOf(date));
			pst.setDate(1, DateUtils.toSqlDate(date));
			rs = pst.executeQuery();
			while (rs.next()) {
				Item item = new Item();
				item.setId(rs.getInt("ID"));
				item.setName(rs.getString("NAME"));
				item.setMaterial(rs.getString("MATERIAL"));
				item.setBuyPrice(rs.getBigDecimal("BUY_PRICE"));
				item.setColor(rs.getString("COLOR"));
				result.add(item);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, pst);
		}
		
		return result;
	}
}
