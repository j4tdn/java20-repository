package view;

public class Ex09FindPrimeNumber {
	public static void main(String[] args) {
		int n = 200;
		int primeNumber = findNthPrimeNumber(n);
		System.out.println("The 200th prime number is: " + primeNumber);
	}

	private static int findNthPrimeNumber(int n) {
		int primeCandidate = (int) (n * Math.log(n) + n * Math.log(Math.log(n)));
		while (!isPrime(primeCandidate)) {
			primeCandidate++;
		}
		return primeCandidate;
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		double sqrt = Math.sqrt(number);
		for (int i = 2; i <= sqrt; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
