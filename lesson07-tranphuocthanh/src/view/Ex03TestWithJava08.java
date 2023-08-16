package view;

import static bean.Utils.formatter;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import bean.Test03;

public class Ex03TestWithJava08 implements Test03{
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		Ex03TestWithJava08 test = new Ex03TestWithJava08();
		String pattern = "dd/MM/yyyy";
		
		System.out.println("1. " + test.getCurDateTime(pattern + " HH:mm:ss"));

		System.out.println("2. " + test.getLastDayInCurMonth(pattern));

		System.out.println("3. " + Arrays.toString(test.getFirstAndLastDaysInCurWeek(pattern)));

		System.out.println("4. " + test.getCurWeekInYear());

		System.out.println("5. " + test.checkDateAfter20Days(20, pattern + " EEEE"));

		System.out.println("6. " + test.calculateDaysAlive(pattern));

		ip.close();
	}

	@Override
	public String[] getFirstAndLastDaysInCurWeek(String pattern) {
		LocalDate date = LocalDate.now().with(WeekFields.of(Locale.getDefault()).getFirstDayOfWeek());
		date = date.minusDays(7); // fdow
		
		return new String[] {formatter(pattern).format(date), formatter(pattern).format(date.plusDays(6))};
	}

	@Override
	public String getLastDayInCurMonth(String pattern) {
		LocalDate date = LocalDate.now();
		date = date.withDayOfMonth(date.lengthOfMonth());
		return formatter(pattern).format(date);
	}

	@Override
	public String getCurDateTime(String pattern) {
		LocalDate date = LocalDate.now();
		
		return formatter(pattern).format(date);
	}

	@Override
	public int getCurWeekInYear() {
		LocalDate date = LocalDate.now();
		
		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		
		return date.get(weekFields.weekOfWeekBasedYear());
	}

	@Override
	public String checkDateAfter20Days(int day, String pattern) {
		LocalDate date = LocalDate.now();
		date = date.plusDays(day);
		return (formatter(pattern).format(date));
	}

	@Override
	public long calculateDaysAlive(String pattern) {
		LocalDate dob = null;
		do {
			System.out.println("vui lòng nhập vào ngày tháng năm sinh với format '" 
					+ pattern + "': ");
			String input = ip.nextLine();
			try {
				dob = dob.parse(input, formatter(pattern));
				break;
			}catch (DateTimeParseException e) {
				e.printStackTrace();
				System.out.println("vui lòng nhập đúng format!!!");
			}
		}while (true);
		
		LocalDate now = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(dob, now);
		
		return days;
	}
	
	
}
