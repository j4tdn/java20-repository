package view;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter here: ");
		String input = in.nextLine();
		printOneCharacterOneLine(input);
//		printOneletterOneLine(input);
//		printReverseByCharacter(input);
//		printReverseByLetter(input);
		
	}
	
	private static void printOneCharacterOneLine(String input) {
		input = input.replaceAll("\\s", "");
		String[] arr = input.split("");
		for(String i:arr) {
			System.out.println(i);
		}
	}
	
	private static void printOneletterOneLine(String input) {
		String[] arr = input.split("\\s");
		for(String i:arr) {
			System.out.println(i);
		}
	}
	
	private static void printReverseByCharacter(String input) {
		input = input.replaceAll("\\s", "");
		String[] arr = input.split("");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	private static void printReverseByLetter(String input) {
		String[] arr = input.split("\\s");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	
	

}