package view;

import java.util.Arrays;

public class Ex02getLargestNumbers {
	public static void main(String[] args) {
		
			String s = "asd01a2b3456cde478";
			
			String[] numbersAsString = s.split("[a-z]+");
			System.out.println(Arrays.toString(numbersAsString));
			
			System.out.println("==========");
			
			
			StringBuilder sb = new StringBuilder();
			String[] result = new String[s.length()/2];
			int running = 0;
			sb.append(Character.isDigit(s.charAt(0)) ? s.charAt(0) : "");
			for(int i = 1; i< s.length(); i++) {
				char letter = s.charAt(i);
				if(Character.isDigit(letter)) {
					sb.append(letter);
				}if(i == s.length() - 1) {
					result[running++] = sb.toString();
				}else {
					if(Character.isDigit(s.charAt(i-1))) {
					result[running++] = sb.toString();
					sb.delete(0, sb.length());
					}
				}
			}
			System.out.println(Arrays.toString(Arrays.copyOfRange(result, 0, running)));
	}
}
