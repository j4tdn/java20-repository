package view;

import connection.DbConnection;

public class Ex01TesstDbConnection {
	public static void main(String[] args) {
		System.out.println("connection --> " + DbConnection.getConnection());
	}
}
