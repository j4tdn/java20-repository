package view;

import connection.DBConnection;

public class Ex01TestDbConnnection {
	public static void main(String[] args) {
		System.out.println("connection --> " + DBConnection.getConnection());
	}
}
