package demo;
import java.time.LocalDate;
import java.time.Period;
public class TodoApp {
	public static void main(String[] args) {
		public static void main(String[] args){
			System.out.println(“Welcome to Todo App - 2023”);
			System.out.println(“\n== __*****__==\n”);
			System.out.println(“Task 01:Update Version”);
			System.out.println(“Task 02:Add sum function”);
		LocalDate today = LocalDate.now();
			System.out.println(“Hom nay: ”+today);
		LocalDate dob= LocalDate.of(2003,10,05);
			System.out.println(“Day of birth: ”+dob);
		Period lifeTime = Period.between(dob, today);
			System.out.println(“Your time life:”+lifeTime.getYears()+”years”+lifeTime.getMonths()+”months”+lifeTime.getDays()+”days”);
			System.out.println(“\n== __*****__==\n”);
		}
	}

