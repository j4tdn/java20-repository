package view;


import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("...Checking N is divisible by 2...");
		System.out.print("Enter N: ");
		Scanner ip = new Scanner(System.in);
		for (int count = 1; count <= 5; count++) {
			try {
				int number = ip.nextInt();
				if (number <= 0) {
					System.out.println("Erroring, enter again!");
				} else {
					System.out.println("--->Result: " + isDivisibleBy2(number));
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
	
	private static boolean isDivisibleBy2(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}
}
