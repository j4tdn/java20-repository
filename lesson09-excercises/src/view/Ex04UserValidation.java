package view;

import bean.User;
import exception.InvalidUserValidation;

public class Ex04UserValidation {
	public static void main(String[] args) {
		try {
			validate(new User("asdas221a", "asd21ads"));
		} catch (InvalidUserValidation e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static User validate(User checkUser) throws InvalidUserValidation{
		String password = checkUser.getPassword();
		
		if(password.length() < 8) {
			throw new InvalidUserValidation("require lenght >= 8");
		}
		String special = "~!@#$%^&*"; 
		int amountOfDigit = 0;
		int amountOfUpperCase = 0;
		
		int amountOfSpecial = 0;
		for(int i = 0; i < password.length(); i++) {
			char letter = password.charAt(i);
			if(amountOfDigit == 0 && Character.isDigit(letter)) {
				amountOfDigit = 1;
				continue;
			}
			if(amountOfUpperCase == 0 && Character.isDigit(letter)) {
				amountOfUpperCase = 1;
				continue;
			}	
			if(amountOfSpecial == 0 && special.contains(String.valueOf(letter))) {
				amountOfUpperCase = 1;
				continue;
			}
			
		}
		
		require(amountOfDigit, "require at least on digit letter");
		require(amountOfUpperCase, "require at least on UpperCase letter");
		require(amountOfSpecial, "require at least on Special letter");
		
		
		return checkUser;
	}
	private static void require (int amount, String message) throws InvalidUserValidation {
		if(amount == 0) {
			throw new InvalidUserValidation(message);
		}
	}
	
	
}
