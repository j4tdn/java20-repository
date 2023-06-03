package view;

import java.util.Scanner;

public class Ex01IsMultiple {
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
			if (isMultiple(N)) {
				System.out.println(N + " is multiple number !!!");
			} else {
				System.out.println(N + " is not multiple number !!!");
			}
		} else {
			System.out.println("Bạn đã nhập sai quá 5 lần !!!");
		}
		System.out.println("Finish ...");
		sc.close();
	}

	private static boolean isMultiple (int number) {
		return number % 2 == 0;
	}
}
