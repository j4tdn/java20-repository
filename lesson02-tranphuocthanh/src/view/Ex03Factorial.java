package view;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int number = ip.nextInt();
		System.out.println(number + "! = " + factorial(number));
	}
	
	private static long factorial(int number) {
		long result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}
		
		return result;
	}
}
