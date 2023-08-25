package homework08;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		 try (Scanner ip = new Scanner(System.in)) {
			System.out.print("Nhập chuỗi từ bàn phím : ");
	        String inputString = ip.nextLine();
	        printSingleCharacter(inputString);
	        printCharacterPerLine(inputString);
	        String input = reverseString(inputString);
	        System.out.println(" từ đảo ngược: " + input ); //xuất ra màn hình từ đảo người
	        System.out.println(" ký tự đảo ngược --> " );	// xuất ra màn hình ký tự đảo ngược
	        reverseStringCharacter(inputString);
		}
	}
	
	private static void printSingleCharacter(String input) {
		System.out.println("In ra kí tự");
		for(char letter : input.toCharArray()) {
			System.out.println(letter);
		}
	}
	
	private static void printCharacterPerLine(String input) {
		System.out.println("In từng từ");
		input = input.trim().replaceAll("\\s+", " ");
		String[] tokens = input.trim().split(" ");
		for(String letter : tokens) {
			System.out.println(letter);
		}
	}
	
	private static String reverseString(String input) {
		
		if (input.isEmpty()) {
	        return input;
	    } else {
	        return reverseString(input.substring(1)) + input.charAt(0);
	    }
	}

	private static void reverseStringCharacter(String input) {
		String reversed = reverseString(input);
		for (char letter : reversed.toCharArray()) {
       System.out.println(letter);
		}
	}
}
