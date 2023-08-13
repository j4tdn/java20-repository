package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_Validation {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter your Year of Birth = ");
		
		// Cách 1: Xử lý exception với validation(tiền xử lý)
		String text = ip.nextLine();
		
		while (!text.matches("\\d+")) {
			System.out.println("Please enter a valid number = ");
			text = ip.nextLine();
		}
		
		int yearOfBirth = Integer.parseInt(text);
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));
		
		ip.close();
	}
}
