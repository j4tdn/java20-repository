package bean;

public interface Test03 {
	
	String[] getFirstAndLastDaysInCurWeek(String pattern) ;
	
	String getLastDayInCurMonth(String pattern);
	
	String getCurDateTime(String pattern) ;
	
	int getCurWeekInYear();
	
	String checkDateAfter20Days(int day, String pattern);
	
	long calculateDaysAlive(String pattern);
}
