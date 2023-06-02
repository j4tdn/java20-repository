package homework;

import java.util.Scanner;

public class Ex02ExponentialOf2 {
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
				if(isExponentialOf2(number)) {
					System.out.println(number + " is exponential of 2");
				} else {
					System.out.println(number + " is not exponential of 2");
				}
			}
		} while (!numberAsText.matches("\\d+") && error < 5);
		
		sc.close();
		System.out.println("Exit");
	}
	
	private static boolean isExponentialOf2(int n) {
		boolean check = true;
		while(n != 1) {
			if(n % 2 != 0) {
				check = false;
				break;
			}
			n /= 2;
		}
		return check;
	}
}