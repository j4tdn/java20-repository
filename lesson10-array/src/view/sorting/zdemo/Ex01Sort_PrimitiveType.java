package view.sorting.zdemo;

import java.util.Arrays;

import ArrayUtils.ArraysUtils;
import bean.SortOrder;

public class Ex01Sort_PrimitiveType {
	public static void main(String[] args) {
		int[] numbers = {1,5,8,2,4,9};
		ArraysUtils.sort(numbers);
		ArraysUtils.generate("After sort -->", numbers);
		
		
		//sort with primitive type -> only support ACS , no custom
		//similar to char, double
		ArraysUtils.sort(numbers, SortOrder.DESC);
		ArraysUtils.generate("After sort --> ", numbers);
	}
}
