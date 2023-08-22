package exercises;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01RelationshipCalculator {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		sc.useDelimiter("[\\s,]+");
		System.out.println("<--- The Ultimate Relationship Calculator --->");
		System.out.println("Enter the start time of the date(dd/MM/yyyy separated by a space or comma): ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.nextLine();
		LocalDate startD = LocalDate.of(num3, num2, num1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Have they broken up yet? (Y/N):");
		String choice = sc.nextLine();
		if(choice.equals("Y")) {
		
			System.out.println("Enter the number of days they have broken up: ");
			int brokeUpDays = sc.nextInt();
			LocalDate currentDay = startD.plusDays(brokeUpDays);
			System.out.println("The current day is: " + formatter.format(currentDay));
		
			System.out.println("The day they started dating was: " + calculateWeekDay(startD));			
			calculateDatePeriod(startD);
			
		} else if(choice.equals("N")) {
			
			System.out.println("The day they started dating was: " + calculateWeekDay(startD));
			calculateDatePeriod(startD);
		}
		System.out.println("Finished");
	}
	
	private static String calculateWeekDay(LocalDate date) {
		DayOfWeek dayNum = date.getDayOfWeek();
		String dayString = dayNum.toString();
		return dayString;
	}
	
	private static void calculateDatePeriod(LocalDate start) {
		LocalDateTime startDT = LocalDateTime.of(start.getYear(), start.getMonth(), start.getDayOfMonth(), 0, 0);
		LocalDateTime currentDT = LocalDateTime.now();
		
		Period period = Period.between(start, LocalDate.now());
		Duration duration = Duration.between(startDT, LocalDateTime.now());
		long totalDays = ChronoUnit.DAYS.between(startDT, currentDT);
	    long hours = duration.toHours() - totalDays * 24;
	    long minutes = duration.toMinutes() - (hours * 60 + totalDays * 24 * 60);
	    long seconds = duration.getSeconds() - (hours * 3600 + minutes * 60 + totalDays * 24 * 3600);
		System. out.println("The relationship has lasted for: " 
							+ period.getYears() + " years "
							+ period.getMonths() + " months "
							+ period.getDays() + " days "
							+ hours + " hours "
							+ minutes + " minutes "
							+ seconds + " seconds "
							+ " up to now since their first date.");
	}
}
