package exercises;

public class Ex04 {
	public static void main(String[] args) {
		int a = 75;
		int b = 45;
		System.out.println("Hai số a và b có phải là số nguyên tố tương đương? " + isRelativePrime(a, b));
	}

	private static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	private static boolean isRelativePrime(int a, int b) {
		int temp = Math.max(a, b);
		for(int i = 2; i <= Math.sqrt(temp);i++) {
			if(a % i == 0 && b % i == 0) {
				boolean isPrime = isPrime(i);
				if(isPrime) return true;
			}
		}
		return false;
	}
}
