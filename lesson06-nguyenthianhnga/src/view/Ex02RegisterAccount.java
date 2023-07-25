package view;

import java.util.Scanner;

public class Ex02RegisterAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isValid = false;
		while (!isValid) {
			System.out.print("Enter username: ");
			String username = sc.nextLine();
			System.out.print("Enter your email: ");
			String email = sc.nextLine();
			System.out.print("Enter your password: ");
			String password = sc.nextLine();
			try {
				checkPasswordLength(password);
				checkPasswordDigit(password);
				checkPasswordLowerCase(password);
				checkPasswordUpperCase(password);
				checkPasswordSpecialChar(password);
				checkPasswordNotContainEmailAndUsername(password, email, username);
				isValid = true;
				System.out.println("Your password is valid!");
			} catch (IllegalArgumentException ilae) {
				System.out.println(ilae.getMessage());
			}
		}
	}

	private static void checkPasswordLength(String password) {
		if (password.length() < 8) {
			throw new IllegalArgumentException(
					"Password must contain at least 8 characters and less than 256 characters!");
		}
	}

	private static void checkPasswordUpperCase(String password) {
		if (!password.matches(".*[A-Z].*")) {
			throw new IllegalArgumentException("Password must contain at least one uppercase letter!");
		}
	}

	private static void checkPasswordLowerCase(String password) {
		if (!password.matches(".*[a-z].*")) {
			throw new IllegalArgumentException("Password must contain at least one lowercase letter!");
		}
	}

	private static void checkPasswordDigit(String password) {
		if (!password.matches(".*\\d.*")) {
			throw new IllegalArgumentException("Password must contain at least one digit!");
		}
	}

	private static void checkPasswordSpecialChar(String password) {
		if (!password.matches(".*\\W.*")) {
			throw new IllegalArgumentException("Password must contain at least one special character!");
		}
	}

	private static void checkPasswordNotContainEmailAndUsername(String password, String email, String username) {
		if (password.toLowerCase().contains(email.toLowerCase())) {
			throw new IllegalArgumentException("Password contains email address!");
		}
		if (password.toLowerCase().contains(username.toLowerCase())) {
			throw new IllegalArgumentException("Password contains username!");
		}
	}
}
