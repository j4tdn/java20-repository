package view;


import java.util.Arrays;

public class Exercises04 {

	public static void main(String[] args) {
		int M = 15, N = 75;
		System.out.println("Ước nguyên tố của " + M );
		System.out.println("Ước nguyên tố của " + N );
		
		if (Arrays.equals(primeFactors(M), primeFactors(N))) {
			System.out.println(M + " và " + N + " là nguyên tố tương đương.");
		} else {
			System.out.println(M + " và " + N + " không là nguyên tố tương đương.");
		}
	}
	
	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static int[] primeFactors(int n) {
		int[] pf = new int[n - 1];
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i) && n % i == 0) {
				pf[count++] = i;
			}
		}
		return Arrays.copyOfRange(pf, 0, count);
	}
}
