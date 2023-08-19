package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import utils.DateUtils;

/**
 * Hiển thị
 * 1: ngày thứ mấy trong năm, còn bao nhiêu ngày nữa hết năm hiện tại
 * 2: Là thứ mấy và đã qua bao nhiêu/ còn bao nhiêu thứ đó trong năm hiện tại
 * 3: 
 */
public class Ex02 {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now()
				.withDayOfMonth(25)
				.withMonth(9)
				.withYear(1995);
		System.out.println("date --> " + DateUtils.format(date, "dd/MM/yyyy") + "\n");
		System.out.println(getTitle(date));
		System.out.println(getInforDay(date));
		System.out.println(getInforDayOfWeekInYear(date));
		System.out.println(getInforDayOfWeekInMonth(date));
		System.out.println(getInforYear(date));
		System.out.println(getInforDayMonthYear(date));
	}
	
	private static String getTitle(LocalDate date) {
		int days = date.getDayOfMonth();
		Month months = date.getMonth();
		int years = date.getYear();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		return days + " " + months + " " + years + " is a " + dayOfWeek;
	}
	
	private static String getInforDay(LocalDate date) {
		int dayNumber = date.getDayOfYear();
		int daysLeft = LocalDate.MAX.getDayOfYear() - dayNumber;
		return "It is day number " + dayNumber + " of the year, " + daysLeft + " days left";
	}
	
	private static String getInforDayOfWeekInYear(LocalDate date) {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		LocalDate firstDateInYear = date.with(TemporalAdjusters.firstDayOfYear());
		LocalDate lastDateInYear = date.with(TemporalAdjusters.lastDayOfYear());
		int dayOfWeekNumber = countDayOfWeek(firstDateInYear, date, dayOfWeek);
		int totalDayOfWeek = countDayOfWeek(firstDateInYear, lastDateInYear, dayOfWeek);
		return "It is " + dayOfWeek + "number " + dayOfWeekNumber + " out of " + totalDayOfWeek + " in " + date.getYear();
	}
	
	private static String getInforDayOfWeekInMonth(LocalDate date) {
		Month months = date.getMonth();
		int years = date.getYear();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		LocalDate firstDateInMonth = date.with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDateInMonth = date.with(TemporalAdjusters.lastDayOfMonth());
		int dayOfWeekNumber = countDayOfWeek(firstDateInMonth, date, dayOfWeek);
		int totalDayOfWeek = countDayOfWeek(firstDateInMonth, lastDateInMonth, dayOfWeek);
		
		return "It is " + months + " number " + dayOfWeekNumber + " out of " + totalDayOfWeek + " in " + months + " " + years;
	}
	
	private static String getInforYear(LocalDate date) {
		return "Year " + date.getYear() + " has " + date.with(TemporalAdjusters.lastDayOfYear()).getDayOfYear() + " days ";
	}
	
	private static String getInforDayMonthYear(LocalDate date) {
		return date.getMonth() + " " + date.getYear() + " has " + date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth() + "days";
	}
	private static int countDayOfWeek(LocalDate start, LocalDate end, DayOfWeek dayOfWeek) {
		int startDay = start.getDayOfWeek() == dayOfWeek ? 1 : 0;
		int endDay = end.getDayOfWeek() == dayOfWeek ? 1 : 0;
		
		int totalDays = startDay + endDay;
		return (end.getDayOfYear() - start.getDayOfYear())/7 + totalDays;
	}
}
