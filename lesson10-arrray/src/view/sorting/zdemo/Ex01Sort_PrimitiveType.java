package view.sorting.zdemo;

import java.util.Arrays;

import bean.SortOrder;
import utils.ArrayUtils;

public class Ex01Sort_PrimitiveType {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 6, 4, 2, 9};
		
		//sort with primitive type only support ASC, no custom
		//similar to char, double...
		Arrays.sort(numbers);
		System.out.println("1. sort numbers with ASC--> " + Arrays.toString(numbers));
		ArrayUtils.sort(numbers, SortOrder.DESC);
		System.out.println("2. sort numbers with DESC--> " + Arrays.toString(numbers));
		
	}
}
