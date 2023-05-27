package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06MinMax {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int count = 0;
		int[] numbers = new int[3];
		do {
			System.out.print("enter a number: ");
			String check = ip.nextLine();
			if (check.matches("[0-9]|1\\d|19")) {
				int number = Integer.parseInt(check);
				numbers[count++] = number;
			} else {
				System.out.println("invalid number, plz enter again!!!");
			}
		} while (count < 3);
		
		int[] result = getMinMax(numbers);
		System.out.println("min: " + result[0]);
		System.out.println("max: " + result[1]);
	}
	
	private static int[] getMinMax(int[]numbers) {
		 int min, max;
		 min = max = numbers[0];
		 
		 for (int i = 0; i < numbers.length; i++) {
			 if (min > numbers[i]) min = numbers[i];
			 if (max < numbers[i]) max = numbers[i];
		 }
		 return new int[] {min, max};
				
		 
	}
	
	
	
}
