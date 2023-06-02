package exercises;

public class Ex09FindPrimeNumber200th {
	private static int findPrimeNumberNth(int n) {
		if (n == 1) {
			return 2;
		}
		int count = 1, primeNum = 3;
		while (count < n) {
			if (Ex08IsPrimeNumber.isPrimeNumber(primeNum)) {
				count++;
			}
			primeNum += 2;
		}
		return primeNum - 2;
	}
	
	public static void main(String[] args) {
		System.out.println("Số nguyên tố thứ 200: " + findPrimeNumberNth(200));
	}
}
