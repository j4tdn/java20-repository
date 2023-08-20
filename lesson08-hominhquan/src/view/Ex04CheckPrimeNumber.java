package view;

import java.util.Arrays;

public class Ex04CheckPrimeNumber {
	public static void main(String[] args) {
		int n = 15;
		int m = 75;
		
		System.out.println(areEquivalentPrimeNumbers(n, m));
		
	}
	
	
	public static boolean areEquivalentPrimeNumbers(int a, int b) {
		int[] primeFactorsA = primeFactor(a);
        int[] primeFactorsB = primeFactor(b);
        
        return primeFactorsA.equals(primeFactorsB);
    }
	
	private static int[] primeFactor(int input) {
		int[] result = new int[input/2];
		int count = 0;
		for (int i = 2; i <= input; i++) {
			if (input % i == 0 && isPrime(i)) {
				result[count++] = i;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static boolean isPrime(int input) {
		for (int i = 2; i  <= Math.sqrt(input); i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
