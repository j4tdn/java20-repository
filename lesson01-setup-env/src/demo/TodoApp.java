package demo;

import java.time.LocalDate;
import java.time.Period;

// ctrl shitf o -> import all libraries

public class TodoApp {
	public static void main(String[] args) {
		//Hàm main - nơi bắt đầu và kết thúc của một chương trình java core
        System.out.println("Welcome to Todo App - 2023");
        System.out.println("\n--------------\n");
        System.out.println("Task 01: Update new version");
        System.out.println("Task 02: Add sum function");
        LocalDate today=LocalDate.now();
        System.out.println("Today: "+today);

        LocalDate dob=LocalDate.of(2003,12,15);
        System.out.println("Day of birth: "+dob);

        Period lifetime=Period.between(dob,today);
        System.out.println("Your time life: "+lifetime.getYears()+" years "+lifetime.getMonths()+" months "+lifetime.getDays()+" days .");
        System.out.println("\n--------------\n");

	}
}
