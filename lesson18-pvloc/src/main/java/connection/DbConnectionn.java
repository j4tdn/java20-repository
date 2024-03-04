package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionn {
	public static void main(String[] args) {
		Connection connection = null;
		try {
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java1920_shopping","root","1234");
	}catch (SQLException e) {
		e.printStackTrace();
	}
System.out.println("connection --> " + connection);
}
}
