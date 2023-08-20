package view;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		System.out.println("Enter the date to start dating: ");
		String startDayStr = sc.nextLine();
		LocalDateTime startDay = LocalDateTime.parse(startDayStr, df);
		
		System.out.println("Has breakup ->(T/F): ");
		String result = sc.nextLine();
		boolean hasBreakup = result.equalsIgnoreCase("T");
		
		LocalDateTime breakupDate;
		if (hasBreakup) {
			System.out.println("Enter the breakup date: ");
			String breakupDayStr = sc.nextLine();
			breakupDate = LocalDateTime.parse(startDayStr, df);
		} else {
			breakupDate = LocalDateTime.now();

		}
		
		DayOfWeek dayOfWeek = startDay.getDayOfWeek();
		System.out.println("The date to start dating is: " + dayOfWeek.getValue());

		LocalDateTime tempDateTime = LocalDateTime.from(startDay);

		long years = tempDateTime.until(breakupDate, ChronoUnit.YEARS);
		tempDateTime = tempDateTime.plusYears(years);

		long months = tempDateTime.until(breakupDate, ChronoUnit.MONTHS);
		tempDateTime = tempDateTime.plusMonths(months);

		long days = tempDateTime.until(breakupDate, ChronoUnit.DAYS);
		tempDateTime = tempDateTime.plusDays(days);

		long hours = tempDateTime.until(breakupDate, ChronoUnit.HOURS);
		tempDateTime = tempDateTime.plusHours(hours);

		long minutes = tempDateTime.until(breakupDate, ChronoUnit.MINUTES);
		tempDateTime = tempDateTime.plusMinutes(minutes);

		long seconds = tempDateTime.until(breakupDate, ChronoUnit.SECONDS);
		System.out.println(years + " year " + months + " months " + days + " days " + hours + " hours " + minutes
				+ " minutes " + seconds + " seconds");

	}

}

