package test09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex03_SapXepTheoLV {
	public static int countFactors(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void customSort(Integer[] arr) {
		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.comparingInt(Ex03_SapXepTheoLV::countFactors));
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập số phần tử của mảng (3 < n < 20): ");
			int n = scanner.nextInt();
			while (n <= 3 || n >= 20) {
				System.out.print("Vui lòng nhập lại số phần tử trong khoảng từ 4 đến 19: ");
				n = scanner.nextInt();
			}
			Integer[] arr = new Integer[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
				arr[i] = scanner.nextInt();
			}
			customSort(arr);
			System.out.println("Mảng sau khi được sắp xếp theo level tăng dần: " + Arrays.toString(arr));
		}
	}
}
