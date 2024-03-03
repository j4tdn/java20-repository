package connection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;
public class DbProvider {
	private static final String DB_CONFIG_PATH = "dbconfig.properties";
	public DbProvider() {
	}
	public static Properties getDbConfigProps() {
		Properties props = new Properties();
		try {
			props.load( DbProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println(props);
		return props;
	}
//	public static Properties getDbConfigProps() {
//		Properties props = new Properties();
//		try {
//			File file   = new File(DB_CONFIG_PATH);
//			FileReader fr = new FileReader(file);
//			props.load(fr);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return props;
//	}
	
}
