package view;

import java.util.Scanner;

public class Ex02RegisterAccount {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		String password;
		String result;
		while(true) {
			try {
				System.out.println("enter Password: ");
				password = ip.nextLine();
				result = creativeAPassword(password);
				break;
			} catch (Exception e) {
				System.out.println("please re-enter for PassWord: ");
				
			}
		}
		System.out.println("password: " + result);
		ip.close();
	}
	
	private static String creativeAPassword(String passwords) {
		int countUper = 0;
		int countLower = 0;
		int countNumber = 0;
		int countSpecial = 0;
		if(passwords.length() < 8 || passwords.length() > 256) {
			throw new ArrayIndexOutOfBoundsException("error length: ");
		}
		for(int i = 0; i < passwords.length(); i++) {
			char c = passwords.charAt(i);
			if(Character.isUpperCase(c)){
				countUper++;
				continue;
			}if(Character.isLowerCase(c)) {
				countLower++;
				continue;
			}if(Character.isLetterOrDigit(c)) {
				countNumber++;
				continue;
			}
			else {
				countSpecial++;
			}
		}
			if(countLower < 1 || countUper < 1 || countNumber < 1 || countSpecial < 1) {
				throw new NumberFormatException("error!!!");
			}
		
		return passwords;
	}
	
}
