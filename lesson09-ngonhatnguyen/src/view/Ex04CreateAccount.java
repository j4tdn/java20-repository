package view;

import java.util.Scanner;

public class Ex04CreateAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("/n    **___Đăng ký__** \n");
		System.out.println("Nhập tên tài khoản: ");
		String account = sc.nextLine();

		System.out.println("Nhập mật khẩu: ");
		String password;
		do {
			System.out.print("Enter a password: ");
			password = sc.nextLine();
			if (checkPasswordExceptions(password, account)) {
				break;
			}

		} while (true);
		System.out.println("\n    **___Đăng ký thành công!___** \n");
	}

	private static boolean checkPasswordExceptions(String password, String acc) {
		int countLC = 0, countUC = 0, countNum = 0, countSpec = 0, countDup = 0;
		System.out.println();
		if (password.length() < 8) {
			System.out.println("Mật khẩu Bắt buộc có: Độ dài mật khẩu phải >= 8");
			return false;
		}

		for (int i = 0; i < password.length(); i++) {
			char chrt = password.charAt(i);
			if (Character.isLowerCase(chrt)) {
				countLC++;
			} else if (Character.isUpperCase(chrt)) {
				countUC++;
			} else if (Character.isDigit(chrt)) {
				countNum++;
			} else {
				countSpec++;
			}

			if (acc.indexOf(password.codePointAt(i)) >= 0) {
				countDup++;
			}
		}

		if (countUC == 0 || countNum == 0 || countSpec == 0) {
			System.out.println("Mật khẩu Bắt buộc:");
			System.out.println(" Có ít nhất 1 kí tự in hoa, ít nhất 1 chữ số, ít nhất 1 kí tự đặc biệt.");

			return false;
		}
		if (countDup > 3) {
			System.out.println("Không được trùng quá 3 kí tự với tên tài khoản.");
			return false;
		}
		return true;
	}
}
