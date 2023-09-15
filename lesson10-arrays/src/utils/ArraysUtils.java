package utils;

import java.util.Arrays;

import bean.SortOrder;


public class ArraysUtils {
	private ArraysUtils() {
		
	}
	
	public static void sort(int[] elements, SortOrder sortOrder) {
		Arrays.sort(elements);
		if (SortOrder.DESC.equals(sortOrder)) {
			reverse(elements);
		}
	}
	
	public static void swap(int[] elements, int i, int j) {
		if (isValidIndex(i, elements) && isValidIndex(j, elements)) {
			int tmp = elements[i];
			elements[i] = elements[j];
			elements[j] = tmp;
		}		
	}
	
	public static void swap(String[] elements, int i, int j) {
		if (isValidIndex(i, elements) && isValidIndex(j, elements)) {
			String tmp = elements[i];
			elements[i] = elements[j];
			elements[j] = tmp;
		}		
	}
	
	public static void swap(Object[] elements, int i, int j) {
		if (isValidIndex(i, elements) && isValidIndex(j, elements)) {
			Object tmp = elements[i];
			elements[i] = elements[j];
			elements[j] = tmp;
		}		
	}
	
	public static void generate(String prefix, int[] elements) {
		System.out.print(prefix + " --> { ");
		for (int element: elements) {
			System.out.print(element + " ");
		}
		System.out.println("}\n");
	}
	
	public static void generate(String prefix, Object[] elements) {
		System.out.println(prefix + " --> {");
		for (Object element: elements) {
			System.out.println("\t" + element);
		}
		System.out.println("}\n");
	}
	
	public static void reverse(int[] numbers) {
		int length = numbers.length;
		for (int i = 0; i < length / 2; i++) {
			int tmp = numbers[i];
			numbers[i] = numbers[length - i - 1];
			numbers[length - i - 1] = tmp;
		}
	}
	
	private static boolean isValidIndex(int i, int[] elements) {
		return i >= 0 && i < elements.length;
	}
	
	private static boolean isValidIndex(int i, String[] elements) {
		return i >= 0 && i < elements.length;
	}
	
	private static boolean isValidIndex(int i, Object[] elements) {
		return i >= 0 && i < elements.length;
	}
}
