package view;

import java.util.Scanner;

/**
	Viết chương trình cho phép người dùng nhập vào họ tên sau, in ra kết quả theo yêu cầu sau:
	
	Họ tên nhập vào chỉ bao gồm các kí tự [A-Za-z ]
	Viết HOA chữ cái đầu tiên của mỗi từ, còn lại là kí tự thường
	Các từ cách nhau một khoảng trắng
	Ví dụ: aDam Le vAN john Son => Adam Le Van John Son
	Anne frAnk => Anne Frank
 */

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = "";
		do {
			System.out.println("vui lòng nhập chuỗi kí tự: ");
			input = ip.nextLine();
			if (!input.matches("[a-zA-z ]+")) {
				System.out.println("vui lòng nhập lại!!!");
			} else {
				break;
			}
		} while (true);
		
		String[] words = input.toLowerCase().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (String word: words) {
			sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
		}
		System.out.println(sb);
	}
}
