package view;

import java.util.Scanner;

public class Ex03CheckEmail {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String Email = "";
		String result = "";
		while(true) {
			try {
				System.out.println("nhap dia chi email: ");
				Email = ip.nextLine();
				result = CheckEmail(Email);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println("Error Email. Please Enter Your Email: ");
			}
		}
		System.out.println("Email: " + result);
		ip.close();
	}
	
	private static String CheckEmail(String Email){
		if(Email.contains("@gmail.com")) {
			return Email;
		}else {
			throw new IllegalArgumentException("Error Email!!!");
		}
	}
}
