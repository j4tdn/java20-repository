package exercises.exam;

import java.util.Scanner;

public class Ex03ReplaceSpaces {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter a string: ");
		String testString = sc.nextLine();
		System.out.println(revert(testString));
	}
	
	private static String revert(String s) {
		StringBuilder bd = new StringBuilder();
		String t = s.replaceAll("\\s+", " ");
		for(int i = t.length() - 1; i >= 0; i--) {
			bd.append(t.charAt(i));
		}
		return bd.toString();
	}
}
