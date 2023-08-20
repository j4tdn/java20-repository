import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// Cách 1: Java 07 version
		Calendar cDate = getInstance(14, 8, 2023);
		
		int currentDayOfYear = cDate.get(Calendar.DAY_OF_YEAR);
		int remanningDays = cDate.getActualMaximum(Calendar.DAY_OF_YEAR) - currentDayOfYear;
		System.out.println("It is day number " + currentDayOfYear + " of the year, " + remanningDays + " days left");
		
		
		String currentWeekDay = new SimpleDateFormat("EEEE").format(cDate.getTime());
		int currentWeekOfYear = cDate.get(Calendar.WEEK_OF_YEAR);
		int weeksInYear = cDate.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int currentYear = cDate.get(Calendar.YEAR);
		System.out.println("\nIt is " + currentWeekDay + " number " + currentWeekOfYear + " out of " + weeksInYear + " in " + currentYear);
	
		
		
		int currentWeekInMonth = cDate.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("\nIt is currentWeekInMonth --> " + currentWeekInMonth);
	}
	
	
	private static Calendar getInstance(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day, 0, 0, 0);
		return c;
	}
}