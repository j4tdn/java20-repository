import java.util.Scanner;

import bean.Condition;

public class Ex02 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		while (true) {
			System.out.print("Nhập mật khẩu: ");
			String pw = ip.nextLine();
			try {
				if (isValidPassword(pw)) {
					System.out.println("Tạo tài khoản thành công");
					break;
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}

		ip.close();
	}

	public static boolean isValidPassword(String pw) {
		int length = pw.length();

		if (length < 8 || length > 256)
			throw new RuntimeException("Mật khẩu phải có tối thiểu 8 kí tự và tối đa 256 kí tự");

		// At least 1 lowercase alphabetic character
		if (!condition(pw, ch -> Character.isLowerCase(ch)))
			throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 chữ cái viết thường");

		// At least 1 uppercase alphabetic character
		if (!condition(pw, ch -> Character.isUpperCase(ch)))
			throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 chữ cái viết hoa");

		// At least 1 number
		if (!condition(pw, ch -> Character.isDigit(ch)))
			throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 chữ số");

		// At least 1 special character
		if (!condition(pw, ch -> isSpecialCharacter(ch)))
			throw new RuntimeException("Mật khẩu phải chứa ít nhất 1 ký tự đặc biệt");

		return true;
	}

	public static boolean isSpecialCharacter(char ch) {
		if (Character.isLetterOrDigit(ch))
			return false;
		return true;
	}

	public static boolean condition(String pw, Condition c) {
		for (int i = 0; i < pw.length(); i++) {
			char ch = pw.charAt(i);
			if (c.test(ch))
				return true;
		}
		return false;
	}

}
