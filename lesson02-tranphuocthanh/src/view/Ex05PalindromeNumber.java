package view;

import java.util.Scanner;

public class Ex05PalindromeNumber {
	private static int d = 1;
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print(d++ + ".enter a number: ");
			String sequences = ip.nextLine();
			if (sequences.matches("[0-9]{2,}")) {
				int number = Integer.parseInt(sequences);
				System.out.println(palindromeNumber(number));
				break;
			} else {
				System.out.println("invalid number, plz enter again!");
				count++;
			}
		} while (count < 5);
		System.out.println("finished!!!");
	}
	
	private static boolean palindromeNumber(int number) {
		String sequences = String.valueOf(number);
		int length = sequences.length();
		for (int i = 0; i < length; i++) {
			if (sequences.charAt(i) != sequences.charAt(length-i-1)) {
				return false;
			}
		}
		
		return true;
	}
}
