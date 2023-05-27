package exercise;

import java.util.Scanner;

public class Ex08IsPrimeNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("enter a number: ");
			String check = ip.nextLine();
			if (check.matches("\\d+")) {
				int number = Integer.parseInt(check);
				System.out.println(isPrimeNumber(number));
				break;
			} else {
				System.out.println("invalid number, plz enter again!!!");
				count++;
			}
		} while (count < 5);
		System.out.println("finished!");
	}
	
	private static boolean isPrimeNumber(int number) {
		if (number == 1) return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) return false;
		}
		
		return true;
	}
}
