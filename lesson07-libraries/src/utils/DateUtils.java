package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	private DateUtils() {
		
	}
	public static String format(Calendar c, String pattern){
        return format(c.getTime(), pattern);
    }
	public static String format(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
	public static Calendar clone(Calendar c) {
		Calendar cloned = Calendar.getInstance();
		cloned.setTimeInMillis(c.getTimeInMillis());
		return cloned;
	}
	
	public static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	
	public static String opt(long value, String unit) {
		if(value == 0) {
			return "";
		}
		return value + " " + unit + (value > 1 ? "s " : "");
	}
}
