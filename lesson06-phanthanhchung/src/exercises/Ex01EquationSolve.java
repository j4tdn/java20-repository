package exercises;

import java.text.ParseException;
import java.util.Scanner;

public class Ex01EquationSolve {
	public static void main(String[] args) {
		solveEquation();
	}
	
	private static void solveEquation(){
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.print("Please enter number a: ");
		do {
			try {
				a = Integer.parseInt(sc.nextLine());
				break;
			} catch(NumberFormatException e){
				System.out.println("Invalid input. Please enter a number");
			}
		} while(true);
		System.out.println("The number a is " + a + "\n");
		
		System.out.print("Please enter number b: ");
		do {
			try {
				b = Integer.parseInt(sc.nextLine());
				break;
			} catch(NumberFormatException e){
				System.out.println("Invalid input. Please enter a number");
			}
		} while(true);
		System.out.println("The number b is " + b + "\n");
		System.out.println("The equation is: " + a + "x + " + b + " = 0\n");
		
		do {
			try {
				System.out.printf("The result of the equation is: %.2f", divide(-b, a));
				break;
			} catch(ArithmeticException e){
				System.out.println("a should not be zero, enter again.");
				a = sc.nextInt();
			}
		} while (true);
	}
	
	private static double divide(int a, int b) {
		return (double)a / b;
	}
}
