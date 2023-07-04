package exam;

import java.util.Scanner;

public class Ex01PowerOf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" input a : ");
		int a = sc.nextInt();
		System.out.print("input b (power) : ");
		int b = sc.nextInt();

		if (isPowerOf(a, b)) {
			System.out.println(a + " is a power of " + b);
		} else {
			System.out.println(a + " is not power of " + b);

		}
	}

	private static boolean isPowerOf(int a, int b) {
		if (a == 1) {
			return true;
		}
		int result = a / b;
		int com = a % b;
		if (com != 0 ) {
			return false;
		}
		return isPowerOf(result, b);
	}

}
