package view;

import java.util.Scanner;

public class Ex05LongestCommonSubstring {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		String text1 = input();
		String text2 = input();

		System.out.println(findLongestCommonSubstring(text1, text2));
	}

	private static String findLongestCommonSubstring(String s1, String s2) {
	    int[][] dp = new int[s1.length() + 1][s2.length() + 1];
	    int maxLen = 0;
	    int endIndex = -1;

	    for (int i = 1; i <= s1.length(); i++) {
	        for (int j = 1; j <= s2.length(); j++) {
	            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
	                dp[i][j] = dp[i - 1][j - 1] + 1;
	                if (dp[i][j] > maxLen) {
	                    maxLen = dp[i][j];
	                    endIndex = i;
	                }
	            } else {
	            	dp[i][j] = 0;
	            }
	        }
	    }

	    if (maxLen > 0) {
	        return s1.substring(endIndex - maxLen, endIndex);
	    }
	    return "";
	}


	private static String input() {
		System.out.println("nhập chuỗi: ");
		String input = ip.nextLine();

		if (!input.matches("[A-Z]+")) {
			throw new IllegalArgumentException("chuỗi chỉ chứa các kí tự A-Z");
		}

		return input;
	}
}
