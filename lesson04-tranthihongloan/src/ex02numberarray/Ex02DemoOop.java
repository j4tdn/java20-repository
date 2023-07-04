package ex02numberarray;

import java.util.Scanner;

public class Ex02DemoOop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntNumberArray arr = new IntNumberArray();

		System.out.print("Nhập n: ");
		arr.setLength(sc.nextInt());

		// Random dãy số ngẫu nhiên
		Utils.getIntArray(arr);

		// In mảng
		System.out.println(arr.toString());

		// Sắp xếp
		Utils.arrangeArray(arr);

		// In mảng
		System.out.println(arr.toString());

		sc.close();
	}

}
