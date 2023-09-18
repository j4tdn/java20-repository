package utils;

import java.util.Arrays;

import bean.SortOrder;

public class ArraysUtils {
	private ArraysUtils() {
		
	}
	
	private static void reverse(int[] number) {
		int n = number.length;
		for(int i = 0 ; i < n/2;i++) {
			int temp = number[i];
			number[i] = number[n-i-1];
			number[n-i-1] = temp;
		}
	}
	
	//Sort
	public static void sort(int[] elements) {
		Arrays.sort(elements);
	}
	
	//Sort with custom
	public static void sort(int[] elements, SortOrder sortOrder) {
		Arrays.sort(elements);
		if(sortOrder.equals(sortOrder.DESC)) {
			reverse(elements);
		}
	}
	
	public static void generate(String prefix, int[] elements) {
		System.out.println(prefix + " --> { ");
		for(Object element : elements) {
			System.out.println("\t" + element);
		}
		System.out.println("}");
	}
	
	public static void generate(String prefix, String[] elements) {
		System.out.println(prefix + " --> { ");
		for(Object element : elements) {
			System.out.println("\t" + element);
		}
		System.out.println("}");
	}
	
	public static void generate(String prefix, Object[] elements) {
		System.out.println(prefix + " --> { ");
		for(Object element : elements) {
			System.out.println("\t" + element);
		}
		System.out.println("}");
	}

	public static void swap(int[] elements, int i, int j) {
		int temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}

	public static void swap(Object[] elements, int i, int j) {
		Object temp = elements[i];
		elements[i] = elements[j];
		elements[j] = temp;
	}
}
