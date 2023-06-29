package view;

import java.util.Random;
import java.util.Scanner;

public class Ex05LevelOfNaturalNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = scanner.nextInt();
		System.out.println("Level của số " + n + " là: " + findLevel(n));

		System.out.println("\n*****************************\n");
		Random rd = new Random();
		int numOfArrayElement = rd.nextInt(3, 21); // Số lượng phần tử mảng
		int a[] = new int[numOfArrayElement];
		for (int i = 0; i < numOfArrayElement; i++) {
			a[i] = rd.nextInt(50);
		}
		System.out.println("\n ----- Array before sorted -----");
		for (int i : a) {
			System.out.print(i + " ");
		}
		sortArrayAscendingByLevel(a);
		System.out.println("\n ----- Array after sorted by acsending -----");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static int findLevel(int number) {
		int count = 0;
		int sqrt = (int) Math.sqrt(number);
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				count += 2;
			}
		}

		// Count chính là số lượng ước < căn của số đó
		// Nếu là số chính phương thì trừ đi 1
		// Ví dụ 8 -> căn 8 là 2,33333 nghiệm: 1 2 4 8 = count * 2
		// 9 -> căn 9 là 3 nghiệm: 1 3 9 = count * 2 - 1
		if (sqrt * sqrt == number) {
			count--;
		}
		return count;
	}

	private static void sortArrayAscendingByLevel(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (findLevel(a[i]) > findLevel(a[j])) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
