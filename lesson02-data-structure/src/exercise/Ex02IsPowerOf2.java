package exercise;

import java.util.Scanner;

public class Ex02IsPowerOf2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		do {
			System.out.print("enter a number: ");
			String sequences = ip.nextLine();
			if (sequences.matches("\\d+")) {
				int number = Integer.parseInt(sequences);
				System.out.println(isPowerOf2(number));
				break;
			} else {
				System.out.println("invalid number, plz enter again!");
				count++;
			}
		} while (count < 5);
		System.out.println("finished!!!");
	}
	
	private static boolean isPowerOf2(int number) {
		double check = Math.log(number)/Math.log(2);
		return Math.ceil(check) == Math.floor(check);
	}
}
