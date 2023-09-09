package view.sorting.theory;

import static utils.ArrayUtils.generate;
import static utils.ArrayUtils.swap;

import functional.Comparator_Boolean;
import functional.Comparator_Int;

public class Ex01BubbleSort_Int {

	public static void main(String[] args) {
		// cho 1 mảng số nguyên ko âm
		
		// 1. sort by ascending
		
		// 2. sort by descending
		
		int[] numbers = {1, 4, 2, 8, 5};
		// ascending
		sort(numbers, (int n1 , int n2) -> {
			return n1 - n2;
		});
		generate("ascending --> ", numbers);
		
		// descending
		sort(numbers, (int n1 , int n2) -> {
			return n2 - n1;
		});
		generate("descending --> ", numbers);
	}
	
	private static void sort(int[] elements, Comparator_Int comp) {
		int length = elements.length;
		for(int round = 0; round < length - 1; round++) {
			for (int i = 0; i < length - round - 1; i++) {
				if (comp.compare(elements[i], elements[i + 1]) > 0) {
					swap(elements, i, i + 1);
				}
			}
		}
	}
	
	private static void sort(int[] elements, Comparator_Boolean comp) {
		int length = elements.length;
		for(int round = 0; round < length - 1; round++) {
			for (int i = 0; i < length - round - 1; i++) {
				if (comp.compare(elements[i], elements[i + 1])) {
					swap(elements, i, i + 1);
				}
			}
		}
	}
	
	// ascending
	private static void sortAsc(int[] elements) {
		int length = elements.length;
		for(int round = 0; round < length - 1; round++) {
			for (int i = 0; i < length - round - 1; i++) {
				if (elements[i] > elements[i + 1]) {
					swap(elements, i, i + 1);
				}
			}
		}
	}
	
	// descending
	private static void sortDesc(int[] elements) {
		int length = elements.length;
		for(int round = 0; round < length - 1; round++) {
			for (int i = 0; i < length - round - 1; i++) {
				if (elements[i] < elements[i + 1]) {
					swap(elements, i, i + 1);
				}
			}
		}
	}
}
