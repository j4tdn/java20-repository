package view;

import java.util.Scanner;

public class Ex01FirstDegreeEquation {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int a, b;
		float x;
		while (true) {

			a = manualInput("Enter a = ");
			b = manualInput("Enter b = ");
			try {
				if (a == 0) {
					throw new ArithmeticException("a should not be zero!");
				}

				x = -(float) b / a;
				break;
			} catch (ArithmeticException ae) {
				ae.printStackTrace();
			}

		}
		String fde = "";
		fde = b == 0 ? a + "x = 0" : b > 0 ? a + "x + " + b + " = 0" : a + "x - " + Math.abs(b) + " = 0";
		System.out.println("The First degree Equation ax + b = 0: " + fde);
		System.out.println("Result of the FDE: x = -b / a = " + x);
	}

	private static int manualInput(String text) {
		int x;
		while (true) {
			try {
				System.out.print(text);
				x = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				// quăng thông tin lỗi cơ bản System.out.println(nfe.getMessage());
				nfe.printStackTrace();
				System.out.println("Please enter a valid number!");
			}
		}
		return x;
	}
}
