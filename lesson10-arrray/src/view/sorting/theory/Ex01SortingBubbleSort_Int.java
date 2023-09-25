package view.sorting.theory;

import static utils.ArrayUtils.*;

import functional.ArraySortBool;
import functional.Comparator_Int;

public class Ex01SortingBubbleSort_Int {
	public static void main(String[] args) {
		// cho mãng số nguyên không âm 
		int[] numbers = {1, 5, 6, 4, 2, 9};
		// 1. sắp xếp các phần tử tăng dần 
		sortInt(numbers, (n1 , n2) -> n1 - n2);
		generate("numbers sorting ascending", numbers);
		// 2. sắp xếp các phần tử giảm dần 
		
		sortInt(numbers, (n1,n2) -> n2 - n1);
		generate("numbers sorting descending", numbers);
		
		sortDesc(numbers);
		
	}
	public static void sortBool(int[] elements, ArraySortBool sort) {
		int length = elements.length;
		
		//iterate round
		for(int i = 0; i < length; i++) {
			// iterate elements
			for(int j = 0; j < length - i - 1; j++) {
				if(sort.compare(elements[j], elements[j + 1])) {
					 swap(elements, j, j+ 1);
				}
			}
		}
	}
	public static void sortInt(int[] elements, Comparator_Int aSort) {
		int length = elements.length;
		
		//iterate round
		for(int i = 0; i < length; i++) {
			// iterate elements
			for(int j = 0; j < length - i - 1; j++) {
				if(aSort.compare(elements[j], elements[j + 1]) > 0) {
					 swap(elements, j, j+ 1);
				}
			}
		}
	}
	public static void sortAsc(int[] elements) {
		int length = elements.length;
		
		//iterate round
		for(int i = 0; i < length; i++) {
			// iterate elements
			for(int j = 0; j < length - i - 1; j++) {
				if(elements[j] > elements[j + 1]) {
					 swap(elements, j, j+ 1);
				}
			}
		}
	}
	
	private static void sortDesc(int[] elements) {
		int length = elements.length;
		
		//iterate round
		for(int i = 0; i < length; i++) {
			// iterate elements
			for(int j = 0; j < length - i - 1; j++) {
				if(elements[j] < elements[j + 1]) {
					 swap(elements, j, j+ 1);
				}
			}
		}
	}
}
