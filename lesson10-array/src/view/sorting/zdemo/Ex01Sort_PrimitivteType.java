package view.sorting.zdemo;

import java.util.Arrays;

import bean.SortOrder;
import utils.ArraysUtils;

public class Ex01Sort_PrimitivteType {
	
	public static void main(String[] args) {
		
		int[] numbers = { 1, 5, 8, 2, 4, 9 };
		
		// sort with primitive type --> only support ASC, no custom
		// similar to char, double ...
		ArraysUtils.sort(numbers);
		System.out.println("1. Sort numbers with ASC --> " + Arrays.toString(numbers));
		
		System.out.println("\n");
		
		ArraysUtils.sort(numbers, SortOrder.DESC);
		System.out.println("2. Sort numbers with DESC --> " + Arrays.toString(numbers));
	}
}
