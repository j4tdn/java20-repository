package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	public static void main(String[] args) {
		//cirtl shift o: import all libraries
		//main -- >> cirtl space : public static void main
		
		System.out.println("Welcome to Todo App - 2023");
		System.out.println("\n== __*****__==\n");		
		System.out.println("Task 01 : Update Version");
		System.out.println("Task 01 : Update Version");
		LocalDate today = LocalDate.now();
		System.out.println("\nHom nay: " + today);
		LocalDate dob = LocalDate.of(2002, 7, 25);
		System.out.println("Day of Birth: " + dob);
			
		Period lifeTime =	Period.between(dob, today);
		System.out.println("Your time life: " 
				+ lifeTime.getYears() 
				+ " years " + lifeTime.getMonths() 
				+ " Months " + lifeTime.getDays() + " Days ");
		System.out.println("\n== __*****__==");
	}
}
