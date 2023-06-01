package controlling;

import java.util.Scanner;

public class Ex04TestingAndDoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String numberAsTest = sc.nextLine();
		// \\d là kiểu số nguyên và + là 1 hay nhiều số.
		
		if(numberAsTest.matches("\\d+")) {
			System.out.println("OK");
		}
	}
}
