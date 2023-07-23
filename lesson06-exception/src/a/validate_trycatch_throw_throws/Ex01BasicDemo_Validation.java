package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_Validation {
	/*
	 * 1. Enter a year of birth >> calculate age of candidate
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your Year of Birth = ");
		
		// Cách 1: Xử lý exception với validation(tiền xử lý)
		String text = sc.nextLine();
		
		// validation cho text là dãy số hợp lệ rồi mới gọi hàm parseInt
		while (!text.matches("\\d+")) {
			System.out.print("Please enter a valid number! = ");
			text = sc.nextLine();
		}
		
		int yearOfBirth = Integer.parseInt(text);
		
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));
		
		sc.close();
	}
}
