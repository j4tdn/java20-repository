package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	private static Connection connection = null;
	
	private DbConnection() {
	}
	
	public static Connection getConnection() {
		if (connection == null) {
			var props = DbProvider.getDbConfigProps();
			try {
				connection = DriverManager.getConnection(
						props.getProperty("jdbc.url"),
						props.getProperty("jdbc.user"),
						props.getProperty("jdbc.pass")
				);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
	
	
	
	
//	public static void main(String[] args) {
//		Connection connection = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			
//			connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/java1920_shopping", "root", "Anhnga2003@");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		System.out.println("Connection -->" + connection);
//	} 




