package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex01BasicDemo_Validation {
	public static void main(String[] args) {
		Scanner ip =  new Scanner(System.in);
		System.out.print("enter your Year Of Birth = ");
		
		//c1; xu ly exception voi  validation(tien xu ly);
		String text = ip.nextLine();
		
		while(!text.matches("\\d+")) {
			System.out.print("Please Enter a Valid Number= ");
			text = ip.nextLine();
		}
		int yearOfBirth = Integer.parseInt(text);
		
		System.out.println("age--> " + (Year.now().getValue() - yearOfBirth ));
		
		ip.close();
	}
}
