package view;

import static bean.Utils.formatter;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Ex02WeekDayCalculatorWithJava08 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		LocalDate date = null;
		String pattern = "dd/MM/yyyy";

		do {
			System.out.println("nhập vào thời điểm với format '" + pattern + "': " );
			String input = ip.nextLine();
			try {
				date = date.parse(input, formatter(pattern));
				break;
			} catch (DateTimeParseException e) {
				e.printStackTrace();
				System.out.println("vui dòng nhập đúng định dạng!!!");
			}
		}while (true);

		String dayOfWeek = formatter("EEEE").format(date).toUpperCase();
		
		System.out.println(formatter(pattern).format(date) + " is a " + dayOfWeek);
		getFunFactsOfSpecificDate(date, dayOfWeek);
		
	}
	
	private static void getFunFactsOfSpecificDate(LocalDate date, String dayOfWeek) {
		int daysInYear = date.getDayOfYear();
		int year = date.getYear();
		System.out.println("It is day number " + daysInYear + " of the year,"
				+ (date.lengthOfYear() - daysInYear) + " days left");
		
		countSpecificDaysInYear(date, dayOfWeek);
		countSpecificDaysInMonth(date, dayOfWeek);
		
		System.out.println("Year " + year + " has " + date.lengthOfYear() + " days");
		
		System.out.println(date.getMonth() + " " + year + " has " + date.getDayOfMonth() + " days" );
	}

	private static void countSpecificDaysInMonth(LocalDate date, String day) {
		int count = 0;
		int tmp = 0;
		
		LocalDate fdom = LocalDate.of(date.getYear(), date.getMonth(), 1);
		LocalDate ldom = LocalDate.of(date.getYear(), date.getMonth(), date.lengthOfMonth());
		
		while (fdom.isBefore(ldom)) {
			if (fdom.getDayOfWeek().equals(DayOfWeek.valueOf(day))) {
				count++;
				if (fdom.equals(date)) {
					tmp = count;
				}
				fdom = fdom.plusWeeks(1);
			} else {
				fdom = fdom.plusDays(1);
			}
		}
		
		System.out.println("It is " + date.getDayOfWeek() + " number " + tmp + " out of " + count  + " in " + date.getMonth() + " " + date.getYear());
	}
	private static void countSpecificDaysInYear(LocalDate date, String day) {
		int count = 0;
		int tmp = 0;
		LocalDate fdoy = LocalDate.of(date.getYear(), 1, 1);
		LocalDate ldoy = LocalDate.of(date.getYear(), 12, 31);
		
		while (fdoy.isBefore(ldoy)) {
			if (fdoy.getDayOfWeek().equals(DayOfWeek.valueOf(day))) {
				count ++;
				if (fdoy.equals(date)) {
					tmp = count;
				}
				fdoy = fdoy.plusWeeks(1);
			} else {
				fdoy = fdoy.plusDays(1);
			}
		}
		
		System.out.println("It is " + date.getDayOfWeek() + " number " + tmp + " out of " + count  + " in " + date.getYear());
	}
}