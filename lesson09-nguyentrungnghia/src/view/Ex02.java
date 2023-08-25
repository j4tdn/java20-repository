package view;

import java.util.Arrays;

public class Ex02 {
	
	public static void main(String[] args) {
		String[] strings = new String[] {
				"01a2b3456cde478",
				"aa6b546c6e22h",
				"aa6b326c6e22h",
				""
		};
		
		for (String string : strings) {
			String[] numbersAsString = getNumbersAsString(string);
			System.out.println(Arrays.toString(numbersAsString) + " ==> " + getBiggestNumber(numbersAsString));
		}
		
		int[] biggestNumbers = {
			getBiggestNumber(getNumbersAsString(strings[1])),	
			getBiggestNumber(getNumbersAsString(strings[2])),	
			getBiggestNumber(getNumbersAsString(strings[0])),
			getBiggestNumber(getNumbersAsString(strings[3]))	
		};
		
		System.out.println(Arrays.toString(biggestNumbers));
		
		System.out.println(Arrays.toString(sort(biggestNumbers)));
	}
	
	private static String[] getNumbersAsString(String s) {
		if (s == "" || s.matches("\\D+")) {
			String[] x = new String[] { "0" };
			return x;
		}
		String[] result = new String[s.length()];
		String[] arr = s.split("\\D+");
		int running = 0;
		for (String a : arr) {
			if (a.isEmpty())
				continue;
			if (a.charAt(0) == '0') {
				result[running++] = a.replace("0", "");
			}
			if (!a.isEmpty() && a.charAt(0) != '0') 
				result[running++] = a;
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static int getBiggestNumber(String[] numbersAsString) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbersAsString.length; i++) {
			int number = Integer.parseInt(numbersAsString[i]);
			if (number > max) {
				int tmp = max;
				max = number;
				number = tmp;
			}
		}
		return max;
	}
	
	private static int[] sort(int[] biggestNumbers) {
		int n = biggestNumbers.length;
		
		for (int i = 0; i < n; i++) {
			boolean check = false;
			
			for (int j = 0; j < n - i - 1; j++) {
				if (biggestNumbers[j] > biggestNumbers[j + 1]) {
					int tmp = biggestNumbers[j];
					biggestNumbers[j] = biggestNumbers[j + 1];
					biggestNumbers[j + 1] = tmp;
					check = true;
				}
			}
			
			if (!check)
				break;
		}
		
		return Arrays.copyOfRange(biggestNumbers, 0, n);
	}

}
