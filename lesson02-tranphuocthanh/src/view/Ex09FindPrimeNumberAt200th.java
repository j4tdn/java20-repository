package view;

public class Ex09FindPrimeNumberAt200th {
	public static void main(String[] args) {
		int result = primeNumberAt200th(1900);
		if (result != -1) {
			System.out.println("prime number at 200th is: " + result);
		} else {
			System.out.println("cannot find prime number at 200th");
		}
	}

	private static int primeNumberAt200th(int number) {
		boolean[] eratosthenes = new boolean[number + 1];

		for (int i = 2; i <= number; i++) {
			eratosthenes[i] = true;
		}

		for (int i = 2; i < Math.sqrt(number); i++) {
			if (eratosthenes[i]) {
				for (int j = i * i; j <= number; j += i) {
					eratosthenes[j] = false;
				}
			}
		}

		int count = 0;
		for (int i = 2; i < number; i++) {
			if (eratosthenes[i]) {
				count++;
				if (count == 200) {
					return i;
				}
			}
		}

		return -1;
	}
}