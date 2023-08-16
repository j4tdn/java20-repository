package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import utils.DateUtils;

public class Ex02WeekdayCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		
		System.out.print("Nhập ngày: ");
		try {
			date = df.parse(sc.nextLine());
			
			// date to calendar
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			
			result(c);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	private static void result(Calendar c) {
		int year = c.get(Calendar.YEAR);
		int daysOfYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		
		System.out.println(DateUtils.format(c, "dd MMMM yyyy") + " is a " + DateUtils.format(c, "EEEE"));
		System.out.println("\nAdditional facts:");
		System.out.println(" + It is day number " + c.get(Calendar.DAY_OF_YEAR) + " of the year, " + (daysOfYear - c.get(Calendar.DAY_OF_YEAR)) + " days left.");
		System.out.println(" + It is " + DateUtils.format(c, "EEEE") + " number " + c.get(Calendar.WEEK_OF_YEAR) + " out of " + c.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + year + ".");
		System.out.println(" + It is " + DateUtils.format(c, "EEEE") + " number " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + " out of " + c.getActualMaximum(Calendar.DAY_OF_WEEK_IN_MONTH) + " in " + DateUtils.format(c, "MMMM yyyy") + ".");
		System.out.println(" + Year " + year+ " has " + daysOfYear + " days.");
		System.out.println(" + " + DateUtils.format(c, "MMMM yyyy") + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
	}
}
