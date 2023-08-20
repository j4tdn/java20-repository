package view;

import java.util.Scanner;

/**
 * 	Viết chương trình nhập vào một chuỗi kí tự bất kì sau đó thực hiện các công việc sau :
	Yêu cầu: Chuỗi chỉ chứa các kí tự tiếng việt có dấu, phím space.
	In ra mỗi kí tự trên một dòng
	In ra mỗi từ trên mỗi dòng
	In ra chuỗi đảo ngược theo kí tự
	In ra chuỗi đảo ngược theo từ
 *
 */
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		while(true) {
			System.out.print("Enter string: ");
			input = sc.nextLine();
			if(checkString(input)) {
				break;
			}
		}
		sc.close();
		System.out.println("input --> " + input);
		
		System.out.println("\nIn ra mỗi kí tự trên một dòng");
		printCharactersOnNewLines(input);
		
		System.out.println("\nIn ra mỗi từ trên một dòng");
		printWordsOnNewLines(input);
		
		System.out.println("\nIn ra chuỗi đảo ngược theo kí tự");
		printReverseString(input);
		
		System.out.println("\nIn ra chuỗi đảo ngược theo từ");
		printReverseWordsOfString(input);
	}
	
	private static boolean checkString(String input) {
		if(input.matches("^[a-zA-ZÀ-ỹ\\s]+$")) {
			return true;
		}
		return false;
	}
	
	private static void printCharactersOnNewLines(String input) {
		for(char c : input.toCharArray()) {
			System.out.println(c);
		}
	}
	
	private static void printWordsOnNewLines(String input) {
		String[] tokens = input.trim().split("\\s");
		for(String str : tokens) {
			System.out.println(str);
		}
	}
	
	private static void printReverseString(String input) {
		StringBuilder strbuilder = new StringBuilder(input);
		System.out.println(strbuilder.reverse().toString());
	}
	
	private static void printReverseWordsOfString(String input) {
		String[] tokens = input.trim().split("\\s");
		for(String str : tokens) {
			printReverseString(str);
		}
	}
}
