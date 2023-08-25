package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex01CountTheNumberOfCommonElements {
	public static void main(String[] args) {
		int[] arr1 = { 2, 8, 9, 1, 6 };
		int[] arr2 = { 2, 1, 1, 8, 9 };
		List<Integer> elements = findElements(arr1, arr2);

		System.out.println("\n---- The Number Of Common Elements ----\n");
		for (int element : elements) {
			System.out.print(" " + element + " ");
		}
	}

	private static List<Integer> findElements(int[] arr1, int[] arr2) {
		List<Integer> elements = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for (int num : arr1) {
			set.add(num);
		}
		for (int num : arr2) {
			if (set.contains(num) && !elements.contains(num)) {
				elements.add(num);
			}
		}

		return elements;
	}

}
