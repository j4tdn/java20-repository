package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex03EmailValidation {
	private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9]+([._-][A-Za-z0-9]+)*@mail.com$");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		boolean isValid = false;
		while (!isValid) {
			try {
				System.out.print("Enter your email: ");
				email = sc.nextLine().trim();
				if (!EMAIL_PATTERN.matcher(email).matches()) {
					throw new IllegalArgumentException("Email address is not valid. Please re-enter!");
				}
				isValid = true;
			} catch (IllegalArgumentException ex) {
				System.out.println(ex.getMessage());

			}

		}
		System.out.println("Email address is valid!");
	}
}
