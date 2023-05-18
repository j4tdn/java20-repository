package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	
	//ctrl shift o: import all libraries
	//main --> ctrl space --> public static void main ...
	//của một chương trình java
	
	public static void main(String[] args) {
		System.out.println("Welcome to Todo App - 2023");

		System.out.println("\n==__*****__==\n");

		System.out.println("Task01: Update version");
		System.out.println("Task02: Add sum function");

		LocalDate today = LocalDate.now();
		System.out.println("\nToday: " + today);

		LocalDate dob = LocalDate.of(2003, 07, 23);
		System.out.println("Day of birth: " + dob);

		Period lifetime = Period.between(dob, today);
		System.out.println("Your time life: " + lifetime.getYears() + " years " + lifetime.getMonths() + " months "
				+ lifetime.getDays() + " days.");

		System.out.println("\n==__*****__==");
	}
}
