package view;

import java.util.Scanner;

public class Exercises04 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập tên tài khoản: ");
		String username = ip.nextLine();

		String password;
		do {
			System.out.print("Nhập mật khẩu: ");
			password = ip.nextLine();
		} while (!isValidPassword(username, password));

		System.out.println("Đăng ký tài khoản thành công!");
		ip.close();
	}

	private static boolean isValidPassword(String username, String password) {
		if (password.length() < 8) {
			return false;
		}

		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasSpecialChar = false;

		for (char ch : password.toCharArray()) {
			if (Character.isDigit(ch)) {
				hasDigit = true;
			} else if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			} else if ("~!@#$%^&*".indexOf(ch) != -1) {
				hasSpecialChar = true;
			}
		}

		if (!hasDigit || !hasUpperCase || !hasSpecialChar) {
			return false;
		}

		for (int i = 0; i <= username.length() - 3; i++) {
			String substring = username.substring(i, i + 3);
			if (password.contains(substring)) {
				return false;
			}
		}

		return true;
	}
}
