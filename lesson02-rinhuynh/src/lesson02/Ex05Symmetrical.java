package lesson02;

import java.util.Scanner;

public class Ex05Symmetrical {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.print("Enter number: ");
		do {
			input = sc.nextLine();
			if (input.matches("\\d{2,}")) {
				break;
			} else {
				System.out.print("Invalid number, re-enter: ");
			}
		} while (!input.matches("\\d{2,}"));
		System.out.println(input + " --> " + isSymmetrical(Integer.parseInt(input)));

	}

	public static boolean isSymmetrical(int input) {
		return inverseNumber(input) == input;
	}

	public static int inverseNumber(int input) {
		int n = 0;
		while (input > 0) {
			n = 10 * n + input % 10;
			input /= 10;
		}
		return n;
	}

}
