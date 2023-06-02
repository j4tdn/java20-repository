package homework;

public class Ex09200thPrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		int primeNumber = 0;
		while (count != 200) {
			primeNumber++;
			if(isPrimeNumber(primeNumber)) {
				count++;
			}
		}
		System.out.println("The 200th prime number is " + primeNumber);
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
