package connection;

import java.io.IOException;
import java.util.Properties;

public class DbProvider {
	private static final String DB_CONFIG_PATH = "dbconfig.properties";
	
	private DbProvider() {
		
	}
	
	public static Properties getDbConfigProps() {
		Properties props = new Properties();
		
		try {
			// File file = new File(DB_CONFIG_PATH);
			props.load(DbProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}
}
