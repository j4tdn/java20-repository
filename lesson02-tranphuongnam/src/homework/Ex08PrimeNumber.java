package homework;

import java.util.Random;

public class Ex08PrimeNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int i = 0;
		while (i++ < 20) {
			int primeNumber = rd.nextInt(100);
			if(isPrimeNumber(primeNumber)) {
				System.out.println(primeNumber + " 		is a prime number");
			} else {
				System.out.println(primeNumber + " 		is not a prime number");
			}
		}
	}

	private static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
