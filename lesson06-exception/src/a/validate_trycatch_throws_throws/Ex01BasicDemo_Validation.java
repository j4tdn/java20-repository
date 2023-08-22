package a.validate_trycatch_throws_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_Validation {
	/*
	 * 1. Enter a year of birth >> Calculate age of candidate
	 */
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter your Year of Birth = ");
		
		// Cách 1: Xử lý validation với validation(tiền xử lý)
		String text = ip.nextLine();
		
		// validate cho text là dãy số hợp lệ rồi mới gọi hàm parseInt
		while(!text.matches("\\d+")){
			System.out.println("Please enter valid number = ");
			text = ip.nextLine();
		}
		
		int yearOfBirth = Integer.parseInt(text);
		
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));

		ip.close();
	}

}
