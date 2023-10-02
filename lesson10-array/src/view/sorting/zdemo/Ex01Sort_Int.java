package view.sorting.zdemo;

import java.util.Arrays;

public class Ex01Sort_Int {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 8, 2, 4, 9};
		
		//sort with primitive type --> only support ÁC, no custom
		Arrays.sort(numbers);
		System.out.println("1. Sort numbers with ASC --> " + Arrays.toString(numbers));
		System.out.println("\n");
		
	}
}
