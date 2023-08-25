package view;

import java.util.Scanner;

import bean.AccountCondition;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tài khoản: ");
		String username = sc.nextLine();
		System.out.print("Nhập mật khẩu: ");
		String password = sc.nextLine();
		
		boolean IsPassHasAtLeast8Chars = isValidAccount(username, password, (user,pass) -> {
			 return pass.length() >= 8;
		});
		
		boolean IspassHasAtLeastOneDigit = isValidAccount(username, password, (user,pass) ->{
			for(int i = 0;i< pass.length();i++) {
				char c = pass.charAt(i);
				if(Character.isDigit(c)) {
					return true;
				}
			}
			return false;
		});
		
		boolean IspassHasAtLeastOneUpperCase = isValidAccount(username, password, (user,pass) ->{
			for(int i = 0;i< pass.length();i++) {
				char c = pass.charAt(i);
				if(Character.isUpperCase(c)) {
					return true;
				}
			}
			return false;
		});
		
		boolean IspassHasAtLeastOneSpecialChar = isValidAccount(username, password, (user,pass) ->{
			String specialChars = "~!@#$%^&*";
			for(int i = 0;i< pass.length();i++) {
				char c = pass.charAt(i);
				if(specialChars.contains(c+"")) {
					return true;
				}
			}
			return false;
		});
		
		boolean IspassSimilarToUserLessThan3Chars = isValidAccount(username, password, (user,pass) ->{
			String userTemp = user;
			
			int count = 0;
			for(int i = 0;i < pass.length();i++) {
				char c = pass.charAt(i);
				if(userTemp.indexOf(c) != -1) {
					int temp = userTemp.indexOf(c);
					count++;
					userTemp = userTemp.substring(0,temp) + userTemp.substring(temp+1,userTemp.length());
				}
			}			
			return count < 3;
		});
		
		if(IsPassHasAtLeast8Chars && IspassHasAtLeastOneDigit && IspassHasAtLeastOneUpperCase
				&& IspassHasAtLeastOneSpecialChar && IspassSimilarToUserLessThan3Chars) {
			System.out.println("Đăng ký tài khoản thành công");
		} else {
			System.out.println("Đăng ký thất bại, vui lòng xem lại điều khoản");
		}
	}
	
	private static boolean isValidAccount(String username,String password, AccountCondition cdn) {
		return cdn.checkValid(username, password);
	}
}
