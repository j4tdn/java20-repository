package view;

import java.util.Scanner;

public class Ex04RegisterAccount {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter username: ");
		String username = ip.nextLine();
		while (true) {
			try {
				System.out.println("Enter password: ");
				String password = ip.nextLine();
				System.out.println("Pass valid: " + isValidPassword(password, username));
				ip.close();
				break;
			} catch (IllegalArgumentException iae) {
				iae.printStackTrace();
				System.out.println("Please enter a valid password ");
			}
			
		}
		
	}
	
	private static boolean isValidPassword(String password, String username) {
		int count = 0;
		for (int i = 0; i < username.length(); i++) {
			for (int j = 0; j < password.length(); j++) {
				if (password.charAt(j) == username.charAt(i)) {
					count++;
					if (count == 3) {
						System.out.println("Exceed amount of duplicate characters");
						return false;
					}
				}
			}
		}
		
		if (password.length() < 8) {
			throw new IllegalArgumentException("Password must be more than 8 characters");
		}
		if (!password.matches(".*[a-z].*") || !password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Have at least 1 lowercase and 1 uppercase character");
		}
		if (password.matches("\\d") || !password.matches(".*[^a-zA-Z0-9 ].*")) {
			throw new IllegalArgumentException("Contains at least 1 numeric and 1 special character");
		}
		return true;
	}	
	
}
