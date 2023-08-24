package ultils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private DateUtils() {
	}

	public static Calendar stringToCalendar(String string, String pattern) {
		Date date = stringToDate(string, pattern);
		Calendar c = dateToCalendar(date);
		return c;
	}

	public static Date stringToDate(String string, String pattern) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println("'" + string + "'is not valid --> required pattern'" + pattern + "'");
		}
		return date;
	}

	public static Calendar dateToCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

}