package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BasicDemo_TryCatch {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your Year of Birth = ");
		
		int yearOfBirth = 0;
		
		while(true) {
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.println("nfe --> " + nfe.getMessage());
				nfe.printStackTrace();
				System.out.println("Please enter a valid number = ");

			}
		}
		
		System.out.println("Age --> " +(Year.now().getValue()- yearOfBirth +1));
		ip.close();
	}

}
