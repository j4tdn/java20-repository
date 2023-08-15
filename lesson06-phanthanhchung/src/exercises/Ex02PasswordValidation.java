package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02PasswordValidation {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter the password: ");
				validatePassword(sc.nextLine());
				System.out.println(">------ Password accepted, congratulation! ------<");
				break;
			} catch(InputMismatchException e) {
				System.out.println("--> " + e.getMessage());
			}
		}while(true);
		
		System.out.println(">--- Program finished ---<");
	}
	
	private static void validatePassword(String password) throws InputMismatchException{
		boolean lowercaseflag = false, uppercaseflag = false, numflag = false, specflag = false;
		String[] numbers = {"1","2","3","4","5","6","7","8","9","0"};
		String[] specialcharacters = {"~","!","@","#","$","%","^","&","*","(",")","-","_","=","+","[","]","{","|",";",":",".",",","<",">","/","?"};
		String[] lowercaseAlphabet = new String[26];
		String[] uppercaseAlphabet = new String[26];
		for(int i = 0; i < 26; i++) {
			char letter = (char) ('a' + i);
			lowercaseAlphabet[i] = String.valueOf(letter);
			uppercaseAlphabet[i] = String.valueOf(Character.toUpperCase(letter));
		}
		if(password.length() < 8 || password.length() > 128)
			throw new InputMismatchException("Length must be between 8 and 128 characters. ");
		
		for(String i : numbers) {
			if(password.contains(i))
				numflag = true;
		}
		
		for(int i = 0; i <= 25; i++) {
			if(password.contains(lowercaseAlphabet[i]))
				lowercaseflag = true;
			if(password.contains(uppercaseAlphabet[i]))
				uppercaseflag = true;
		}
		
		for(String i : specialcharacters) {
			if(password.contains(i))
				specflag = true;
		}
		
		StringBuilder sb = new StringBuilder();
		
		if(!numflag) sb.append("Password must contain at least 1 number [0-9]");
 		if(!lowercaseflag) sb.append("\n -  Password must contain at least 1 lowercase character [a-z]");
 		if(!uppercaseflag) sb.append("\n -  Password must contain at least 1 uppercase character [A-Z]");
 		if(!specflag) sb.append("\n -  Password must contain special characters (-!@#$%^&* ( ) -_=+[]{1;:,.<>/?)");
 		if(sb.length() > 0) throw new InputMismatchException(sb.toString());
	}
}
