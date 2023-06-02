package view;

public class Ex09 {
	 public static void main(String[] args) {
	        int primeCount = 0;
	        int number = 2;

	        while (primeCount < 200) {
	            if (isPrime(number)) {
	                primeCount++;
	            }

	            if (primeCount == 200) {
	                System.out.println("So nguyen to thu 200 : " + number);
	                break;
	            }

	            number++;
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }

	        return true;
	   }
}

