package view;

import java.util.Scanner;

public class Exercises01 {
	
	 private static Scanner ip = new Scanner(System.in);

	    public static void main(String[] args) {
	        try {
	            float result = manualInputAndDivide();
	            System.out.println("Result: " + result);
	        } catch (NumberFormatException | ArithmeticException e) {
	            e.printStackTrace();
	        }

	        System.out.println("****Finish***** ");

	        ip.close();
	    }

	    private static float manualInputAndDivide() {
	        int a = 0;
	        int b = 0;

	        while (true) {
	            try {
	                a = manualInput("Enter a: ");
	                b = manualInput("Enter b: ");
	                if (a == 0) {
	                    throw new ArithmeticException("Denominator should not be zero");
	                }
	                break;
	            } catch (NumberFormatException e) {
	                System.out.println("Invalid input! Please enter a number!");
	            } catch (ArithmeticException e) {
	                System.out.println(e.getMessage());
	            }
	        }

	        return -((float) b) / a;
	    }

	    private static int manualInput(String text) {
	        System.out.print(text);
	        return Integer.parseInt(ip.nextLine());
	    }
}
