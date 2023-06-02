import java.util.Random;

public class Bai4 {
	private static long factorial(long a) {
		if (a == 0 || a == 1)
			return 1;
		else
			return a * factorial(a - 1);
	}

	private static long sumOfFactorial(long a, long b, long c, long d) {
		return factorial(a) + factorial(b) + factorial(c) + factorial(d);
	}

	public static void main(String[] args) {
		Random rd = new Random();
		
		int a = rd.nextInt(10, 21);
		System.out.println("a = " + a);
		
		int b = rd.nextInt(10, 21);
		System.out.println("b = " + b);
		
		int c = rd.nextInt(10, 21);
		System.out.println("c = " + c);
		
		int d = rd.nextInt(10, 21);
		System.out.println("d = " + d);
		
		System.out.println("a! + b! + c! + d! = " + sumOfFactorial(a, b, c, d));
	}
}
