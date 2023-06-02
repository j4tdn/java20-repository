package exercises;

import java.util.Random;

public class Ex04SumFactorial {
	public static long sumFactorial(int a, int b, int c, int d) {
		long sumf;
		sumf = Ex03FindFactorialOfN.factorial(a) + Ex03FindFactorialOfN.factorial(b) + Ex03FindFactorialOfN.factorial(c) + Ex03FindFactorialOfN.factorial(d);
		return sumf;
	}
	public static void main(String[] args) {
		int a, b, c, d;
		Random rd = new Random();
		a = rd.nextInt(20 - 10) + 10;
		b = rd.nextInt(20 - 10) + 10;
		c = rd.nextInt(20 - 10) + 10;
		d = rd.nextInt(20 - 10) + 10;
		System.out.println("S = " + a + "! + " + b + "! + " + c + "! + " + d + "! = " + sumFactorial(a, b, c, d));
	}
}
