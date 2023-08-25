package Ex04;

import java.util.Scanner;

public class Permutation {

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void permute(char[] arr, int l, int r) {
		if (l == r) {
			System.out.println(String.valueOf(arr));
		} else {
			for (int i = l; i <= r; i++) {
				swap(arr, l, i);
				permute(arr, l + 1, r);
				swap(arr, l, i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một chuỗi kí tự:");
		String s = sc.nextLine();
		char[] arr = s.toCharArray();
		permute(arr, 0, arr.length - 1);
	}
}
