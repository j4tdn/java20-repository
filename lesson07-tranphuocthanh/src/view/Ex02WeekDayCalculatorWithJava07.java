package view;

import static bean.Utils.formatterWithDF;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Ex02WeekDayCalculatorWithJava07 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String pattern = "dd/MM/yyyy";
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		
		do {
			System.out.println("nhập thời điểm với format '" + pattern + "': ");
			String input = ip.nextLine();
			try {
				date = formatterWithDF(pattern).parse(input);
				break;
			} catch (ParseException e) {
				e.printStackTrace();
				System.out.println("vui lòng nhập đúng format!!!");
			}
			
		} while (true);
				
		cal.setTime(date);

		// System.out.println(formatterWithDF(pattern).format(date) + " is a " + formatterWithDF("EEEE").format(date));

		int dow = cal.get(Calendar.DAY_OF_WEEK);
		
		getFunFactsOfSpecificDate(cal, dow);
		
		
	}
	
	private static void getFunFactsOfSpecificDate(Calendar cal, int dow) {
		int daysInYear = cal.get(Calendar.DAY_OF_YEAR);
		int year = cal.get(Calendar.YEAR);
		System.out.println("It is day number " + daysInYear + " of the year, " 
				+ (cal.getActualMaximum(Calendar.DAY_OF_YEAR) - daysInYear) + " days left");
		
		countSpecificDaysInYear(cal, dow);
		countSpecificDaysInMonth(cal, dow);
		
		System.out.println("Year " + year + " has " + cal.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
	
		System.out.println(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + " " 
				+ year + " has " + cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
	}
	
	private static void countSpecificDaysInMonth (Calendar cal, int dow) {
		int count = 0; 
		int tmp = 0;
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		Calendar fdom = Calendar.getInstance();
		fdom.set(year, month, 1, 0, 0, 0);

		Calendar ldom = Calendar.getInstance();
		ldom.set(year, month, cal.getActualMaximum(Calendar.DAY_OF_MONTH), 0, 0, 0);
		
		while (fdom.before(ldom)) {
			if (fdom.get(Calendar.DAY_OF_WEEK) == dow) {
				count++;
				if (fdom.get(Calendar.MONTH) == cal.get(Calendar.MONTH)) {
					tmp = count;
				}
				fdom.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				fdom.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		
		System.out.println("It is " + formatterWithDF("EEEE").format(cal.getTime()) 
				+ " number " + tmp + " out of " + count  + " in " 
				+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault())
				+ " " + cal.get(Calendar.YEAR));
	}	
	
	private static void countSpecificDaysInYear (Calendar cal, int dow) {
		int count = 0; 
		int tmp = 0;
		int year = cal.get(Calendar.YEAR);

		Calendar fdoy = Calendar.getInstance();
		fdoy.set(year, Calendar.JANUARY, 1, 0, 0, 0);

		Calendar ldoy = Calendar.getInstance();
		ldoy.set(year, Calendar.DECEMBER, 31, 0, 0, 0);

		while (fdoy.before(ldoy)) {
			if (fdoy.get(Calendar.DAY_OF_WEEK) == dow) {
				count++;
				if (fdoy.get(Calendar.MONTH) == cal.get(Calendar.MONTH)
						&& fdoy.get(Calendar.DAY_OF_MONTH) == cal.get(Calendar.DAY_OF_MONTH)) {
					tmp = count;
				}
				fdoy.add(Calendar.DAY_OF_MONTH, 7);
			} else {
				fdoy.add(Calendar.DAY_OF_MONTH, 1);
			}
		}
		System.out.println("It is " + formatterWithDF("EEEE").format(cal.getTime()) 
				+ " number " + tmp + " out of " + count  + " in " + cal.get(Calendar.YEAR));
	}
}
