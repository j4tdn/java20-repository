package view;

import java.util.Scanner;

public class Ex03isFactorial {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap n= ");
		int n = ip.nextInt();
		System.out.println("n gia thua = " + Factorial(n));
		
	}
	private static int Factorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}else {
			return n = n* Factorial(n-1);
		}
		
	}
}
