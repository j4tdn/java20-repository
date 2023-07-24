package view;

import java.util.Scanner;

import common.PasswordCondition;

public class Ex02IsValidPassWord {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			try {
				String password = ip.nextLine();
				System.out.println("password: " + password + " --> " + isValidPassword(password));
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
				System.out.println("Please enter a valid password!");
			}
		}
		System.out.println("Finished!!!");
		
		ip.close();
	}

	private static boolean isValidPassword(String password) {
		int passwordLength = password.length();

		if (passwordLength < 8) {
			throw new IllegalArgumentException("password must contain at least 8 characters!");
		}

		if (passwordLength > 256) {
			throw new IllegalArgumentException("password must contain at most 256 characters!");
		}

		if (!checkPassword(password, c -> Character.isLowerCase(c))) {
			throw new IllegalArgumentException("password must contain at least 1 lowercase alphabetic character!");
		}

		if (!checkPassword(password, c -> Character.isUpperCase(c))) {
			throw new IllegalArgumentException("password must contain at least 1 uppercase alphabetic character!");
		}

		if (!checkPassword(password, c -> Character.isDigit(c))) {
			throw new IllegalArgumentException("password must contain at least 1 number!");
		}

		if (!checkPassword(password, c -> {
			String specialChar = "~`!@#$%^&*()-_=+\\\\\\\\|[{]};:'\\\\\\\",<.>/?";
			return specialChar.contains(String.valueOf(c));
		})) {
			throw new IllegalArgumentException("password must contain at least 1 special character!");
		}

		return true;
	}

	private static boolean checkPassword(String password, PasswordCondition passwordCondition) {
		for (int i = 0; i < password.length(); i++) {
			if (passwordCondition.test(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
