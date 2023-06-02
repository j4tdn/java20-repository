package lesson02;

import java.util.Random;

public class Ex04FactorialSum {

	public static void main(String[] args) {
		int x = 10;
		int y = 21;

		long sum = 0;

		Random rd = new Random();

		int a = rd.nextInt(x, y);
		int b = rd.nextInt(x, y);
		int c = rd.nextInt(x, y);
		int d = rd.nextInt(x, y);
		
		sum = getFactorial(a) + getFactorial(b) + getFactorial(c) + getFactorial(d);
		
		System.out.println("Sum factorial of 4 numbers = " + sum);

	}

	public static long getFactorial(int n) {
		long factorial = 1;
		for (int i = n; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

}
