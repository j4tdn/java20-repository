package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_Validation {

	/*
	 * 1.
	 */

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter your Year of Birth = ");
		// cách 1: xử lý exception với validation( tiền xử lý)
		String text = ip.nextLine();

		// validate cho text là dãy số hợp lệ rồi mới gọi hàm parseInt
		while (text.matches("\\d+")) {
			System.out.println("Please enter a valid number = ");
			text = ip.nextLine();
		}

		int yearOfBirth = Integer.parseInt(text);

		System.out.println("AGE--> " + (Year.now().getValue() - yearOfBirth + 1));
	}
}
