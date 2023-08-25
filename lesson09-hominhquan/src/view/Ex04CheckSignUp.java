package view;


public class Ex04CheckSignUp {
	public static void main(String[] args) {
		String account = "byztkhx256";
		String password = "AdMin1234.";
		
		boolean result = CheckSignUp(account, password);
		if(result == true) {
			System.out.println("sign up account success!!");
		}else {
			System.out.println("error sign up accout please reSignUp!!");
		}
	}
	private static boolean CheckSignUp(String account, String password) {
		int countUper = 0;
		int countLower = 0;
		int countNumber = 0;
		int countSpecial = 0;
		if(password.length() < 8) {
			throw new ArrayIndexOutOfBoundsException("error length: ");
		}
		for(int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
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
			throw new NumberFormatException("error pass word!!!");
		}	
		
		if(!CheckPassAccount(account, password)) {
			throw new NumberFormatException("account not coincide password > 3 letter!!! ");
		}
		
		return true;
		
		
		
	}
	private static boolean CheckPassAccount(String account, String password) {
		int count = 0;
		for(int i = 0; i < account.length(); i++) {
			char c = account.charAt(i);
			for(int j = 0; j < password.length(); j++) {
				if(c == password.charAt(j)) {
					count++;
				}
			}
		}
		if(count < 3) {
			return true;
		}else{
			return false;
		}
	}
}
