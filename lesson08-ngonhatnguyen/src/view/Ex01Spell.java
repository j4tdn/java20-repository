package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01Spell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.print("Enter string: ");
			str = sc.nextLine();
			if (!checkInputString(str)) {
				System.out.println("Error String!!!");
			}
		} while (!checkInputString(str));
		sc.close();
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("\n =============================== \n");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("\n =============================== \n");
		String[] words = getWordsOfString(str);
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println("\n =============================== \n");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.println(words[i]);
		}
	}

	public static boolean checkInputString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static String[] getWordsOfString(String s) {
		int start = 0;
		int count = 0;
		String[] words = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == ' ') {
				String word = s.substring(start, i);
				words[count++] = word;
				start = i + 1;
			} else if (i == s.length() - 1) {
				String word = s.substring(start, s.length());
				words[count++] = word;
			}
		}
		return Arrays.copyOfRange(words, 0, count);
	}
}
