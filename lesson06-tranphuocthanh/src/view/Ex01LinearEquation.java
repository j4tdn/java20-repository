package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex01LinearEquation {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			try {
				System.out.println(findX());
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				e.printStackTrace();
				System.out.println("Please enter a valid number!");
			}
		}
		System.out.println("Finished!!!");
		
		ip.close();
	}

	private static BigDecimal findX() {
		// ax + b = 0
		int slope = manualInput("Enter slope number: ");
		int intercept = manualInput("Enter intercept number: ");
		
		if (slope == 0 && intercept == 0) {
			return BigDecimal.ZERO;
		}
		
		if (slope == 0 && intercept != 0) {
			throw new ArithmeticException("slope cannot be zero");
		}
		
		double result = (-1.0) * intercept / slope;
		return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP);
	}

	private static int manualInput(String text) {
		System.out.print(text);
		return Integer.parseInt(ip.nextLine());
	}
}
