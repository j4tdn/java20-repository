package view.z1.generic.method;

public class Ex01BasicDemo_ArrayPrint {

	public static void main(String[] args) {
		// Write program to print all elements from Array
		
		// Handle with array of elements
		Integer[] aOIntegers = { 1, 5, 8, 4, 2, 10 };
		Double[] aODoubles = {2.2d, 7.4d, 4.6d, 8.8d};
		String[] aOStrings = {"a", "d", "b", "c"};
		
		System.out.println("--- print array using oop polymorphism ---");
		printArray_UsingOop(aOIntegers);
		printArray_UsingOop(aODoubles);
		printArray_UsingOop(aOStrings);
		
		System.out.println("\n--- print array using generic method ---");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
	}
	
	// Đa hình trong đối tượng
	// Cha = Con
	public static void printArray_UsingOop(Object[] objects) {
		for (Object object: objects) {
			System.out.print(object + " ");
		}
		System.out.println();
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
