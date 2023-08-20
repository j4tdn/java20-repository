package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Ex03Java07 {
	public static void main(String[] args) throws ParseException {
		//TimeZone currentTime =TimeZone.getTimeZone("vi/VN");
		 String currentTime = getTime("Asia/Ho_Chi_Minh");
		System.out.println("1.Current time: " +currentTime);
		Locale VIETNAM = new Locale("vi", "VN");
		Locale.setDefault(VIETNAM);
		String lastDayOfMonth = getLastDayOfMonth();
		System.out.println("2.The last day of the month: " +lastDayOfMonth);
		
		String firstDayOfWeek = getFirstDayOfWeek();
		System.out.println("3.First day of the week: "+firstDayOfWeek);
		
		String lastDayOfWeek = getLastDayOfWeek();
		System.out.println("  Last day of the week: " +lastDayOfWeek);
		
		
		System.out.println("4.Week of the year: "+getWeekOfYear());
		
		 String futureDate = getFutureDay(20);
	     String futureDayOfWeek = getFutureDayOfWeek(20);
	     System.out.println("5.After 20 day: "+futureDate);
	     System.out.println("  Day of week after 20 day: " +futureDayOfWeek);
	     
	     System.out.println("6.You have lived "+calculateDaysAlive("11/04/2003") +" days");
		
	}
	
	private static String getTime(String timeZoneId) {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 dateFormat.setTimeZone(TimeZone.getTimeZone(timeZoneId));
		 String currentTime = dateFormat.format(currentDate);
	        return currentTime;
	}
	private static String getLastDayOfMonth() {
		Calendar calendar = Calendar.getInstance();
	    calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String lastDayOfMonth = df.format(calendar.getTime());

        return lastDayOfMonth;
	}
	private static String getFirstDayOfWeek() {
		Calendar calendar =Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek()); 
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String firstDayOfWeek =  df.format(calendar.getTime());
        
        return firstDayOfWeek;
	}
	private static String getLastDayOfWeek() {
		Calendar calendar =Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek()+6);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String firstDayOfWeek =  df.format(calendar.getTime());
        
        return firstDayOfWeek;
	}
	private static int getWeekOfYear() {
		Calendar calendar =Calendar.getInstance();
		return calendar.get(Calendar.WEEK_OF_YEAR);

		
	}
	private static String getFutureDay(int days)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, days);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String futureDay =  df.format(calendar.getTime());
		return futureDay;
		
	}
	private static String getFutureDayOfWeek(int days)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, days);
		SimpleDateFormat df = new SimpleDateFormat("EEE");
        String futureDayOfWeek =  df.format(calendar.getTime());
		return futureDayOfWeek;
		
	}
	private static long calculateDaysAlive(String birthdayStr) throws ParseException {
		  SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	      Date date = dateFormat.parse(birthdayStr);
	        Calendar today = Calendar.getInstance();
	        Calendar dayOfBirth = Calendar.getInstance();
	        dayOfBirth.setTime(date);

	        long milliseconds = today.getTimeInMillis() - dayOfBirth.getTimeInMillis();
	        long days = milliseconds / (24 * 60 * 60 * 1000);

	        return days;
	}
}