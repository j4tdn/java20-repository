package view.z1.generic.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03BasicDemo_ListPrint {
	
	// Write a program to print all elements from List
	
	public static void main(String[] args) {
		
		// Handle with array of elements
		List<Integer> lOIntegers = List.of(1, 5, 8, 4, 2, 10);
		List<Double> lODoubles = List.of(2.2d, 7.4d, 4.6d, 8.8d); 
		List<String> lOStrings = List.of("a", "d", "b", "c");
		
		/*
		System.out.println("--- print list use oop polymorphism ---");
		printList_UsingOop(lOIntegers);
		printList_UsingOop(lODoubles);
		printList_UsingOop(lOStrings);	
		*/
		// => Phải truyền vào đúng List<Object> mới hết lỗi
		
		System.out.println("\n--- print list use generic type ---");
		printList_UsingGeneric(lOIntegers);
		printList_UsingGeneric(lODoubles);
		printList_UsingGeneric(lOStrings);
	}
	
	// Integer[], Double[], String[] là con của Object[]
	// List<Integer>, List<Double>, List<String> không phải là con của List<Object>
	/*
	public static void printList_UsingOop(List<Object> objects) {
		System.out.println();
		for (Object object : objects)
			System.out.print(object + " ");
	}
	*/
	
	public static <E> void printList_UsingGeneric(List<E> es) {
		for (E e : es)
			System.out.print(e + " ");
		System.out.println();
	}
	
}
