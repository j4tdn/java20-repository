package lesson02;

import java.util.Scanner;

public class Ex06MinMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String a, b, c;

		do {
			System.out.println("Enter a, b, c:");
			System.out.print("Enter a = ");
			a = sc.nextLine();
			System.out.print("Enter b = ");
			b = sc.nextLine();
			System.out.print("Enter c = ");
			c = sc.nextLine();
		} while (!a.matches("[+-]?[0-9]+") || !b.matches("[+-]?[0-9]+") || !c.matches("[+-]?[0-9]+"));
		System.out.println("Max of three numbers : " + findMax(a, b, c));
	}

	public static int findMax(String a, String b, String c) {
		int mA = Integer.parseInt(a);
		int mB = Integer.parseInt(b);
		int mC = Integer.parseInt(c);
		if (mA >= mB && mA >= mB)
			return mA;
		if (mB >= mA && mB >= mC)
			return mB;
		return mC;
	}

}
