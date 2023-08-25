package view;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class Ex03 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH)+1;
		int year = c.get(Calendar.YEAR);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println("Current time in format dd/MM/yyy HH:mm:ss is "+day + "/" + month + "/" + year +"   "+ hour + ":" + minute + ":" + second); 
		lastDayOfMonth(c);
		firstAndLastDayOfWeek(c);
		weeksOfyear(c);
		twentyDayslater(c);
	}
	private static void lastDayOfMonth(Calendar date) {
		System.out.println("The last day of the month: " + date.getActualMaximum(Calendar.DAY_OF_MONTH) + "/" + (date.get(Calendar.MONTH)+1) + "/" + date.get(Calendar.YEAR) );
	}
	
	private static void firstAndLastDayOfWeek(Calendar date) {
		Calendar firstDayOFWeek = Calendar.getInstance();
		firstDayOFWeek.setTimeInMillis(date.getTimeInMillis());
		firstDayOFWeek.add(Calendar.DAY_OF_MONTH, date.getFirstDayOfWeek()- date.get(Calendar.DAY_OF_WEEK)); 
		System.out.println("First day of week : " + firstDayOFWeek.get(Calendar.DATE) + "/" + (firstDayOFWeek.get(Calendar.MONTH) +1) + "/" + firstDayOFWeek.get(Calendar.YEAR));
	
		Calendar lastDayOFWeek = Calendar.getInstance();
		lastDayOFWeek.setTimeInMillis(date.getTimeInMillis());
		lastDayOFWeek.add(Calendar.DAY_OF_MONTH, date.getFirstDayOfWeek()- date.get(Calendar.DAY_OF_WEEK) + 6); 
		System.out.println("Last day of the week: " + lastDayOFWeek.get(Calendar.DATE) + "/" + (lastDayOFWeek.get(Calendar.MONTH) +1) + "/" + lastDayOFWeek.get(Calendar.YEAR));
	}
	
	private static void weeksOfyear(Calendar date) {
		int dayOfYear = date.get(Calendar.DAY_OF_YEAR);
		int dayOfWeek = dayOfYear/7;
		if(dayOfYear % 7 != 0) {
			dayOfWeek = dayOfWeek + 1;
		}
				
		System.out.println( "Now is the second week " + dayOfWeek 
							+ " of " +(dayOfWeek + (date.getActualMaximum(Calendar.DAY_OF_YEAR)-dayOfYear)/7) + " trong " + date.get(Calendar.YEAR));
	}
	
	private static void twentyDayslater(Calendar date) {
		Calendar day = Calendar.getInstance();
		day.setTimeInMillis(date.getTimeInMillis());
		int currentDay = date.get(Calendar.DATE);
		int maxDayOfMonth = date.getActualMaximum(Calendar.DAY_OF_MONTH);
		if (currentDay + 20 <= maxDayOfMonth) {
			day.add(Calendar.DATE, currentDay + 20);
		} else {
			int crMonth = date.get(Calendar.MONTH);
			int addDay = 20 - (maxDayOfMonth - currentDay);
			day.set(Calendar.MONTH, crMonth + 1);
			day.set(Calendar.DATE, addDay);
		}
		System.out.println("20 days later of " +date.get(Calendar.DATE) + "/" + (date.get(Calendar.MONTH)+1) + "/" + date.get(Calendar.YEAR) +  " is " 
				+ day.get(Calendar.DATE) + "/" + (day.get(Calendar.MONTH)+1) + "/" + day.get(Calendar.YEAR));
	}
	
	

}