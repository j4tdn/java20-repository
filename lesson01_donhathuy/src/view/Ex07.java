package view;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		System.out.println("...Convert N to binary number...");
		System.out.print("Enter N: ");
		Scanner ip = new Scanner(System.in);
		int number = ip.nextInt();
		System.out.println("--->Result: " + covertToBinaryNumber(number));
	}

	private static String covertToBinaryNumber(int number) {
		String result = "";
		do {
			result += number % 2 ;
			number /= 2;	
		} while(number !=0 );
		StringBuffer stringBuffer = new StringBuffer(result);
		result = stringBuffer.reverse().toString();
		return result;
	}

}
