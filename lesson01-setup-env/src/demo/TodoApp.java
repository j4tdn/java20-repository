package demo;

import java.time.LocalDate;
import java.time.Period;

//Ctrl + shift + o: Import tất cả những thư viện cần thiết vào


public class TodoApp{
	public static void main(String[] args){
		// Hàm main - Nơi bắt đầu và kết thúc của 1 chương trình JAVA core
		System.out.println("Welcome to Todo App - 2023");
		System.out.println("\n==___****__==\n");

		System.out.println("Task01: Update Version");
		System.out.println("Task02: Add sum function\n");
		
		LocalDate today = LocalDate.now();
		System.out.println("Today: " + today);
		
		LocalDate dob = LocalDate.of(1995, 9, 25);
		System.out.println("Day Of Birth: " + dob);
		
		Period lifeTime = Period.between(dob, today);
		System.out.println("Your time life: " 
					+ lifeTime.getYears() + " years "
					+ lifeTime.getMonths() + " months "
					+ lifeTime.getDays() + " days ");		

		System.out.println("\n==___****__==");
		
	
	}
}