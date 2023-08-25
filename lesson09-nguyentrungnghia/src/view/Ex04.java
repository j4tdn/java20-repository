package view;

import java.util.Scanner;

public class Ex04 {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("Tài khoản: ");
				String accountName = ip.nextLine();
				
				System.out.print("Mật khẩu: ");
				String password = ip.nextLine();
				
				if (isValidAccount(password, accountName))
					System.out.println("Tạo tài khoản thành công");
				
				break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
			
		}
		
		ip.close();
	}
	
	private static boolean isValidAccount(String password, String accountName) {
		if (password.length() < 8)
			throw new IllegalArgumentException("Mật khẩu phải có 8 kí tự trở lên");
		
		for (int i = 0; i < password.length(); i++) {
			int count = 0;
			for (int j = 0; j < accountName.length(); j++) {
				if (password.charAt(i) == accountName.charAt(j)) {
					count++;
				}
			}
			if (count > 3)
				throw new IllegalArgumentException("Không được trùng quá 3 ký tự với tên tài khoản");
		}
		
		int countDigits = 0;
		int countUppercaseLetter = 0;
		int countSpecialLetter = 0;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i))) 
				countDigits++;
			else if (Character.isUpperCase(password.charAt(i)))
				countUppercaseLetter++;
			else if (!Character.isLetterOrDigit(0))
				countSpecialLetter++;
		}
		if (countDigits < 1)
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 1 chữ số");
		if (countUppercaseLetter < 1)
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 1 kí tự in hoa");
		if (countSpecialLetter < 1)
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 1 kí tự đặc biệt");
		
		return true;
	}

}
