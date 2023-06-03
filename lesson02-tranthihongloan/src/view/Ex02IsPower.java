package view;

import java.util.Scanner;

public class Ex02IsPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = "";
		int i = 0;
		do {
			System.out.print("Enter valid number: ");
			st = sc.nextLine();
			i++;
		} while (!st.matches("\\d+") && i < 5);
		
		if (i < 5) {
			int N = Integer.parseInt(st);
			if (isPower(N)) {
				System.out.println(N + " is power number !!!");
			} else {
				System.out.println(N + " is not power number !!!");
			}
		} else {
			System.out.println("Bạn đã nhập sai quá 5 lần !!!");
		}
		System.out.println("Finish ...");
		sc.close();
	}

	private static boolean isPower (int number) {
		while(number != 2 && number != 1 && number % 2 == 0) {
			number = number / 2;
		}
		return number == 2;
	}
}
