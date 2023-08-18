package view;

import java.util.Scanner;

public class Ex05GetLongestCommonSubString {
	public static void main(String[] args) {
		String s1 = inputString("Enter string s1: ");
		String s2 = inputString("Enter string s2: ");
		
		System.out.println("\nThe Longest Common Subsequence Of s1 And s2:\n  " + getLCS(s1, s2));
	}
	
	public static boolean checkInputString(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i)) && !Character.isUpperCase(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	
	private static String inputString(String text) {
		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.print(text);
			str = sc.nextLine();
			if (!checkInputString(str)) {
				System.out.println("Error String!!!");
			}
		} while (!checkInputString(str));
		
		return str;
	}
	
	private static String getLCS(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		String resultString = "";
		int maxLength = 0;
		for (int i = 0; i < m; i++) {
			int idx1 = i;
			for (int j = 0; j < n; j++) {
				int length = 0;
				int idx2 = j;
				while(idx1 < m && idx2 < n && s1.charAt(idx1) == s2.charAt(idx2)) {
					length++; idx1++; idx2++;
				}		
				if(length > maxLength) {
					maxLength = length;
					resultString = s1.substring(i, idx1);
				}
			}
			i = idx1;
		}
		return resultString;
	}
}
