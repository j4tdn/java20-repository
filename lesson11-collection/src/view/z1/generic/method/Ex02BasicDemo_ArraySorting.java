package view.z1.generic.method;

import java.util.Arrays;

import bean.Item;
import model.DataModel;

public class Ex02BasicDemo_ArraySorting {
	
	public static void main(String[] args) {		
		// Handle with array of elements
		
		Integer[] aOIntegers = {1,8,5,4,2,10};
		Double[] aODboules = {2.2d,7.4d,4.6d,8.8d};
		String[] aOStrings = {"a","c","d","b"};
		Item[] aOItems = DataModel.mockItemsArray();
		
		// Integer, Double, String impls Comparable<?>
		Arrays.sort(aOIntegers);
		Arrays.sort(aODboules);
		Arrays.sort(aOStrings);		
		Arrays.sort(aOItems); // Error at runtime
		
		
		System.out.println("-- print arrays using generic polymorphism");
		sort(aOIntegers);
		sort(aODboules);
		sort(aOStrings);
		//sort(aOItems); // Error at compile
		
	}
	
	//Support to catch error at compile -> 
	public static <Element extends Comparable<Element>> void sort(Element[] elements) {
		Arrays.sort(elements);
	}
	
	//Đa hình trong đối tượng
	//Cha = con
	public static void printArray_OOP(Object[] integers) {
		System.out.println();
		for(Object integer : integers) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}


	// Sử dụng generic method
	// <E>: Generic type, tự định nghĩa, mặc định nó là KDL đối tượng
	//    : Phạm vi sử dụng trong hàm nó khai báo
	public static <E> void printArray_UsingGeneric(E[] es) {
		System.out.println();
		for(Object e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
}
