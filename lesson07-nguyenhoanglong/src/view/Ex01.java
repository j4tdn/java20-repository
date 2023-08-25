package view;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		System.out.println("Enter day: ");
		int a = sc.nextInt();
		System.out.println("Enter month: ");
		int b = sc.nextInt();
		System.out.println("Enter year: ");
		int c = sc.nextInt();
		LocalDate dateStart = LocalDate.now()
				.withDayOfMonth(a)
				.withMonth(b)
				.withYear(c);
		System.out.println("dateStart: " + dateStart);

		LocalDate dateEnd = LocalDate.now();

		if (dateEnd.isBefore(dateStart)) {
			throw new IllegalArgumentException("The end date must be greater than the start date");
		}
		Period period = Period.between(dateStart, dateEnd);
		//System.out.println("period: " + period);
		System.out.println("Start a relationship: " 
				+ opt(period.getYears(), "year") 
				+ opt(period.getMonths(), "month")
				+ opt(period.getDays(), "day"));
	}

	private static String opt(int value, String unit) {
		if (value == 0) {
			return " ";
		}
		return value + " " + unit + (value > 1 ? "s " : " ");
	}
}