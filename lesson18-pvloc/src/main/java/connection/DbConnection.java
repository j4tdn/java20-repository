package connection;

import java.io.FileReader;
import java.io.IOException;
import java.lang.module.Configuration;
import java.util.Properties;

import com.mysql.cj.xdevapi.SessionFactory;

public class DbConnection {
private static final String DB_CONFIG_PATH = "dbconfig.properties";
private DbConnection() {
	
	public static Properties getDbConfigProps() {
		Properties props = new Properties();
		FileReader fr = new FileReader(file);
		props.load(fr);
	}catch(IOException e) {
		e.printStackTrace();
	}
	return props;
}
	
}  

