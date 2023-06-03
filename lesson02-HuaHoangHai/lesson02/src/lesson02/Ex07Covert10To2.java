package lesson02;

import java.util.Scanner;

public class Ex07Covert10To2 {
	public static void main(String[] args) {
		   Scanner ip = new Scanner(System.in);
	        System.out.print("Nhập vào N: ");
	        int decimal = ip.nextInt();
	        String binary = decimalToBinary(decimal);
	        System.out.println("N = " + decimal + "-->" + binary);
	    }

	    public static String decimalToBinary(int decimal) {
	        if (decimal == 0) {
	            return "0";
	        }
	        StringBuilder binary = new StringBuilder();
	        while (decimal > 0) {
	            binary.insert(0, decimal % 2);
	            decimal /= 2;
	        }
	        return binary.toString();
	    }
}
