package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		System.out.println("...Checking N is symmetrical number...");
		System.out.print("Enter N: ");
		Scanner ip = new Scanner(System.in);
		for (int count = 1; count <= 1000; count++) {
			try {
				int number = ip.nextInt();
				if (number < 10) {
					System.out.println("Erroring, enter again!");
				} else {
					System.out.println("--->Result: " + isSymmetricalNumber(number));
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Erroring, enter again!");
				ip.nextLine();
			} 
		}
	}

	private static boolean isSymmetricalNumber(int number) {
		String text = Integer.toString(number);
		StringBuffer stringBuffer = new StringBuffer(text);
		text = stringBuffer.reverse().toString();
		int numberReverse = Integer.parseInt(text);
		if (number == numberReverse)
			return true;
		else return false;
		
	}

}
