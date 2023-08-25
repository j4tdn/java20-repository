package view;

import java.util.Scanner;

/*
 * 	Viết chương trình thực hiện chức năng đăng ký tài khoản
	B1. Nhập tên tài khoản ví dụ byztkhx256
	B2. Nhập mật khẩu admin123
	
	Yêu cầu mật khẩu như sau:
	1. Độ dài mật khẩu: >= 8
	2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
	3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
	Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
	
 */
public class Ex04SignUp {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		System.out.print("Enter a account name: ");
		String accountName = sc.nextLine();
		String password;
		do {
			System.out.print("Enter a password: ");
			password = sc.nextLine();
			if (checkSignUp(accountName, password)) {
				break;
			}

		} while (true);

		System.out.println("\naccountName --> " + accountName);
		System.out.println("password --> " + password);
		System.out.println("\nĐăng ký tài khoản thành công!");

		sc.close();
	}
	
	private static boolean checkSignUp(String account, String password) {
		if(checkPassword(password) && checkPassword(account, password)) {
			return true;
		}
		return false;
	}
	private static boolean checkPassword(String password) {
		if(password.length() >=8 && password.matches("^(?=.*\\d)(?=.*[A-Za-z])(?=.*[~!@#$%^&*]).+$")) {
			return true;
		}
		return false;
	}
	
	private static boolean checkPassword(String account, String password) {
		int count = 0;
		for(Character c : password.toCharArray()) {
			if(account.indexOf(c) >= 0) {
				count++;
			}
		}
		return (count >= 3) ? true : false;
	}
}
