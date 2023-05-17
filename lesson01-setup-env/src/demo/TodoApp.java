package demo;

import java.time.LocalDate;
import java.time.Period;

public class TodoApp {
	//ctrl shift o : import all thư viện đang thiếu
	public static void main(String[] args) {
	    //Hàm main -Nơi bắt đầu và kết thúc
	    //của một chương trình JAVA core
	    System.out.println("Welcome to TodoApp-2023");
	    System.out.println("\n==__********__==\n");
	    System.out.println("Sum function");
	    System.out.println("Sub function");
	    LocalDate today = LocalDate.now();
	    System.out.println("\nToday: "+today);
	    LocalDate dob = LocalDate.of(2001, 01, 13);
	    System.out.println("\nDay of Birth : "+dob);
	    Period duration = Period.between(dob,today);
	    System.out.println("\nLife of time : "
	    +duration.getYears() 
	    +"Year "+duration.getMonths()
	    +"Month "+duration.getDays()+"Days");
	    System.out.println("\n==__********__==\n");
	}
}
