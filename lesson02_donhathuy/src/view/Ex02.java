package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		System.out.println("...Checking N is power of 2...");
		System.out.print("Enter N: ");
		Scanner ip = new Scanner(System.in);
		for (int count = 1; count <= 5; count++) {
			try {
				int number = ip.nextInt();
				if (number <= 0) {
					System.out.println("Erroring, enter again!");
				} else {
					System.out.println("--->Result: " + isPowerOf2(number));
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Erroring, enter again!");
				ip.nextLine();
			} 
		}
		System.out.println("Stopping, you enter over 5 times!");
		ip.close();
	}

	private static boolean isPowerOf2(int number) {
		int i = 1;
		while ( i < number)  i *= 2;
		if ( i == number &  i != 1)
			return true;
		else return false;
	}

}
