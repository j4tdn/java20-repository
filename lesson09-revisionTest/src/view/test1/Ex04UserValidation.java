package view.test1;

import view.bean.User;
import view.exception.InvalidUserValidation;

public class Ex04UserValidation {

	public static void main(String[] args) {
		
		
	}
	
	private static User validate(User checkUser) throws InvalidUserValidation {
		
		String password = checkUser.getPassword();
		
		if (password.length() < 8) {
			throw new InvalidUserValidation("required length >= 8");
		}
		String specialLetters = "~!@#$%^&*";
		int numberOfDigits = 0;
		int numberOfUpperLetters = 0;
		int numberOfSpecialLetters = 0;
		
		for (int i = 0; i < password.length(); i++) {
			char letter = password.charAt(i);
			if (numberOfDigits == 0 && Character.isDigit(letter) ) {
				numberOfDigits = 1;
				continue;
			}
			
			if (numberOfUpperLetters == 0 && Character.isUpperCase(letter) ) {
				numberOfUpperLetters = 1;
				continue;
			}
			
			if (numberOfSpecialLetters == 0 && specialLetters.contains(String.valueOf(letter))) {
				numberOfSpecialLetters = 1;
			}
		}
		
		require(numberOfDigits, "Required at least one digit");
		require(numberOfUpperLetters, "Required at least one uppercase");
		require(numberOfSpecialLetters, "Required at least one special letter");
		
		String username = checkUser.getUsername();
		
		// 3.
		// b1: loại bỏ các kí tự trùng của pw và us
		// b2: tìm giao --> duyệt từng kí tự trong password, nếu có tồn tại tăng count
		// b3: nếu count > 3 --> exception
		
		return checkUser;
	}

	private static void require(int amount, String message) throws InvalidUserValidation{
		if (amount == 0) {
			throw new InvalidUserValidation(message);
		}
	}
}
