package view;

import java.util.Scanner;
public class Ex01SimpleEquation {
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner ip = new Scanner(System.in);
				System.out.println("Enter a: ");
				int a = Integer.parseInt(ip.nextLine());
				System.out.println("Enter b: ");
				int b = Integer.parseInt(ip.nextLine());
				System.out.println("Result " + SolveSimpleEquation(a, b));
				ip.close();
				break;
			} catch (NumberFormatException|ArithmeticException nfe) {
				nfe.printStackTrace();
				System.out.println("Please enter a valid number");
			}
		}
	}
	
	private static double SolveSimpleEquation(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("Please enter number a !=0");
		}	
		if (b == 0) {
		System.out.println("The equation has infinitely many solutions" );
		}else {
		System.out.println("The equation has no solution");
		}
		return (double) -b / a;	
	}
}
