package view;

import java.util.Scanner;

public class Ex02PowerOf2 {
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
				System.out.println("Result ---> " + isPowerOf2(number));
				System.out.println("Finished!");
				return;
			} catch (Exception e) {
				System.out.println("\nN is invalid, please re-enter!");
				tries += 1;
			}
		}
		System.out.println("\nThe maximum number of entries has been exceeded!\n");
	}
	
	private static boolean isPowerOf2(int n)
	{
		return ((n!=0) && (n&(n-1))==0);
	}
}
