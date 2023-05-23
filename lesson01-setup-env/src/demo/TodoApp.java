package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	public static void main(String[] args) {
		// Hàm main -- Nơi bắt đầu và kết thúc 
		// của một chương trình JAVA core
		//ctrl shift o: import all libraries
		// // --> chú thích, ko được biên/ thông dịch lúc chạy
				 
			System.out.println("Welcome to Todo App - 2023");
				
			System.out.println("\n==__******__==\n");

			System.out.println("Task01: Update Version");
			System.out.println("Task02: Add sum function");

			LocalDate today = LocalDate.now();
			System.out.println("\nToday: " + today);

			LocalDate dob = LocalDate.of(2001, 04, 15);
			System.out.println("Day Of Birth: " + dob);

			Period lifeTime = Period.between(dob, today);
			System.out.println("Your time life: " + lifeTime.getYears() + " years " 
										  		  + lifeTime.getMonths() + " months " 
										  		  + lifeTime.getDays() + " days ");

			System.out.println("\n==__******__==");

			}
	}

