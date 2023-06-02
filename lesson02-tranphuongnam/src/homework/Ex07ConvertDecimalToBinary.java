package homework;

import java.util.Scanner;

public class Ex07ConvertDecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsText = null;
		do {
			System.out.print("Enter a number: ");
			numberAsText = sc.nextLine();
			if(!numberAsText.matches("\\d+")) {
				System.out.println("Invalid number, try again!");
			} else {
				String binary = convertFromDedicalToBinary(Integer.parseInt(numberAsText));
				System.out.println(numberAsText + "(decimal) to binary is: " + binary);
			}
		} while(!numberAsText.matches("\\d+"));
		
		sc.close();
		System.out.println("Exit");
	}
	
	private static String convertFromDedicalToBinary(int n) {
		String binaryText = "";
		while(n != 0) {
			binaryText = (n % 2) + binaryText;
			n /= 2;
		}
		return binaryText;
	}
}
