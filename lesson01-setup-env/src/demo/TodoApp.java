package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	
	// ctrl shift o: import all libraries
	
	public static void main(String[] args) {
		// hàm main là nơi bắt đầu-kết thúc
		// của một chương trình JAVA core
		System.out.println("Welcome to Todo App - 2023\n");
		System.out.println("Task 01: Update Version");

		LocalDate today = LocalDate.now();
		System.out.println("\nToday:" + today);

		LocalDate dob = LocalDate.of(2004, 2, 24);
		System.out.println("\nDay Of Birth:" + dob);

		Period lifeTime = Period.between(dob, today);
		System.out.println("Your time life: " + lifeTime.getYears() + " years " 
				+ lifeTime.getMonths() + " months "
				+ lifeTime.getDays() + " days ");
	}
}
