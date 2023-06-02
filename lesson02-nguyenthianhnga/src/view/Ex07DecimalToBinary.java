package view;

import java.util.Scanner;

public class Ex07DecimalToBinary {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the decimal number: ");
	        int decimalNumber = scanner.nextInt();
	        System.out.println("The corresponding binary number: " + convertDecimalToBinary(decimalNumber));
	    }
	private static String convertDecimalToBinary(int decimalNumber) {
	    String binaryString = "";
	    while (decimalNumber > 0) {
	        int remainder = decimalNumber % 2;
	        binaryString = remainder + binaryString;
	        decimalNumber = decimalNumber / 2;
	    }
	    return binaryString;
	}
	}


