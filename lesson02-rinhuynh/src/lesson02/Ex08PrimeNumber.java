package lesson02;

public class Ex08PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Result : " + checkPrime(5));

	}

	public static boolean checkPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
