package view.z1.generic.method;

import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex03BasicDemo_ListPrint {
	public static void main(String[] args) {
		// Write program to sort all elements from Array, List

		// Handle with list of elements
		List<Integer> aOIntegers = List.of(1, 5, 8, 4, 2, 10);
		List<Double> aODoubles = List.of(2.2d, 7.4d, 4.6d, 8.8d);
		List<String> aOStrings = List.of( "a", "d", "b", "c" );
		List<Item> aOItems = List.of(DataModel.mockArrayOfItem());

		System.out.println("--- print array using generic polymorphism ---");
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
		printArray_UsingGeneric(aOItems);
	}
	
	// Integer[], Double[], String[] là con của Object[] --> Áp dụng oop
	// List<Integer>, List<Double>, List<String> không phải là con của List<T>

	// Đa hình trong đối tượng --> Failed
	// Cha = Con
//	public static void printArray_UsingOop(Object[] objects) {
//		for (Object object : objects) {
//			System.out.print(object + " ");
//		}
//		System.out.println();
//	}

	// Sử dụng generic method
	// <E>: generic type, tự định nghĩa, mặc định nó là KDL đối tượng
	// : phạm vi sử dụng trong hàm nó khai báo
	//
	public static <E> void printArray_UsingGeneric(List<E> es) {
		for (E e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
