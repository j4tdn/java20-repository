package exercises;

import java.util.Scanner;

public class Ex01StringPrint {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter a random string: ");
		String test = sc.nextLine();
		
		System.out.println("Print each character on one line: ");
		for(int i = 0; i < test.length(); i++) {
			if(i == test.length() - 1){
				System.out.print(test.charAt(i) + "\n\n");
			} else { 
				System.out.print(test.charAt(i) + ", ");
			}
		}
		
		System.out.println("Print each word on each line: ");
		String[] wordArray = test.split(" ");
		for(String word : wordArray) {
			System.out.println(word);
		}
		
		System.out.println("\n");
		
		System.out.println("Print the reverse string by character: ");
		for(int i = test.length() - 1; i >= 0; i--) {
			System.out.print(test.charAt(i));
		}
		
		System.out.println("\n");
		
		System.out.println("Print each word on each line in reverse: ");
		for(int i = wordArray.length - 1; i >= 0; i--) {
			System.out.print(wordArray[i] + " ");
		}
	}
}
