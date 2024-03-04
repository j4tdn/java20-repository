package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DBConnection;

/**
 * Base class of Hibernate
 * 
 * Goal: contains common method related to hibernate/jpa
 * Child: extends and use these methods
 *
 */
public class BaseHibernateDao {
	
	private SessionFactory sessionFactory;
	
	BaseHibernateDao() {
		sessionFactory = DBConnection.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}