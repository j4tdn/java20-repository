package view;

import java.util.Arrays;

public class Ex02IsValidNumbers {

	public static void main(String[] args) {
		String[] sequences = {"aa6b546c6e22h",  "aa6b326c6e22h93434"};
		String[] s = {"01a2b3456cde478", "fdsaf"};
		
		String[] result = getLargestNumbers(s);
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}

	private static boolean containNumbers(String text) {
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private static String[] getLargestNumbers(String ...ss) {
		String[] result = new String[ss.length];
		int running = 0;
		
		String number = "";
		int maxLength = 0;
		int index = 0;
		int count = 0;
		
		for (int i = 0; i < ss.length; i++) {
			if (ss[i].length() == 0 || !containNumbers(ss[i])) {
				result[running++] = "0";
				continue ;
			}
			for (int j = 0; j < ss[i].length(); j++) {
				count++;
				char ch = ss[i].charAt(j);
				if (Character.isDigit(ch)) {
					if (count > maxLength) {
						maxLength = count;
						index = j - maxLength + 1;
						number = ss[i].substring(index , index + maxLength);
					}
				} else {
					count = 0;
				}
			}
			result[running++] = number;
			maxLength = 0;
			index = 0;
			count = 0;
		}
		
		
		return Arrays.copyOfRange(result, 0, running);
	}
}
