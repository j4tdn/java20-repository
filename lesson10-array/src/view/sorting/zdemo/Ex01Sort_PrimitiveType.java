package view.sorting.zdemo;

import java.util.Arrays;

import utils.ArrayUtils;

public class Ex01Sort_PrimitiveType {

	public static void main(String[] args) {
		
		int[] numbers = {1, 24, 9, 2, 0};
		
		// sort with primitive type --> only support ASC, no custom
		Arrays.sort(numbers);

		ArrayUtils.generate("sort with asc ", numbers);
		
	}
}
