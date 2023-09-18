package view.sorting.theory;

import functional.ArraySortBool;
import functional.Comparator_Int;
import utils.ArraysUtils;

public class Ex01BubbleSort_Int {

	public static void main(String[] args) {

		// Cho mảng số nguyên không âm
		int[] elements = { 1, 5, 8, 2, 4, 9 };
		ArraysUtils.generate("Number ", elements);
		// 1. Sắp xếp các phần tử tăng dần
		sort(elements, new Comparator_Int() {
			
			@Override
			public int compare(int a, int b) {

				return a - b;
			}
		});
		ArraysUtils.generate("Number sorting ascending", elements);
		// 2. Sắp xếp các phần tử giảm dần
		sort(elements, new Comparator_Int() {
			
			@Override
			public int compare(int a, int b) {
				return b - a;
			}
		});
		ArraysUtils.generate("Number sorting descending", elements);
		
		
	}
	
	private static void sort(int[] elements,ArraySortBool aSort) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++) {
			// iterate elements
			for (int j = 0; j < length - i - 1; j++) {
				if (aSort.compare(elements[j], elements[j+1])) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}
	
	private static void sort(int[] elements, Comparator_Int aSort) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++) {
			// iterate elements
			for (int j = 0; j < length - i - 1; j++) {
				if (aSort.compare(elements[j], elements[j+1]) > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}

	private static void sortAsc(int[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++) {
			// iterate elements
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j] - elements[j + 1] > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}
	
	private static void sortDesc(int[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++) {
			// iterate elements
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j + 1] - elements[j] > 0) {
					ArraysUtils.swap(elements, j, j + 1);
				}
			}
		}
	}

}
