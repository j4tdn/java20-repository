package view.z1.generic.method;

public class Ex01BasicDemo_ArraySorting {
	
	public static void main(String[] args) {
		// Handle with array of elements
		Integer[] aOIntegers = {1, 5, 8, 4, 2, 10};
		Double[] AODoubles = {2.2d, 7.4d, 4.6d, 8.8d};
		String[] aOStrings = {"a", "d", "b", "c"};
		
		System.out.println("--- print array using oop polymorphism");
		printArray_UsingOop(aOIntegers);
		printArray_UsingOop(AODoubles);
		printArray_UsingOop(aOStrings);
		
		System.out.println("--- print array using oop polymorphism");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(AODoubles);
		printArray_UsingGeneric(aOStrings);
		
		// Handle with list of elements
	}
	
	// Đa hình trong đối tượng
	// Cha = Con
	public static void printArray_UsingOop(Object[] objects) {
		System.out.println();
		for (Object object: objects) {
			System.out.println(object + " ");
		}
		System.out.println();
	}
	
	// Sử dụng generic method
	// <E>: generic type, tự định nghĩa
	//	  : phạm vi sử dụng trong hàm nó khai báo
	
	public static <E> void printArray_UsingGeneric(E[] es) {
		for (E e: es) {
			System.out.println(e + " ");
		}
		System.out.println();
	}

}
