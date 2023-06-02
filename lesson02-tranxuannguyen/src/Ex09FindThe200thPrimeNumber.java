
public class Ex09FindThe200thPrimeNumber {
	public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		int count = 0;
        int number = 2;
        while (count < 200) {
            if (isPrime(number)) {
                count++;
            }
            number++;
        }
        System.out.println("So nguyen to thu 200 la: " + (number - 1));
	}
}
