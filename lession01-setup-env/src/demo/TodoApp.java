package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	
	//crtl shift o: import all libraries
	//main --> ctrl space --> public static void main ...
	// // --> chú thích, ko được biên/thông dịch lúc chạy
	
	public static void main(String[] args) {
		// Hàm main - Nơi bắt đầu và kết thúc
		// của một chương trình JAVA core
			
		System.out.println("Welcome to Todo App - 2023");

		System.out.println("\n==__******__==\n");

		System.out.println("Task 01: Update new version");
		System.out.println("Task 02: Add sum function\n");

		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);

		LocalDate dob = LocalDate.of(2003,01,15);
		System.out.println("Day of birth: " + dob);

		Period lifetime = Period.between(dob, today);
		System.out.println("Your time life: " 
				+ lifetime.getYears() + " years "
				+ lifetime.getMonths() + " months "
				+ lifetime.getDays() + " days ") ;

		System.out.println("\n==__******__==");	
	}
}
