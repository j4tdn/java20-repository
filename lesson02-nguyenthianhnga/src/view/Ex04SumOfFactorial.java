package view;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
		Random random = new Random();
		int a, b, c, d;
		a = random.nextInt(10, 20);
		b = random.nextInt(10, 20);
		c = random.nextInt(10, 20);
		d = random.nextInt(10, 20);
		long sumOfFactorial = 0;

		sumOfFactorial = factorial(a) + factorial(b) + factorial(c) + factorial(d);
		System.out.println("S = " + a + "! + " + b + "! + " + c + "! + " + d + "! \n  = " + sumOfFactorial);

	}

	private static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
