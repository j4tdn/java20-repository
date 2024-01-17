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
			var pros = DbProvider.getDbConfigProps();
			try {
				connection = DriverManager.getConnection(
						pros.getProperty("jdbc.url"),
						pros.getProperty("jdbc.user"),
						pros.getProperty("jdbc.pass"));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
}
