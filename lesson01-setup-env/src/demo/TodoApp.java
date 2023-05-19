package demo;

import java.time.LocalDate;
import java.time.Period;
//ctrl shift o: import

public class TodoApp {
	public static void main(String[] args) {

		System.out.println("\nWelcome to Todo App - 2023");
		System.out.println("\n=_*****_=\n");
		System.out.println("Task01: Update version");
		System.out.println("Add sum function");
		// in ra ngay thang nam hien tai
		System.out.println("\n=_*****_=\n");
		LocalDate today = LocalDate.now();
		System.out.println("Today:" + today);

		LocalDate dob = LocalDate.of(2003, 04, 11);
		System.out.println("Date of birth:" + dob);

		Period lifeTime = Period.between(dob, today);
		System.out.println("Your time life:" + lifeTime.getYears() + " years " + lifeTime.getMonths() + " months "
				+ lifeTime.getDays() + " days ");

	}
}
