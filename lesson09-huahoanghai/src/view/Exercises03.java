package view;

import java.util.Scanner;

public class Exercises03 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập vào một chuỗi: ");
		String inputString = ip.nextLine();
		ip.close();

		String input = revert(inputString);

		System.out.println("Chuỗi sau khi đảo ngược : " + input);
	}

	private static String revert(String s) {
		StringBuilder result = new StringBuilder();
		s = s.trim().replaceAll("\\s+", " ");

		for (int i = s.length() - 1; i >= 0; i--) {
			result.append(s.charAt(i));
		}

		return result.toString();
	}
}
