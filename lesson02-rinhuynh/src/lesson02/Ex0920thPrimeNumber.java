package lesson02;

public class Ex0920thPrimeNumber {

	public static void main(String[] args) {
		numberPrime(200);
		
	}
	public static void numberPrime(int input) {
		int n = 1;
		int count = 0;
		while (count < input) {
			n++;
			if(Ex08PrimeNumber.checkPrime(n)) {
				count ++;
			}
		}
		System.out.println("Prime number 200th = " + n);
	}

}
