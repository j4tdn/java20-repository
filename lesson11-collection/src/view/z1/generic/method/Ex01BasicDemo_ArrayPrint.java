package view.z1.generic.method;

public class Ex01BasicDemo_ArrayPrint {

	public static void main(String[] args) {
		// write programming to print all element from array, list
		
		// Handle with array of elements
		Integer[] aOIntegers = { 1, 5, 8, 2, 9 };
		Double[] aODoubles = { 1.2d, 5.9d, 2.3d, 4.9d };
		String[] aOStrings = { "a", "b", "h", "c" };
		System.out.println("--- print using oop porlymorphism ---");
		printArray_UsingOop(aOIntegers);
		printArray_UsingOop(aODoubles);
		printArray_UsingOop(aOStrings);
		
		System.out.println("\n--- print using generic method ---");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
		
		// Handle with list of elements
	}
	
	// đa hình trong đối tượng
	// cha = con
	public static void printArray_UsingOop(Object[] objects) {
		for (Object object: objects) {
			System.out.print(object + " ");
		}
		System.out.println();
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
