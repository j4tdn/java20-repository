package view;

import java.util.Scanner;

public class Ex03ValidEmail {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner ip = new Scanner(System.in);
				System.out.println("Enter email: ");
				String email = ip.nextLine();
				
				System.out.println(isValidEmail(email));
				ip.close();
				break;
			} catch (IllegalArgumentException iae) {
				iae.printStackTrace();
				System.out.println("Email invalid, please enter again");
			}
		}
	}
	
	private static boolean isValidEmail(String email) {
		if (!email.matches("^[a-zA-Z][a-zA-Z0-9\\-_]+@gmail.com$")) {
			throw new IllegalArgumentException("Enter the wrong format");
		}
		return true;
	}
}
