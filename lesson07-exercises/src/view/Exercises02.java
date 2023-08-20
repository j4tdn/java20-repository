package view;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Exercises02 {

	public static void main(String[] args) {
		//C1: Java 07 ver
		
		Calendar cDate = getInstance(19,8,2023);
		
		int currentDayOfYear  = cDate.get(Calendar.DAY_OF_YEAR);
		int remainDay = cDate.getActualMaximum(Calendar.DAY_OF_YEAR) - currentDayOfYear; 
		System.out.println("It is day number "+ currentDayOfYear + "of the year , " + remainDay + "day left");
	
		
		String currentWeekDay =  new SimpleDateFormat("EEEE").format(cDate.getTime());
		int currentWeekYear = cDate.get(Calendar.WEEK_OF_YEAR);
		int weekInYear = cDate.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int currentYear = cDate.get(Calendar.YEAR);
		System.out.println("It is " + currentWeekDay + " number " + currentWeekYear + " total week " +weekInYear+ " year  "+ currentYear);
		
		
		int currentWeekMonth = cDate.get(Calendar.WEEK_OF_MONTH);
		int weekInMonth = cDate.getActualMaximum(Calendar.WEEK_OF_MONTH);
		int currentMonth = cDate.get(Calendar.MONTH);
		String currentMonthName = getMonthName(currentMonth);
		System.out.println("It is " + currentWeekMonth + " out of " + weekInMonth + " in " + currentMonthName );
		
	}
	
	 private static String getMonthName(int month) {
	        DateFormatSymbols symbols = new DateFormatSymbols(Locale.getDefault());
	        String[] monthNames = symbols.getMonths();
	        return monthNames[month];
	    }
	 
	private static Calendar getInstance(int day,int month,int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month -1, day , 0, 0, 0 );
		return c;
	}
}
