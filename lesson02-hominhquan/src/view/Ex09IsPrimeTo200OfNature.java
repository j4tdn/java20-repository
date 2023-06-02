package view;

public class Ex09IsPrimeTo200OfNature {
	public static void main(String[] args) {
		int count = 0;
		int number = 2;
		while(count < 200) {
			if(isPrime(number)) {
				count++;
				if(count == 200) {
					System.out.println("so nguyen to thu 200 la: " + number);
				}
			}
			number++;
		}
	}
	private static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i =2; i <n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
