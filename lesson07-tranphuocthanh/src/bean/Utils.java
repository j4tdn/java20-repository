package bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Utils {
	
	public static boolean isHoliday(Calendar cal, Calendar[] holidays) {
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		
		for (Calendar holiday: holidays) {
			if (dayOfMonth == holiday.get(Calendar.DAY_OF_MONTH) 
					&& month == holiday.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false;
	}
	
	public static Calendar getTime(int month, int date) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, date);
		return cal;
	}
	
	public static DateFormat formatterWithDF(String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df;
	}
	
	public static DateTimeFormatter formatter(String pattern) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df;
	}
	
	public static String formattedPeriod(Period period) {
		String day = period.getDays() > 0 ? period.getDays() + "ngày " : "";
		String month = period.getMonths() > 0 ? period.getMonths() + "tháng " : "";
		String year = period.getYears() > 0 ? period.getYears() + "năm " : "";

		return day + month + year;
	}
	
	public static String formattedDuration (Duration duration) {
		String hour =  duration.toHoursPart() > 0 ? duration.toHoursPart() + "giờ " : "";
		String minute =  duration.toMinutesPart() >= 0 ? duration.toMinutesPart() + "phút " : "";
		String second =  duration.toSecondsPart() >= 0 ? duration.toSecondsPart() + "giây " : "";
		
		return hour + minute + second;
	}
}
