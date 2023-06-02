package view;

import java.util.Scanner;

public class Ex05PalindromeNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int maxTries = 5;
		int tries = 0;
		String numberAsText = " ";
		while (tries < maxTries) {
			try {
				System.out.print("Enter number: ");
				numberAsText = ip.nextLine();
				if ((!numberAsText.matches("\\d+")) || (numberAsText.length()<2)) {
					throw new Exception();
				}
				int number = Integer.parseInt(numberAsText);
				System.out.println("Result ---> " + isPalindrome(number));
				System.out.println("Finished!");
				return;
			} catch (Exception e) {
				System.out.println("\nNumber is invalid, please re-enter!");
				tries += 1;
			}
		}
		System.out.println("\nThe maximum number of entries has been exceeded!\n");
	}
        public static boolean isPalindrome(int n) {
            int reverseN = 0;
            int tempN = n;
            while (tempN > 0) {
                int digit = tempN % 10;
                reverseN = reverseN * 10 + digit;
                tempN = tempN / 10;
            }

            if (n == reverseN) {
                return true;
            } else {
                return false;
            }
        
	}
}
