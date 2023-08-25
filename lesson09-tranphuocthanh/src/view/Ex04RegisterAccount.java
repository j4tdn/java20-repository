package view;

import java.util.Scanner;
import java.util.function.Predicate;

import bean.Student;

public class Ex04RegisterAccount {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("nhập tên tài khoản: ");
		String username = ip.nextLine();

		System.out.println("nhập mật khẩu: ");
		String password = ip.nextLine();

		System.out.println(isValid(username, password));
	}

	private static boolean isValid(String username, String password) {
		if (password.length() < 8) {
			throw new IllegalArgumentException("Mật khẩu phải từ 8 kí tự trở lên !!!");
		}

		String specialChar = "~!@#$%^&*";
		
		if (!checkPassword(password, ch -> Character.isDigit(ch))) {
			throw new IllegalArgumentException("mật khẩu phải có ít nhất 1 chữ số");
		}

		if (!checkPassword(password, ch -> Character.isUpperCase(ch))) {
			throw new IllegalArgumentException("mật khẩu phải có ít nhất 1 kí tự in hoa");
		}
		if (!checkPassword(password, ch -> specialChar.contains(String.valueOf(ch)))) {
			throw new IllegalArgumentException("mật khẩu phải có ít nhất 1 kí tự đặc biệt");
		}
		
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
				if (username.contains(String.valueOf(password.charAt(i)))) {
					count++;
				}
			}
		if (count > 3) {
			throw new IllegalArgumentException("Không được trùng quá 3 ký tự với tên tài khoản");
		}
		
		return true;

	}
	

	private static boolean checkPassword(String password, Predicate<Character> predicate) {
		for (int i = 0; i < password.length(); i++) {
			if (predicate.test(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
}
