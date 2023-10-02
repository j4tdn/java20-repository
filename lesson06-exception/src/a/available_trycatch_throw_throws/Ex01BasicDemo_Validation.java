package a.available_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

/**
 * Enter a year of birth >> Calculate age of candidate
 */
public class Ex01BasicDemo_Validation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Year of Birth = ");
		
		//Cách 1: Xử lý exception với validation (tiền xử lý)
		String text = sc.nextLine();
		
		//validation cho text là dãy số hợp lệ rồi mới gọi hàm parseInt()
		while(!text.matches("\\d+")) {
			System.out.print("Please enter a value number = ");
			text = sc.nextLine();
		}
		
		int yearOfBirth = Integer.parseInt(text);
		
		System.out.println("Age --> " + (Year.now().getValue()-yearOfBirth));
		
		sc.close();
	}
	/*
	 * 	Exception in thread "main" java.lang.NumberFormatException: For input string: "122sas"
		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		at java.base/java.lang.Integer.parseInt(Integer.java:668)
		at java.base/java.lang.Integer.parseInt(Integer.java:784)
		at view.Ex01BasicDemo.main(Ex01BasicDemo.java:15)
	 */
}
