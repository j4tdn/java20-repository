package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_Validation {
	
	/**
	 * 1. Enter a year of birth >> Calculate age of candidate
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your Year of Birth = ");
		
		// Cách 1: Xử lý exception với validation(tiền xử lý)
		String text = ip.nextLine();
		
		// validate cho text là dãy số hợp lệ rồi mới gọi hàm parseInt
		while(!text.matches("\\d+")) {
			System.out.print("Please enter a valid number = ");
			text = ip.nextLine();
		}
		
		int yearOfBirth = Integer.parseInt(text);

		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));
		
		ip.close();
	}
	/*
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
		at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
		at java.base/java.lang.Integer.parseInt(Integer.java:668)
		at java.base/java.lang.Integer.parseInt(Integer.java:786)
		at view.Ex01BasicDemo.main(Ex01BasicDemo.java:15)
	 */
	
}
