package view;

import java.util.Scanner;

public class Ex02HomeWork {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner ip = new Scanner(System.in);
				System.out.println("Enter password: ");
				String pw = ip.nextLine();
				System.out.println("Pass : " + isValidPassword(pw));
				ip.close();
				break;
			} catch (IllegalArgumentException iae) {
				iae.printStackTrace();
				System.out.println("Please enter a valid password");
			}
		}
	}
	private static boolean isValidPassword(String pw) {
		if (pw.length() < 8 || pw.length() > 256) {
			throw new IllegalArgumentException("Exceeded allowed characters");
		}
		if (!pw.matches(".*[a-z].*") || !pw.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Have at least 1 lowercase and 1 uppercase character");
		}
		if (!pw.matches("\\d") || !pw.matches(".*[^a-zA-Z0-9 ].*")) {
			throw new IllegalArgumentException("Contains at least 1 numeric and 1 special character");
		}
		return true;
	}	
}
