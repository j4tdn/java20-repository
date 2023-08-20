package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter N: ");
		long N = sc.nextLong();
		System.out.println("Enter M: ");
		long M =sc.nextLong();
		
		  if (areEquivalentPrimes(N, M)) {
	            System.out.println("YES");
	        } else {
	            System.out.println("NO");
	        }
	}
	 public static boolean isPrime(long number) {
	        if (number < 2) {
	            return false;
	        }

	        for (long i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	private static boolean areEquivalentPrimes(long N,long M)
	{
		 for (long i = 2; i <= N && i <= M; i++) {
	            if (N % i == 0 && M % i == 0) {
	                if (!isPrime(i)) {
	                    return false;
	                }
	            }
	        }

	        return true;
	}

}
