package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("...Calculating the factorial of a number...");
		System.out.print("Enter number: ");
		Scanner ip = new Scanner(System.in);
		int number = ip.nextInt();
		System.out.println("--->Result: "+ calculFactorialNumber(number));
		ip.close();
		
	}
	public static long calculFactorialNumber(int number ) {
		long result = 1;
		for (int i=1; i <= number; i++) {
			 result *= i;
		}
		return result;	
	}
}
