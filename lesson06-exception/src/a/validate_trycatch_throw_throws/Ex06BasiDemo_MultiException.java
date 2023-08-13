package a.validate_trycatch_throw_throws;

import java.util.Scanner;

public class Ex06BasiDemo_MultiException {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		int result;
		try {
			result = manualInputAndDivide();
			System.out.println("result --> " + result);
		} catch (NumberFormatException | ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("** __ Finished __ **");
		ip.close();
	}

	private static int manualInputAndDivide() {
		int a = manualInput("Enter a: ");
		int b = manualInput("Enter b: ");
		if (b == 0)
			throw new ArithmeticException("denominator should not be zero");
		return a / b;
	}

	private static int manualInput(String text) {
		System.out.print(text);
		return Integer.parseInt(ip.nextLine());
	}

}
