package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConnection {
	
	private static SessionFactory sessionFactory = null;
	
	private DbConnection() {
	}
	
	public static synchronized SessionFactory getConnection() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml")
										  .buildSessionFactory();
		}
		return sessionFactory;
	}

}
