package view;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		System.out.println("...Checking N is Prime number...");
		System.out.print("Enter N: ");
		Scanner ip = new Scanner(System.in);
		for (int count = 1; count <= 5; count++) {
			try {
				int number = ip.nextInt();
				if (number <= 0) {
					System.out.println("Erroring, enter again!");
				} else {
					System.out.println("--->Result: " + isPrime(number));
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

	public static boolean isPrime(int number) {
		int dem = 0;
		for (int i = 1; i<=number; i++) 
		dem = (number % i == 0) ? dem + 1: dem + 0;
		if (dem !=2) 
			return false;
		else return true;
	}
}
