package view.sorting.theory;

import static utils.ArrayUtils.*;

import functional.ArraySortBool;
import functional.Comparator_Int;

public class Ex01BubbleSort_Int {

	public static void main(String[] args) {

		// Cho 1 mảng số nguyên không âm
		int[] numbers = { 1, 5, 8, 2, 4, 9 };
		generate("numbers", numbers);

		// 1. Sắp xếp các phần tử tăng dần
		// sortAsc(numbers);
		// sort(numbers, (n1, n2) -> n1 > n2);
		sort(numbers, (int n1, int n2) -> n1 - n2);
		generate("numbers sort ascending", numbers);

		// 2. Sắp xếp các phần tử giảm dần
		// sortDesc(numbers);
		// sort(numbers, (n1, n2) -> n1 < n2);
		sort(numbers, (int n1, int n2) -> n2 - n1);
		generate("numbers sort descending", numbers);

	}

	// Sort Java
	public static void sort(int[] elements, Comparator_Int aSort) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++)
			// iterate elements
			for (int j = 0; j < length - i - 1; j++)
				if (aSort.compare(elements[j], elements[j + 1]) > 0)
					swap(elements, j, j + 1);
	}

	// Sort
	public static void sort(int[] elements, ArraySortBool aSort) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++)
			// iterate elements
			for (int j = 0; j < length - i - 1; j++)
				if (aSort.compare(elements[j], elements[j + 1]))
					swap(elements, j, j + 1);
	}

	// Ascending Sort
	public static void sortAsc(int[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++)
			// iterate elements
			for (int j = 0; j < length - i - 1; j++)
				if (elements[j] > elements[j + 1])
					swap(elements, j, j + 1);
	}

	// Descending Sort
	public static void sortDesc(int[] elements) {
		int length = elements.length;
		// iterate round
		for (int i = 0; i < length; i++)
			// iterate elements
			for (int j = 0; j < length - i - 1; j++)
				if (elements[j] < elements[j + 1])
					swap(elements, j, j + 1);
	}

}
