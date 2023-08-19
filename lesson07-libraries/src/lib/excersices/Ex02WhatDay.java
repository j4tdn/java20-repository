package lib.excersices;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02WhatDay {
	public static void main(String[] args) {
		
		//c1: Java 7 version
		Calendar cDate = getInstance(14, 8, 2023);
		int currentDayOfYear = cDate.get(Calendar.DAY_OF_YEAR);
		int remanningDays = cDate.getActualMaximum(Calendar.DAY_OF_YEAR) - currentDayOfYear;
		System.out.println("It is day number " + currentDayOfYear + 
						" of the year, " + remanningDays + " days left");
		
		String currentWeekDay = new SimpleDateFormat("EEEE").format(cDate.getTime());
		int currentWeekYear = cDate.get(Calendar.WEEK_OF_YEAR);
		int weekInYears = cDate.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int year = cDate.get(Calendar.YEAR);
		System.out.println("It is current Week Day: "+ currentWeekDay + ", "
							+ "number current Week Year: " + currentWeekYear + "out of "
							+ weekInYears + " in year: " +year);
	
		
		int currentWeekInMonth = cDate.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		System.out.println("It Current Day Of Week in Month: " + currentWeekInMonth);
		
	}
	
	private static Calendar getInstance (int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day, 0, 0, 0);
		return c;
	}
}
