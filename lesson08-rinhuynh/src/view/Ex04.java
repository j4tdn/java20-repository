package view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input M : ");
		long M = ip.nextLong();
		System.out.print("Input N : ");
		long N = ip.nextLong();
		String result = check(M, N) ? "YES" : "NO";
		System.out.println(result);
	}
	
	private static boolean isPrimeNumber(long ip) {
		if(ip == 1 || ip == 0) {
			return false;
		}
		for(long i = 2; i < Math.sqrt(ip); i++) {
			if(ip % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean check(long a, long b) {
		for(long i = 2; i < b; i++) {
			if(isPrimeNumber(i) == true && a % i == 0 && b % i == 0) {
				return true;
			}
		}
		return false;
	}
}