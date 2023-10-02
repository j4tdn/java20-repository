package view.z1.generic.method;

import java.util.Arrays;

public class Ex01BasicDemo_ArrayPrint {
	
	public static void main(String[] args) {		
		// Handle with array of elements
		
		Integer[] aOIntegers = {1,8,5,4,2,10};
		Double[] aODboules = {2.2d,7.4d,4.6d,8.8d};
		String[] aOStrings = {"a","c","d","b"};
	
		System.out.println("-- print arrays using oop polymorphism");
		printArray_OOP(aOIntegers);
		printArray_OOP(aODboules);
		printArray_OOP(aOStrings);
		
		System.out.println("-- print arrays using generic polymorphism");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODboules);
		printArray_UsingGeneric(aOStrings);
		// Handle with list of elements
		
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
