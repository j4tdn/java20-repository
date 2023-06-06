package view;

import java.util.Random;

public class Ex04SumFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(9,21);
		int b = rd.nextInt(9,21);
		int c = rd.nextInt(9,21);
		int d = rd.nextInt(9,21);
	
		long S = calFactorial(a) + calFactorial(b) + calFactorial(c) + calFactorial(d);
		System.out.println("S = " + S);
	}	
	private static int calFactorial(int N) {
		int result = 1;
		for (int i = 1; i <= N; i++) {
			result *= i;
		}
		return result;
	}
}
