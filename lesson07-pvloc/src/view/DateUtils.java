package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}

	public static Date StringToDate(String string, String pattern) {
		// using df --> convert from string (with pattern dd//MM/yyyy) to java.util.Date
		// if pattern is not 'dd/MM/yyyy' throw exception
		DateFormat df = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = df.parse(string);
		} catch (ParseException e) {
			System.out.println(string + " is not formed");
		}
		return date;
	}
	public static Calendar StringToCalender(String string, String pattern) {
		// B1: Convert to date
		Date date = StringToDate(string, pattern);
		// B2: Convert to calender
		// 2.1: get current time
		Calendar c = Calendar.getInstance();
		// 2.2: set time from date to calender
		c.setTime(date);
		return c;
	}
	public static LocalDateTime stringToLocalDateTime(String string, DateTimeFormatter dtf) {
		LocalDateTime lDateTime = null;
		if (string != "") {
			try {
				lDateTime = LocalDateTime.parse(string, dtf);
			} catch (Exception e) {
				System.out.println(string + " is not formed");
			}
		}
		return lDateTime;
	}
	public static String dateToString(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
	public static Calendar dateToCalender(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
	public static Date calenderToDate(Calendar c) {
		// date not suport timezone --> covert incorrectly calendar to date
		// ---> fix :calendar --> date --> string(dateformat) --> date(format, timezone)
		Date date = c.getTime();
		TimeZone tz = c.getTimeZone();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		df.setTimeZone(tz);
		String string = df.format(date);
		date = StringToDate(string, "dd/MM/yyyy HH:mm:ss");
		return date;
	}
	public static String calenderToString(Calendar c, String pattern) {
		Date date = calenderToDate(c);
		DateFormat df = new SimpleDateFormat(pattern);
		String string = df.format(date);
		return string;
	}
}
