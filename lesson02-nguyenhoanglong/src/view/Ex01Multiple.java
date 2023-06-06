package view;

import java.util.Scanner;

public class Ex01Multiple {
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
			System.out.println("Wrong input amount exceeds 5 times");
			System.out.println();
			System.exit(0);
		}
		} while(true);	
		
		int N = Integer.parseInt(numberAsText);
		
		
		if (N % 2 == 0) {
			System.out.println(N + " " + "is multiple of 2");
		}else {
			System.out.println(N + " " + "is multiple of 2");
	}
		
	}
}
