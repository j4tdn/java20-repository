package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BasicDemo_TryCatch {
	public static void main(String[] args) {
		Scanner ip =  new Scanner(System.in);
		System.out.print("enter your Year Of Birth = ");
		
		//c2: xu ly exception voi  try catch;
		int yearOfBirth = 0;
		while(true) {
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				nfe.printStackTrace();
				System.out.print("Please Enter a Valid Number= ");
			}
		}
	
		
		System.out.println("age--> " + (Year.now().getValue() - yearOfBirth ));
		
		ip.close();
	}
}
