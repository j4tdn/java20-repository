package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex02WhatDay {
public static void main(String[] args) {
		
		Calendar cDate = getInstance(14, 9 , 2023);
		
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
		int DayOfYear = cDate.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println("\nIt " + currentYear + " has " + DayOfYear);
		
		
		System.out.println("\nIt " + cDate.get(Calendar.MONTH) + " " + currentYear + " has " + cDate.getActualMaximum(Calendar.DAY_OF_MONTH) + "days");
	}
	
	
	private static Calendar getInstance(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day, 0, 0, 0);
		return c;
	}
}
