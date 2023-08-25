package Ex03;

import java.util.Arrays;
import java.util.Scanner;

public class LevelSort {

	public static int level(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void levelSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (level(arr[i]) > level(arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử của mảng (3 < n < 20):");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhập vào các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Mảng trước khi sắp xếp:");
		System.out.println(Arrays.toString(arr));
		levelSort(arr);
		System.out.println("Mảng sau khi sắp xếp:");
		System.out.println(Arrays.toString(arr));
	}
}