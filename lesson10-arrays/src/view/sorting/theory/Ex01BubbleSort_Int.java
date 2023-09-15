package view.sorting.theory;

import static utils.ArraysUtils.*;

import functional.ArraySortBool;
import functional.Comparator_Int;

public class Ex01BubbleSort_Int {
	// Tăng dần: Trước lớn hơn Sau --> Sai vị trí --> Hoán vị

	// Giảm dần: Trước nhỏ hơn Sau --> Sai vị trí --> Hoán vị

	public static void main(String[] args) {

		// Cho 1 mảng số nguyên không âm
		int[] numbers = { 1, 5, 8, 2, 4, 9 };

		generate("numbers", numbers);

		// 1. Sắp xếp các phần tử tăng dần
		// sortAsc(numbers);
		// sort(numbers, (n1, n2) -> n1 > n2);
		sort(numbers, (int n1, int n2) -> {
			return n1 - n2;
		});
		generate("numbers sort ascending", numbers);

		// 2. Sắp xếp các phần tử giảm dần
		// sortDesc(numbers);
		// sort(numbers, (n1, n2) -> n1 < n2);
		sort(numbers, (int n1, int n2) -> {
			return n2 - n1;
		});
		generate("numbers sort descending", numbers);
	}

	public static void sort(int[] elements, Comparator_Int aSort) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				// KQ compare j và j+1 > 0 --> hoán vị
				if (aSort.compare(elements[j], elements[j + 1]) > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	// Sắp xếp
	// ASC : elements[j] > elements[j+1]
	// DESC: elements[j] < elements[j+1]

	// Function Interface
	// boolean compare(int a, int b)
	public static void sort(int[] elements, ArraySortBool aSort) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				// KQ compare j à j+1 true --> hoán vị
				if (aSort.compare(elements[j], elements[j + 1])) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	// Tăng dần (ascending)
	public static void sortAsc(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j] - elements[j + 1] > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}

	// Giảm dần (descending)
	public static void sortDesc(int[] elements) {
		int length = elements.length;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j + 1] - elements[j] > 0) {
					swap(elements, j, j + 1);
				}
			}
		}
	}
}
