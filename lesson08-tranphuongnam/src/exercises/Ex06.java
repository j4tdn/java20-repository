package exercises;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giới hạn của dãy số: ");
		int k = Integer.parseInt(sc.nextLine());
		char result = findStringAtPosK(k);
		System.out.println("number at k: " + result);
	}

	public static char findStringAtPosK(int k) {
		String str = "";
		for (int i = 1; i <= k; i++) {
			str = str + i;
		}
		System.out.println(str);
		System.out.println(str.length());
		return str.charAt(k);
	}
}