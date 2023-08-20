package view;

import java.util.Scanner;

/**
 * Viết chương trình cho phép người dùng nhập vào họ tên sau, in ra kết quả theo
 * yêu cầu sau:
 * 
 * Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ] Viết HOA chữ cái đầu tiên của
 * mỗi từ, còn lại là kí tự thường Các từ cách nhau một khoảng trắng Ví dụ: aDam
 * Le vAN john Son => Adam Le Van John Son
 */
public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		while(true) {
			System.out.print("Enter string: ");
			input = sc.nextLine();
			if(checkInput(input)) {
				break;
			}
		}
		sc.close();
		System.out.println("input --> " + input);
		
		System.out.println( capitalizeFirstLetter(input));
	}

	private static boolean checkInput(String input) {
		if (input.matches("^[a-zA-Z\\s]+$")) {
			return true;
		}
		return false;
	}
	
	private static String capitalizeFirstLetter(String input) {
		String[] tokens = input.trim().split("\\s");
		for(int i = 0; i < tokens.length; i++) {
			char c = Character.toUpperCase(tokens[i].charAt(0));
			tokens[i] = String.valueOf(c).concat(tokens[i].substring(1, tokens[i].length()).toLowerCase());
		}
		return String.join(" ", tokens);
	}
}
