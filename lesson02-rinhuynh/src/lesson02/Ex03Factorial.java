package lesson02;

import java.util.Scanner;

public class Ex03Factorial {

	public static void main(String[] args) {
		int n = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		n = sc.nextInt();

		int factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= i;
		}
		System.out.println("Factorial of " + n + " = " + factorial);

	}

}
