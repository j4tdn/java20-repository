package view;

import java.util.Scanner;

public class Ex01MultipleOf2 {
	private static int d = 1;
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int count = 0;
		do {
			System.out.print(d++ + ".enter a number:");
			String sequences = ip.nextLine();
			if (sequences.matches("\\d+")) {
				int number = Integer.parseInt(sequences);
				System.out.println(multipleOf2(number)); 
				break;
			} else {
				System.out.println("invalid number, plz enter again!");
				count++;
			}
		} while (count < 5);
		System.out.println("finished!");
	}

	private static boolean multipleOf2(int number) {
		if (number % 2 == 0) {
			return true;
		} else
			return false;
	}
}
