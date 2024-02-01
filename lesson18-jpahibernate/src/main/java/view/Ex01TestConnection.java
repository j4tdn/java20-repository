package view;

import org.hibernate.Session;

import connection.DbConnection;

public class Ex01TestConnection {

	public static void main(String[] args) {
		
		final var sessionFactory = DbConnection.getSessionFactory();
		
		System.out.println(" -> " + sessionFactory);
		
		// there 2 type of session
		
		// openSession luôn tạo session mới
		Session session1 = sessionFactory.openSession();
		Session session2 = sessionFactory.openSession();
		
		System.out.println("session 1 -> " + session1);
		System.out.println("session 2 -> " + session2);
		
		// currentSession: singleton -> tạo ra duy nhất 1 session từ sessionFactory(prefer)
		Session session3 = sessionFactory.getCurrentSession();
		Session session4 = sessionFactory.getCurrentSession();
		
		System.out.println("session 3 -> " + session3);
		System.out.println("session 4 -> " + session4);
	}
}
