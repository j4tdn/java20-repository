package exercises;	

import java.io.IOException;
import java.util.Scanner;

public class Ex02Demo {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean isValid = false;
		String password = "";
		while(!isValid) {
			password = inputPassword();			
			try {
				isAtLeast8chars(password);
				isAtMost256chars(password);
				isAtLeastOneLowerCase(password);
				isAtLeastOneUpperCase(password);
				isAtLeastOneNumber(password);
				isAtLeastOneSpecialCharacter(password);
				isValid = true;
				System.out.println("PASSWORD IS " + password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finished");
	}
	
	public static void isAtLeast8chars(String passowrd) throws IOException {
		if(passowrd.length() < 8) {
			throw new IOException("Password must contain at least 8 characters"); 
		}
	}
	
	public static void isAtMost256chars(String password) throws IOException{
		if(password.length() > 256) {
			throw new IOException("Password must contain at most 256 characters"); 
		}
	}
	
	public static void isAtLeastOneLowerCase(String password) throws IOException{
		boolean isConditional = false;
		for(int i = 0 ;i < password.length();i++) {
			if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				isConditional = true;
			}
		}
		if(!isConditional) {
			throw new IOException("Password must contain at least 1 lower character");
		}
	}
	
	public static void isAtLeastOneUpperCase(String password) throws IOException{
		boolean isConditional = false;
		for(int i = 0 ;i < password.length();i++) {
			if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
				isConditional = true;
			}
		}
		if(!isConditional) {
			throw new IOException("Password must contain at least 1 upper character");
		}
	}
	
	public static void isAtLeastOneNumber(String password) throws IOException{
		boolean isConditional = false;
		for(int i = 0 ;i < password.length();i++) {
			if(password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				isConditional = true;
			}
		}
		if(!isConditional) {
			throw new IOException("Password must contain at least 1 number");
		}
	}
	
	public static void isAtLeastOneSpecialCharacter(String password) throws IOException{
		boolean isConditional = false;
		String specialCharacters = "~`!@#$%^&*()-_=+\\\\|[{]};:'\\\",<.>/?";
		for(int i = 0 ;i < password.length();i++) {
			if(specialCharacters.indexOf(password.charAt(i)) != -1) {
				isConditional = true;
			}
		}
		if(!isConditional) {
			throw new IOException("Password must contain at least 1 special character");
		}
	}
	
	public static String inputPassword() {
		System.out.println("Enter password: ");
		String pass = scanner.nextLine();
		return pass;
	}
}
