package view;

import java.util.Scanner;

public class Ex08IsPrime {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int MaxAttempts = 5;
		int attempts = 0;
		
		while(attempts < MaxAttempts) {
			System.out.print("nhap n =");
			String input = ip.nextLine();
			try {
				System.out.print(isPrime(Integer.parseInt(input)));
				break;
			} catch (Exception e) {
				System.out.println("nhap sai: vui long nhap lai");
			}
			attempts++;
		}
		if(attempts == MaxAttempts) {
			System.out.println("nhap loi!!!");
		}
	}
	private static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i < n; i++) {
		if(n % i == 0) {
			return false;
		}
		}
		return true;
	}
}
