package lesson02;

import java.util.Scanner;

public class Ex02IsPowerOf2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int count = 0;

		System.out.print("Enter number: ");
		do {
			input = sc.nextLine();
			if (input.matches("\\d+")) {
				break;
			} else {
				System.out.print("Invalid number, re-enter: ");
				count++;
			}
		} while (count < 5);
		if (count ==5) {
			System.out.println("Wrong input more than 5 times!!");
			System.exit(0);
			
		} else {
			int ip = Integer.parseInt(input);
			if (isPowerOf2(ip)) {
				System.out.println("Number is a power of two!!");
				System.exit(0);
			}
			System.out.println("Number is not a power of two!!");
		}

	}

	public static boolean isPowerOf2(int n) {
		if (n <= 0 || (n != 0) && (n & (n - 1)) != 0) {
			return false;
		}
		return true;
	}

}
