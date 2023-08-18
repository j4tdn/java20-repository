package view;

import java.util.Arrays;

public class Ex04EquipvalentPrimes {
	
	public static void main(String[] args) {
		int a = 15;
		int b = 75;
		
		System.out.println(isEquipvalentPrimeNumbers(a, b));
		
	}
	
	private static boolean isPrime(int a) {
		for (int i = 2; i  <= Math.sqrt(a); i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static int[] findFactors(int a) {
		int[] result = new int[a/2];
		int running = 0;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && isPrime(i)) {
				result[running++] = i;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static boolean isEquipvalentPrimeNumbers(int a, int b) {
		
		int[] factorA = findFactors(a);
		int[] factorB = findFactors(b);
		
		return Arrays.equals(factorA, factorB);
		
	}
}
