package lib.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DayUtil {
	private DayUtil() {
		
	}
	
	public static String formate(Date date,String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}
	
	public static Calendar clone(Calendar c) {
		Calendar cloned = Calendar.getInstance();
		
		cloned.setTimeInMillis(c.getTimeInMillis());
		return cloned;
		
	}
	public static Calendar getFirstWeekDay(Calendar c) {
		Calendar firstWeekDay = clone(c);
		int firstDayofWeek = c.getFirstDayOfWeek();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		firstWeekDay.add(Calendar.DAY_OF_MONTH, firstDayofWeek - dayOfWeek);
		
		return firstWeekDay;
	}
	public static boolean isLeapYear(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		return gc.isLeapYear(year);
	}
	public static String opt(long value , String unit) {
		
		if(value ==0) {
			return "";
		}
		return value + "" + unit + (value > 1?"s":" "); 
	}
}
