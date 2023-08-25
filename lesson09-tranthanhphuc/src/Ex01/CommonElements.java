package Ex01;

import java.util.Arrays;

public class CommonElements {
	public static void main(String[] args) {
		int[] arr1 = { 2, 8, 9, 1, 6 };
		int[] arr2 = { 2, 1, 1, 8, 9 };

		int[] commonElements = findCommonElements(arr1, arr2);

		System.out.println("Số phần tử chung là :");
		for (int element : commonElements) {
			if (element != 0) {
				System.out.print(element + " ");
			}
		}
	}

	public static int[] findCommonElements(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int[] commonElements = new int[Math.min(arr1.length, arr2.length)];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				commonElements[k++] = arr1[i];
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}

		return commonElements;
	}
}
