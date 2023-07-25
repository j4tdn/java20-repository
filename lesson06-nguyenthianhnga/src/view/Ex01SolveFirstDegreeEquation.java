package view;

import java.util.Scanner;

public class Ex01SolveFirstDegreeEquation {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double a = input("Enter a: ");
		double b = input("Enter b: ");
		try {
			double x = solveTheEquation(a, b);
			System.out.println("The solution is x = " + x);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

	private static double input(String message) {
		while (true) {
			System.out.print(message);
			try {
				double n = Double.parseDouble(sc.nextLine());
				return n;
			} catch (NumberFormatException e) {
				System.out.println("Input must be a number, please try again.");
			}
		}
	}

	private static double solveTheEquation(double a, double b) {
		if (a == 0) {
			throw new NumberFormatException("The coefficient a must be different from 0!");
		}
		double x = -b / a;
		return x;
	}
}
