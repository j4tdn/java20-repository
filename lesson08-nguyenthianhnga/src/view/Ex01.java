package view;

import java.util.Scanner;

import javax.imageio.IIOException;

public class Ex01 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in	);	
			System.out.println("Enter a string of characters: ");
			String st = sc.nextLine();
			if (st.matches("[\\p{L}\\p{M}\\s]+")) {
				System.out.println("Valid.");
			}
			System.out.println("Print character on new line: ");
			printlnCharacterOnNewLine(st);
			System.out.println("Print word on new line: ");
			printWordsOnNewLine(st);
			System.out.println("Print reverse by character: "+reverseByCharacter(st));
			System.out.println("Print reverse by word: "+reverseByWords(st));
			

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid.");
		}

	}

	private static void printlnCharacterOnNewLine(String st) {
		for (int i = 0; i < st.length(); i++) {
			char character = st.charAt(i);
			System.out.println(character);
		}
	}

	private static void printWordsOnNewLine(String st) {
		String[] words = st.split(" ");
		for (String word : words)

		{
			System.out.println(word);
		}
	}

	private static String reverseByCharacter(String st)
	{
		StringBuilder reverse = new StringBuilder();
		for(int i = st.length()-1 ;i >=0;i--)
		{
			char character = st.charAt(i);
			reverse.append(character);
		}
		return reverse.toString();
	}
	
	private static String reverseByWords(String st) {
	    String[] words = st.split(" ");
	    StringBuilder reverse = new StringBuilder();
	    for (int i = words.length - 1; i >= 0; i--) {
	        reverse.append(words[i]);
	        if (i > 0) {
	            reverse.append(" ");
	        }
	    }
	    return reverse.toString();
	}

	{

	}
}
