package view;

import org.hibernate.Session;

import connection.DbConnection;

public class Ex00TestConnection {
	
	public static void main(String[] args) {
		// factory is used to produce sessions
		
		// session: hiểu đơn giản nó là 1 thread giúp mình truy cập - thực hiện truy vấn đến database
		
		final var sessionFactory = DbConnection.getSessionFactory();
		
		System.out.println("sessionFactory --> " + sessionFactory + "\n");
		
		
	}
	
}