package view;

import java.util.Scanner;

public class Ex05SymmetricalNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		do {
			System.out.println("Enter N: ");
			numberAsText = ip.nextLine();
			
			if (numberAsText.matches("\\d+") && (numberAsText.length()) > 2) {
				break;
			}
		} while (true);
		int N = Integer.parseInt(numberAsText);
		if (isSymmetricalNumber(N)) {
			System.out.println("is symmetrical number");
			System.exit(0);
		}
		System.out.println("is not symmetrical number");

	}
	private static boolean isSymmetricalNumber(int N) {
		int temporaryNumber = N;
		int reverseNumber = 0;
		int numberOfUnits;
		while (	temporaryNumber != 0) {
			numberOfUnits = temporaryNumber % 10;
			reverseNumber = reverseNumber * 10 + numberOfUnits;
			temporaryNumber = temporaryNumber / 10;		
			}
		if (reverseNumber == N) {
			return true;
			
		}
			return false;
		}
		
	}

