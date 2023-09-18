package view.sorting.zdemo;

import java.util.Arrays;

import bean.SortOrder;
import utils.ArrayUtils;

public class Ex01Sort_PrimitiveType {

	public static void main(String[] args) {

		int[] numbers = { 1, 5, 8, 2, 4, 9 };

		// sort with primitive type --> only support ASC, no custom
		Arrays.sort(numbers);
		System.out.println("1. Sort numbers with ASC -->" + Arrays.toString(numbers));

		ArrayUtils.sort(numbers, SortOrder.DESC);
		System.out.println("2. Sort numbers with DESC -->" + Arrays.toString(numbers));

	}

}
