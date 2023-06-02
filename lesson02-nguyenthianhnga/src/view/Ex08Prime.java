package view;

import java.util.Scanner;

public class Ex08Prime {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int maxTries = 5;
		int tries = 0;
		String numberAsText = " ";
		while (tries < maxTries) {
			try {
				System.out.print("Enter number: ");
				numberAsText = ip.nextLine();
				if ((!numberAsText.matches("\\d+")) || (numberAsText.compareTo(numberAsText) < 0)) {
					throw new Exception();
				}
				int number = Integer.parseInt(numberAsText);
				System.out.println("Result ---> " + isPrime(number));
				System.out.println("Finished!");
				return;
			} catch (Exception e) {
				System.out.println("\nN is invalid, please re-enter!");
				tries += 1;
			}
		}
		System.out.println("\nThe maximum number of entries has been exceeded!\n");
	}

	private static boolean isPrime(int number) {
	    if (number <= 1) {
	        return false;
	    }
	    double sqrt = Math.sqrt(number);
	    for (int i = 2; i <= sqrt; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
}
