package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06FindElement {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("nhập k: ");
		Integer k = ip.nextInt();

		System.out.println(findNumber(k));

	}
	
	private static int findNumber(int k) {
		int num = 0;
		String s = "";
		while (true) {	
			s += ++num;
			if (num == k) {
				System.out.print(s);
				System.out.println();
				return num;
			}
		}
	}
	
}
