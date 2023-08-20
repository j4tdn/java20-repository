package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Utils {
	private Utils() {
		
	}
	public static String format(Calendar c, String pattern) {
		return format(c.getTime(), pattern);
	}
	
	public static String format(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
}
