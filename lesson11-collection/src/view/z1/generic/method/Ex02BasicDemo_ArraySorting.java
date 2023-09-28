package view.z1.generic.method;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex02BasicDemo_ArraySorting {

	public static void main(String[] args) {
		// write programming to sort all element from array, list
		
		// Handle with array of elements
		Integer[] aOIntegers = { 1, 5, 8, 2, 9 };
		Double[] aODoubles = { 1.2d, 5.9d, 2.3d, 4.9d };
		String[] aOStrings = { "a", "b", "h", "c" };
		Item[] aOItems = DataModel.mockArrayOfItems();
		
		sort(aOIntegers);
		sort(aODoubles);
		sort(aOStrings);
		// sort(aOItems); // error at compile
		
		System.out.println("\n--- print using generic method ---");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
		printArray_UsingGeneric(aOItems);
		
		
		// Handle with list of elements
	}
	
	// support to catch error at compile
	public static <Element extends Comparable <Element>> void sort(Element[] elements) {
		Arrays.sort(elements);
	}
	
	// sử dụng generic method
	// <E> generic type, tự định nghĩa, mặc định nó là KDL đối tượng
	// phạm vi sử dụng trong hàm khai báo
	public static <E> void printArray_UsingGeneric(E[] es) {
		for (E e: es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
