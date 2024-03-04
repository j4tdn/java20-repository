package connection;

import java.io.IOException;
import java.util.Properties;

public class DbProvider {
	
	private static final String DB_CONFIG_PATH = "dbconfig.properties";
	
	public DbProvider() {		
	}
	
	public static Properties getDbConfigProps() {
		Properties props = new Properties();
		try {
			props.load(DbProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
