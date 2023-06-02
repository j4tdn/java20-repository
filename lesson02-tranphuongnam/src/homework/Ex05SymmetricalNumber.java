package homework;

import java.util.Scanner;

public class Ex05SymmetricalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText = null;
		do {
			System.out.println("Enter a number: ");
			numberAsText = sc.nextLine();
			if(!checkValidNumber(numberAsText)) {
				System.out.println("Invalid number, try again!");
			} else {
				int number = Integer.parseInt(numberAsText);
				if(isSymmetricalNumber(number)) {
					System.out.println(number + " is a symmetrical number");
				} else {
					System.out.println(number + " is not a symmetrical number");
				}
			}
		} while(!checkValidNumber(numberAsText));
		
		sc.close();
		System.out.println("Exit");
	}
	
	private static boolean checkValidNumber(String number) {
		return number.matches("\\d+") && number.length() > 1;
	}
	
	private static boolean isSymmetricalNumber(int n) {
		final int N = n; // Save original paramater n
		String reversedNumberText = "";
		while(n != 0) {
			int x = n % 10;
			reversedNumberText += x;
			n /= 10;
		}
		int reversedNumber = Integer.parseInt(reversedNumberText);
		return reversedNumber == N;
	}
}
