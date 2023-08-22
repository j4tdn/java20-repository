package exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02WeekdayCalculator {
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a date: ");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		
		do {
			String datestring = sc.nextLine();
			if(isValidDate(datestring)) {
				date = LocalDate.parse(datestring, formatter);
				break;
			}
			System.out.println("Wrong date format, the format should be (dd/MM/yyyy): ");
		}while(true);
		showInformation(date);
	}
	
	private static boolean isValidDate(String teststring) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate.parse(teststring, formatter);
			return true;
		} catch (DateTimeParseException e) {
			return false;
		}
	}

	private static void showInformation(LocalDate date) {
		int numWeekDaysPerMonth;
		int indexWeekDay = 0;

		// Create a calendar object and set the date
		Calendar c = Calendar.getInstance();
		c.set(date.getYear(), date.getMonthValue() - 1, date.getDayOfMonth());

		Calendar cFirst = Calendar.getInstance();
		cFirst.set(date.getYear(), date.getMonthValue() - 1, 1);

		Calendar cLast = Calendar.getInstance();
		cLast.set(date.getYear(), date.getMonthValue() - 1, date.lengthOfMonth());

		if(c.get(Calendar.DAY_OF_WEEK) >= cFirst.get(Calendar.DAY_OF_WEEK) && c.get(Calendar.DAY_OF_WEEK) <= cLast.get(Calendar.DAY_OF_WEEK)){
			numWeekDaysPerMonth = 5;
		} else {
			numWeekDaysPerMonth = 4;
		}

		// Get the details of the date
		DayOfWeek dayNum = date.getDayOfWeek();
		String dayString = dayNum.toString().charAt(0) +
				dayNum.toString().substring(1).toLowerCase();

		int day = date.getDayOfMonth();
		String month = date.getMonth().toString().charAt(0) +
				date.getMonth().toString().substring(1).toLowerCase();
		int year = date.getYear();

		int numWeekDays = 0;

		for(int i = 0; ; i++){
			if(day > 1){
				day -= 7;
				indexWeekDay++;
			} else {
				break;
			}
		}

		// Print the details
		System.out.println(day + " " + month + " " + year + " is a " + dayString);
		System.out.println("\nAdditional facts");
		System.out.println("* It is day number " + date.getDayOfYear() + " of the year, "
				+ (c.getActualMaximum(Calendar.DAY_OF_YEAR) - date.getDayOfYear()) + " days left");

		System.out.println("* It is " + dayString + " number " + c.get(Calendar.WEEK_OF_YEAR)
				+ " out of " + c.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + year);
		System.out.println("* It is " + dayString + " number " + indexWeekDay
				+ " out of " + numWeekDaysPerMonth + " in " + month + " " + year);
		System.out.println("* Year " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_YEAR)
				+ " days");
		System.out.println("* " + month + " " + year + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH)
				+ " days");
	}
}