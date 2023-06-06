package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter N: ");
		int N = ip.nextInt();
		System.out.println(N + " ! = " + calFactorial(N) );
	}
	public static int calFactorial(int N) {
		int result = 1;
		for (int i = 1; i <= N; i++) {
			result *= i;
		}
		return result;
	}
}
