package view;

import java.util.Random;

public class Ex04SumFactorial {
	public static void main(String[] args) {	
		Random rd = new Random();
		int a = rd.nextInt(10, 21);
		int b = rd.nextInt(10, 21);
		int c = rd.nextInt(10, 21);
		int d = rd.nextInt(10, 21);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		
		int sum = findFactorial(a) + findFactorial(b) + findFactorial(c) + findFactorial(d);
		System.out.println("Result --> " + sum);
	}
	private static int findFactorial(int number) {
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
