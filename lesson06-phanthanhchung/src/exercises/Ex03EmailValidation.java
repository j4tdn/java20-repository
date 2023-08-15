package exercises;

import java.util.InputMismatchException;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Ex03EmailValidation {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			try {
				System.out.print("Please enter the email: ");
				validateEmail(sc.nextLine());
				System.out.println(">------ Valid email, congratulation! ------<");
			    break;
			} catch (InputMismatchException ime) {
				System.out.println(ime.getMessage());
			}
		} while (true);
		System.out.println(">--- Program finished ---<");
	}
	
	private static void validateEmail(String email) throws InputMismatchException{
		String regex = "[a-z\\d]+(\\.?-?_?[a-z\\d]+)*@mail\\.com";
		boolean isValid = Pattern.matches(regex, email);
		if(!isValid) 
			throw new InputMismatchException("--> Your email is invalid");
		return;
	}
}
