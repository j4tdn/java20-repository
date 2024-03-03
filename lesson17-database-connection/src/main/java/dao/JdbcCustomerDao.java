package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.DbConnection;
import persistence.Customer;
import utils.SqlUtils;

public class JdbcCustomerDao implements CustomerDao{
	
	private static final String Q_INSERT_CUSTOMER = ""
			+ "INSERT INTO Customer(ID, NAME, EMAIL, ADDRESS, PHONE, PASSWORD)\n"
			+ "VALUES (?, ?, ?, ?, ?, ?)";
	
	private static final String Q_GET_CUSTOMER_BY_EMAIL_AND_PASSWORD = ""
			+ "SELECT *\n"
			+ "  FROM customer\n"
			+ " WHERE EMAIL = ? AND PASSWORD = ?";
	
	private static Connection connection;
	private PreparedStatement pst;
	private ResultSet rs;

	public JdbcCustomerDao() {
		connection = DbConnection.getConnection();
	}
	
	@Override
	public void save(Customer customer) {
		try {
			pst = connection.prepareStatement(Q_INSERT_CUSTOMER);
			pst.setInt(1, customer.getId());
			pst.setString(2, customer.getName());
			pst.setString(3, customer.getEmail());
			pst.setString(4, customer.getAddress());
			pst.setString(5, customer.getPhone());
			// chuyển đổi mk của người dùng sang MD5
			// lưu mã hóa mk vào database
			pst.setString(6, SqlUtils.md5(customer.getPassword()));
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(pst);
		}
	}
	
	@Override
	public Customer login(String email, String password) {
		Customer result = null;
		try {
			pst = connection.prepareStatement(Q_GET_CUSTOMER_BY_EMAIL_AND_PASSWORD);
			pst.setString(1, email);
			pst.setString(2, SqlUtils.md5(password));
			rs = pst.executeQuery();
			if(rs.next()) {
				result = new Customer();
				result.setId(rs.getInt("ID"));
				result.setName(rs.getString("NAME"));
				result.setEmail(rs.getString("EMAIL"));
				result.setAddress(rs.getString("ADDRESS"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			SqlUtils.close(rs, pst);
		}
		return result;
	}
}
