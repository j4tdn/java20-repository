package dao;

import java.util.function.Consumer;

import javax.persistence.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connection.DbConnection;

/*
 * Base class of hibernate
 * Goal: contains common methods related to hibernate/jpa
 */
public class BaseHibernateDao {

	private SessionFactory sessionFactory;
	
	BaseHibernateDao() {
		sessionFactory = DbConnection.getConnection();
	}

	Session openSession() {
		return sessionFactory.openSession();
	}

	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	void executeWithTransaction(Consumer<Session> consumer) {
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		try {
			consumer.accept(session);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

}
