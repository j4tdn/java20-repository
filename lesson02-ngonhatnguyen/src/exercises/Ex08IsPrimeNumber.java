package exercises;

public class Ex08IsPrimeNumber {
	public static boolean isPrimeNumber(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		int check = 0;
		for (int i=2;i<n;i++) {
			if (n % i == 0) {
				check++;
			}
		}
		if (check == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		int x = 19, y = 20;
		System.out.println("n1 --> " + x);
		System.out.println("n2 --> " + y);
		if (isPrimeNumber(x)) {
			System.out.println(x + " là số nguyên tố!");
		} else {
			System.out.println(x + " không là số nguyên tố!");
		}
		if (isPrimeNumber(y)) {
			System.out.println(y + " là số nguyên tố!");
		} else {
			System.out.println(y + " không là số nguyên tố!");
		}
	}
}
