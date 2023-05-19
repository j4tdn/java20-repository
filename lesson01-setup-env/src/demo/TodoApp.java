package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	public static void main(String[] args) {
		//ctrl shift o :import all libraries
		//Ham main- Noi bat dau va ket thuc
        // cua mot chuong trinh JAVA core
        System.out.println("Welcome to Todo App - 2023");

        System.out.println("\n==__*****__==\n");

        System.out.println("Task01: Update version");
        System.out.println("Task02: Add sum Function");

        LocalDate today = LocalDate.now();
        System.out.println("\nToday: " +today);

        LocalDate dob = LocalDate.of(2002, 03, 07);
        System.out.println("Day of birth: " +dob);

        Period lifeTime = Period.between(dob, today);
        System.out.println("Your time life: " + lifeTime.getYears() + " years "
        									+ lifeTime.getMonths() + " months " 
        									+ lifeTime.getDays() + " days ");

        System.out.println("\n==__*****__==");
	}
}
