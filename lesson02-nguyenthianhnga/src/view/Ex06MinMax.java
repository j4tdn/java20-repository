package view;

import java.util.Random;
import java.util.Scanner;

public class Ex06MinMax {

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int a, b, c;

	        System.out.print("Enter a: ");
	        while (true) {
	            try {
	                a = Integer.parseInt(input.next());
	                if (a >= 0 && a < 20) {
	                    break;
	                } else {
	                    System.out.print("Invalid input. Enter a again: ");
	                }
	            } catch (NumberFormatException e) {
	                System.out.print("Invalid input. Enter a again: ");
	            }
	        }
	        
	        System.out.print("Enter b: ");
	        while (true) {
	            try {
	                b = Integer.parseInt(input.next());
	                if (b >= 0 && b < 20) {
	                    break;
	                } else {
	                    System.out.print("Invalid input. Enter b again: ");
	                }
	            } catch (NumberFormatException e) {
	                System.out.print("Invalid input. Enter b again: ");
	            }
	        }

	        System.out.print("Enter c: ");
	        while (true) {
	            try {
	                c = Integer.parseInt(input.next());
	                if (c >= 0 && c < 20) {
	                    break;
	                } else {
	                    System.out.print("Invalid input. Enter c again: ");
	                }
	            } catch (NumberFormatException e) {
	                System.out.print("Invalid input. Enter c again: ");
	            }
	        }

	        int minValue = min(a, b, c);
	        System.out.println("Minimum : " + minValue);

	        int maxValue = max(a, b, c);
	        System.out.println("Maximum : " + maxValue);
	    }

	    public static int min(int a, int b, int c) {
	        int min = a;
	        if (b < min) {
	            min = b;
	        }
	        if (c < min) {
	            min = c;
	        }
	        return min;
	    }

	    public static int max(int a, int b, int c) {
	        int max = a;
	        if (b > max) {
	            max = b;
	        }
	        if (c > max) {
	            max = c;
	        }
	        return max;
	    }
	}
