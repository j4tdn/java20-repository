package view;

import java.util.Arrays;

public class Ex03RevertString {
	public static void main(String[] args) {
		String input = "Welcome to JAVA20 class";
		
		System.out.println("Input: " + input);
		System.out.println("Output: " + revert(input));
	}
	
	private static String[] getWords(String s) {
		int start = 0;
		String[] result = new String[s.length()];
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if (letter == ' ') {
				String word = s.substring(start, i);
				result[count++] = word;
				start = i+1;
			} else if (i == s.length() - 1) {
				String word = s.substring(start, s.length());
				result[count++] = word;
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static String revert(String str) {
		str = str.trim().replaceAll("\\s+", " ");
		
		String[] words = getWords(str);
		String s = "";
		
		for (int j = 0; j < words.length; j++) {
			for (int i = words[j].length() - 1; i >= 0; i--) {
				s += words[j].charAt(i);
			}
			s += " ";
		}
		
		return s;
	}
}
