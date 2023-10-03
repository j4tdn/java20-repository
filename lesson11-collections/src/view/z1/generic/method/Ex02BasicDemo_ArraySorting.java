package view.z1.generic.method;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex02BasicDemo_ArraySorting {
	
	// Write a program to sort all elements from Array
	
	public static void main(String[] args) {
		Integer[] aOIntegers = { 1, 5, 8, 4, 2, 10 };
		Double[] aODoubles = { 2.2d, 7.4d, 4.6d, 8.8d };
		String[] aOStrings = { "a", "d", "b", "c" };
		Item[] aOItems = DataModel.mockArrayOfItems();
		
		sort(aOIntegers);
		sort(aODoubles);
		sort(aOStrings);
		// sort(aOItems);
		
		System.out.println("--- print array use generic type ---");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
		printArray_UsingGeneric(aOItems);
	}
	
	public static <E> void printArray_UsingGeneric(E[] es) {
		for (E e : es)
			System.out.print(e + " ");
		System.out.println();
	}
	
	// support to catch error at compile
	public static <E extends Comparable<E>> void sort(E[] elements) {
		Arrays.sort(elements);
	}
	
}
