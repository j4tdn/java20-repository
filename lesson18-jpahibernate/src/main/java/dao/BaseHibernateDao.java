package dao;

import java.util.List;
import java.util.function.Consumer;

import javax.persistence.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import connection.DbConnection;

/**
 * Base class of Hibernate
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
	
	void clear2ndCache() {
		Cache cache = sessionFactory.getCache();
		cache.evictAll();
	}
	
	protected void executeWithTransaction(Consumer<Session> consumer) {
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
	
	@SuppressWarnings("unchecked")
	protected <T> List<T> safeList(Query<?> query) {
		return (List<T>)query.getResultList();
	}

}