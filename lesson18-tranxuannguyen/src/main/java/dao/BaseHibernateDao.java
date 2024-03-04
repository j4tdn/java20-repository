package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.DbConnection;

/*
 * Base class of Hibernate
 * 
 * Goal: contains common method related to Hibernate/jpa
 * Child: extends ah use these methods
 */

public class BaseHibernateDao {

	private SessionFactory sessionFactory;
	
	BaseHibernateDao() {
		sessionFactory = DbConnection.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}