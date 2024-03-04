package view;

import org.hibernate.Session;
import connection.DbConnection;

public class Ex01TestConnection {

	public static void main(String[] args) {
		
		final var sessionFactory = DbConnection.getSessionFactory();
		
		//factory is used to produce sessions
		
		//sessio: hiểu đơn giản là 1 thread giúp mình truy cập - thực hiện truy vấn đến database
		
		System.out.println("sessionFactory --> " + sessionFactory + "\n");
	
		// there 2 types of session
		
		// openSession
		Session session1 = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		
		System.out.println("session1 --> " + session1);
		System.out.println("session2 --> " + session2 + "\n");
		
		//currentSession: singleSession -> tạo ra duy nhất 1 session từ sesionFactory(prefer)
		Session session3 = sessionFactory.getCurrentSession();
		Session session4 = sessionFactory.getCurrentSession();
		
		System.out.println("session3 --> " + session3);
		System.out.println("session4 --> " + session4 + "\n");
	
	}
	
}
