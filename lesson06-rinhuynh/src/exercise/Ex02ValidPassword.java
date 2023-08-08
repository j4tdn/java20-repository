package exercise;

import java.util.Scanner;

public class Ex02ValidPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String pass;
		do {
			System.out.print("\nEnter your password: ");
			pass = sc.nextLine();
		} while (!checkPasswordExceptions(pass));

		sc.close();
		
		System.out.println("Sign up Succesful!!!");
	}

	private static boolean checkPasswordExceptions(String password) {
		int countLC = 0, countUC = 0, countNum = 0, countSpec = 0;
		System.out.println();
		if (password.length() < 8 || password.length() > 256) {
			System.out.println("Password Requirements: At least 8 characters and at most 256 characters");
			return false;
		}

		for (int i = 0; i < password.length(); i++) {
			char chrt = password.charAt(i);
			if (Character.isLowerCase(chrt)) {
				countLC++;
			} else if (Character.isUpperCase(chrt)) {
				countUC++;
			} else if (Character.isDigit(chrt)) {
				countNum++;
			} else {
				countSpec++;
			}
		}

		if (countLC == 0 || countUC == 0 || countNum == 0 || countSpec == 0) {
			System.out.println("Password Requirements:");
			if (countLC == 0) {
				System.out.println("At least 1 lowercase alphabetic character(a, b, c, ...)");
			}
			if (countUC == 0) {
				System.out.println("At least 1 uppercase alphabetic character(A, B, C, ...)");
			}
			if (countNum == 0) {
				System.out.println("At least 1 number(1, 2, 3, ...)");
			}
			if (countSpec == 0) {
				System.out.println("At least 1 special character(~!@#$%^&*()-_=+[]{}:;,.<>?/)");
			}
			return false;
		} else {
			return true;
		}
	}

}
