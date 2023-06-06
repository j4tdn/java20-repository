package view;

import java.util.Scanner;

public class Ex02Power {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String numberAsText = " ";
		int invalidInputAmount = 0;	
		do {
			System.out.println("Enter N: ");
			numberAsText = ip.nextLine();
		
			if (numberAsText.matches("\\d+")) {
				break;
			}
			invalidInputAmount++;
			if (invalidInputAmount == 5) {
				System.out.println("Wrong input exceeds 5 times");
				System.out.println("Exit");
				System.exit(0);
			}
		} while (true);
				
		int N = Integer.parseInt(numberAsText);
		if (isPower(N)) {
			System.out.println(N + " " + "is a power of 2");
			System.exit(0);
		}
		System.out.println(N + " " + "is not a power of 2");
	}
	public static boolean isPower (int N) {
		while(N != 1) {
			if (N % 2 != 0) {
				return false;
			}
			N = N / 2;
		}
		return true;
	}
		

}
