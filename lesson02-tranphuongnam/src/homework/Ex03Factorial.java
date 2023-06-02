package homework;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText = null;
		int error = 0;
		do {
			System.out.print("Enter a number: ");
			numberAsText = sc.nextLine();
			if(!numberAsText.matches("\\d+")) {
				error++;
				System.out.println("Invalid number, try again!");
			} else {
				int number = Integer.parseInt(numberAsText);
				int factorial = findFactorial(number);
				System.out.println("Factorial of " + number + " is " + factorial);
				break;
			}
		} while (!numberAsText.matches("\\d+") && error < 5);
		
		sc.close();
		System.out.println("Exit");
	}
	
	private static int findFactorial(int n) {
		int factorial = 1;
		while(n != 0) {
			factorial *= n;
			n--;
		}
		return factorial;
		
	}
}
