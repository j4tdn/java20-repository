package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BasicDemo_TryCatch {
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		int yearOfBirth;
		System.out.print("Enter your Year of Birth = ");
		while(true) {
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
				System.out.print("Please enter a valid number = ");
			}
		}
		System.out.println("Age --> " + (Year.now().getValue() - yearOfBirth + 1));
		
		ip.close();
	}
}
