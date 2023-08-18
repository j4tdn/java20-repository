package view;

import java.util.Scanner;

/**
	Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
	Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
	In ra mỗi kí tự trên một dòng
	In ra mỗi từ trên mỗi dòng
	In ra chuỗi đảo ngược theo kí tự
	In ra chuỗi đảo ngược theo từ
 */

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String input = "";
		do {
			System.out.println("vui lòng nhập chuỗi kí tự: ");
			input = ip.nextLine();
			if (!input.matches("[ ă, Ă, â, Â, đ, Đ, ê, Ê, ô, Ô, ơ, Ơ, ư, Ư, ]+")) {
				System.out.println("vui lòng nhập lại, các kí tự phải là kí tự tiếng việt có dấu");
			} else {
				break;
			}
		} while (true);
		
		System.out.println("=======1.======");
		for (char ch: input.toCharArray()) {
			if(!Character.isWhitespace(ch)) {
				System.out.println(ch);
			}
		}
		
		System.out.println("=======2.======");
		
		String[] words = input.trim().split("\\s+");
		for (String word: words) {
			System.out.println(word);
		}
		System.out.println("=======3.======");
		for (int i = input.length() - 1; i >= 0; i--) {
			if (!Character.isWhitespace(input.charAt(i))) {
				System.out.println(input.charAt(i));
			}
		}
		System.out.println("=======4.======");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}
}	
