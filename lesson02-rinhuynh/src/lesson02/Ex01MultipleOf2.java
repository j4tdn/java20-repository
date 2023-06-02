package lesson02;

import java.util.Scanner;

public class Ex01MultipleOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int count = 0;

		System.out.print("Input number: ");

		do {
			input = sc.nextLine();
			if (input.matches("\\d+")) {
				break;
			} else {
				System.out.print("Invalid number, re-enter: ");
				count++;
			}
		} while (count < 5);

		if (count == 5) {
			System.out.println("Wrong input more than 5 times!!");
			System.exit(0);
		} else {
			int ip = Integer.parseInt(input);
			if (multiple(ip)) {
				System.out.println("Number is a multiple of 2!!");
				System.exit(0);
			}
			System.out.println("Number is not a multiple of 2!!");
		}

	}

	public static boolean multiple(int input) {
		if (input % 2 == 0) {
			return true;
		}
		return false;

	}

}
