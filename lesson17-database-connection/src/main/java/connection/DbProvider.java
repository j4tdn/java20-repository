package connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DbProvider {
	
	private static final String DB_CONFIG_PATH = "dbconfig.properties";

	private DbProvider() {
	}
	
	public static Properties getDbConfigProps() {
		Properties props = new Properties();
		try {
			InputStream is = DbProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH);
			props.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props;
	}
}
