package view.z1.generic.method;

import java.util.List;

import bean.DataModel;
import bean.Item;

public class Ex03BasicDemo__ListPrint {
	public static void main(String[] args) {
		// write program to print all elements from array, List

		// Handle with array of elements
		List<Integer> aLIntegers = List.of(1, 5, 7, 8, 2, 5, 4);
		List<Double> aLDoubles = List.of(2.2d, 3.21d, 6.4d, 7.3d);
		List<String> aLStrings = List.of("as", "d", "c", "d");
		List<Item> aLItem = DataModel.mockItems();

		printList_Using(aLIntegers);
		printList_Using(aLDoubles);
		printList_Using(aLStrings);
		printList_Using(aLItem);

//		sort(aODoubles);
//		sort(aOItem);
		// handle with list of elements
	}

	public static <E> void printList_Using(List<E> es) {
		System.out.println();
		for (E e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	// Da hinh trong doi tuong
	// Cha = Con
	// <E>: generic type, tu dinh nghia
	// : pham vi su dung trong ham no khai bao
	public static <E> void printArray_UsingGeneric(E[] elements) {
		System.out.println();
		for (E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
