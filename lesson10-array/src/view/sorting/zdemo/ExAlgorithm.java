package view.sorting.zdemo;

import java.util.Arrays;

public class ExAlgorithm {
	public static void main(String[] args) {
		int[] number = { 5, 6, 7, 8, 1, 2, 3, 4 };
		bubbleSort(number);
		System.out.println("\n======\n");
		int[] numbers = { 5, 6, 7, 8, 1, 2, 3, 4 };
		selectionSort(numbers);
		
		System.out.println("\n======\n");
		int[] numberss = { 5, 6, 7, 8, 1, 2, 3, 4 };
		insertionSort(numberss);
	}

	public static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

	public static void selectionSort(int[] array) {
		int n = array.length;
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[i]) {
					swap(array, j, i);
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}
	
	public static void insertionSort(int[] array) {
		int n = array.length;
		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[i]) {
					swap(array, j, i);
				}
			}
			System.out.println(Arrays.toString(array));
		}
	}

	public static void swap(int[] elements, int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
