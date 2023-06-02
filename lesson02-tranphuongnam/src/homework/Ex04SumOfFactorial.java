package homework;

import java.util.Random;

public class Ex04SumOfFactorial {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(10,21);
		int b = rd.nextInt(10,21);
		int c = rd.nextInt(10,21);
		int d = rd.nextInt(10,21);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("c --> " + c);
		System.out.println("d --> " + d);
		
		long factorialOfA = findFactorial(a);
		long factorialOfB = findFactorial(b);
		long factorialOfC = findFactorial(c);
		long factorialOfD = findFactorial(d);
		System.out.println("a! --> " + factorialOfA);
		System.out.println("b! --> " + factorialOfB);
		System.out.println("c! --> " + factorialOfC);
		System.out.println("d! --> " + factorialOfD);
		
		long sumOfFactorial = factorialOfA + factorialOfB + factorialOfC + factorialOfD;
		System.out.println("a! + b! + c! + d! is equals to " + sumOfFactorial);
	}
	
	private static long findFactorial(int a) {
		long factorial = 1;
		while(a != 0) {
			factorial *= a;
			a--;
		}
		return factorial;
	}
}
