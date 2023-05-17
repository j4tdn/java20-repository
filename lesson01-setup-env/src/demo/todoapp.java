package demo;

import java.time.LocalDate;
import java.time.Period;

public class todoapp {
	
	private static Period lifeTime;

	// ctrl shift o: import all libraries
	// main -> ctrl space -> public static void main...
public static void main(String[] args) {
	// h�m main- n?i b?t ??u v� k?t th�c c?a m?t ch??ng tr�nh Java core
	System.out.println("Welcome to Todo App - 2-23");
	System.out.println("Task 01: Update Version");
	System.out.println("\n==....******==");
	System.out.println("Task 01: Update Version");
	System.out.println("Task 02: Add file");
	LocalDate today = LocalDate.now();
	System.out.println("Today: " +today);
	LocalDate dob = LocalDate.of(2000, 12, 22);
	System.out.println("Day off birth: " +dob);

	Period.between(dob, today);
	System.out.println("Your time life: " + lifeTime.getYears() + "year" + lifeTime.getMonths() +"months" + lifeTime.getDays() + "days");
	Period lifeTime = Period.between(dob, today);
	System.out.println("\n==__!#!#!#$");
}
}
