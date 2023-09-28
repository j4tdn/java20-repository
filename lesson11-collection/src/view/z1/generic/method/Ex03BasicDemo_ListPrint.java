package view.z1.generic.method;

import java.util.Arrays;
import java.util.List;

public class Ex03BasicDemo_ListPrint {

	public static void main(String[] args) {
		// write programming to sort all element from array, list

		// Handle with array of elements
		List<Integer> lOIntegers = List.of(1, 5, 8, 2, 9);
		List<Double> lODoubles = List.of(1.2d, 5.9d, 2.3d, 4.9d);
		List<String> lOStrings = List.of("a", "b", "h", "c");

		printList_UsingGeneric(lOIntegers);
		printList_UsingGeneric(lODoubles);
		printList_UsingGeneric(lOStrings);
		// sort(lOItems); // error at compile


		// Handle with list of elements
	}
	// Integer[], Double[], String[] là con Object[] --> đa hình
	// List<Integer>, List<Double>, List<String> ko phải con List<Object> --> fail
	
	// đa hình trong đối tượng
	// cha = con
//	public static void printList_UsingOop(List<Object> objects) {
//		for (Object object : objects) {
//			System.out.print(object + " ");
//		}
//		System.out.println();
//	}

	// sử dụng generic method
	// <E> generic type, tự định nghĩa, mặc định nó là KDL đối tượng
	// phạm vi sử dụng trong hàm khai báo

	public static <E> void printList_UsingGeneric(List<E> es) {
		for (E e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
