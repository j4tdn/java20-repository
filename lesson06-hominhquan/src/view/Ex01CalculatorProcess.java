package view;

import java.util.Scanner;

public class Ex01CalculatorProcess {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = 0;
		int b = 0;
		while(true) {
			try {
				 System.out.println("nhap a:");
				 a = Integer.parseInt(ip.nextLine());
				 System.out.println("nhap b:");
				 b = Integer.parseInt(ip.nextLine());
				break;
			} catch (ArithmeticException | NumberFormatException e) {
					 System.out.println("error denominator. please re-enter: ");
					 
			}
		}
		
		System.out.println(Calculator(a, b));
		ip.close();
	}
	
	private static double Calculator(int a, int b) {
		if(a == 0) {
			throw new ArithmeticException("denominator should not be a zero..");
		}else {
			return -b / a;
		}
	}
}
