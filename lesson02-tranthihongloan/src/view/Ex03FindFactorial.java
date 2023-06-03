package view;

import java.util.Random;

public class Ex03FindFactorial {
	public static void main(String[] args) {	
		Random rd = new Random();
		int N = rd.nextInt(50);
		System.out.println("N --> " + N);
		
		System.out.println("Result --> " + findFactorial(N));
	}
	private static int findFactorial(int number) {
		int factorial = 1;
		for(int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
