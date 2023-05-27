package exercise;

import java.util.Random;

public class Ex04SumOfMultipleFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		long sum = 0, tmp;
		int count = 0;
		while (count < 4) {
			int number = rd.nextInt(10, 21);
			tmp = factorial(number);
			System.out.println(number + "! = " + tmp);
			sum += tmp;
			count++;
		}
		System.out.println("sum: " + sum);
	}

	private static long factorial(int number) {
		long result = 1;
		for (int i = 1; i <= number; i++) {
			result *= i;
		}

		return result;
	}
}
