package view.z1.generic.method;

import java.util.Arrays;

public class Ex01BasicDemo_ArrayPrint {
	
	// Write a program to print all elements from Array
	
	public static void main(String[] args) {
		// Handle with array of elements
		Integer[] aOIntegers = { 1, 5, 8, 4, 2, 10 };
		Double[] aODoubles = { 2.2d, 7.4d, 4.6d, 8.8d };
		String[] aOStrings = { "a", "d", "b", "c" };
		
		System.out.println("--- print array use oop polymorphism ---");
		printArray_UsingOop(aOIntegers);
		printArray_UsingOop(aODoubles);
		printArray_UsingOop(aOStrings);	
		
		System.out.println("\n\n--- print array use generic type ---");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
	}
	
	public static void printArray_UsingOop(Object[] objects) {
		System.out.println();
		for (Object object : objects)
			System.out.print(object + " ");
	}
	
	public static <E> void printArray_UsingGeneric(E[] es) {
		System.out.println();
		for (E e : es)
			System.out.print(e + " ");
	}
	
}
