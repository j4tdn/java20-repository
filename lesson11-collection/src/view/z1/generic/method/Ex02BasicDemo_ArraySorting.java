package view.z1.generic.method;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex02BasicDemo_ArraySorting {

	public static void main(String[] args) {
		// Write program to sort all elements from Array
		
		// Handle with array of elements
		Integer[] aOIntegers = { 1, 5, 8, 4, 2, 10 };
		Double[] aODoubles = {2.2d, 7.4d, 4.6d, 8.8d};
		String[] aOStrings = {"a", "d", "b", "c"};
		Item[] aOItems = DataModel.mockArrayOfItems();
		
		// Integer, Double, String impls Comparable<?>
		sort(aOIntegers);
		sort(aODoubles);
		sort(aOStrings);
		// sort(aOItems);
		
		System.out.println("\n--- print array using generic method ---");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
		printArray_UsingGeneric(aOItems);
	}
	
	// support to catch error at compile
	public static <Element extends Comparable<Element>> void sort(Element[] elements) {
		Arrays.sort(elements);
	}
	
	// Sử dụng generic method
	// <E>: generic type, tự định nghĩa, mặc định nó là KDL đối tượng
	//    : phạm vi sử dụng trong hàm nó khai báo
	//    
	public static <E> void printArray_UsingGeneric(E[] es) {
		for (E e: es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}