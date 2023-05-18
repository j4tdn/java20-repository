package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	// ctrl shift o: import all libraries
	public static void main(String[] args) {
		// Ham main - Noi bat dau va ket thuc
        // cua mot chuong trinh JAVA core
        System.out.println("Welcome to Todo App - 2023");

        System.out.println("\n==__******__==\n");

        System.out.println("Task 01: Update version");
        System.out.println("Task 02: Add sum function");

	    LocalDate today = LocalDate.now();
	    System.out.println("\nHôm nay: " + today);

	    LocalDate dob = LocalDate.of(1995,9,25);
  	    System.out.println("Day Of Birth: " + dob);

	    Period lifeTime = Period.between(dob, today);
	    System.out.println("Your time life: " 
				  + lifeTime.getYears() + " years "
				  + lifeTime.getMonths() + " months "
				  + lifeTime.getDays() + " days");
        System.out.println("\n==__******__==");
	}
}
