package view;

import java.util.Random;

public class Ex04TotalOfFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		long result = 0l;
		for(int i = 1; i <= 4; i++) {
			int a = rd.nextInt(10,21);
			System.out.print(a + " ");
			result += Factorial(a);
		}
		System.out.println("\nresult= " + result);
	}
	private static int Factorial(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n = n* Factorial(n-1);
		}
		
	}
	
}
