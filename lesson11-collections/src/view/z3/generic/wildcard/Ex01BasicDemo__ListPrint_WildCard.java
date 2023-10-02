package view.z3.generic.wildcard;

import java.util.List;

import bean.DataModel;
import bean.Item;

public class Ex01BasicDemo__ListPrint_WildCard {
	public static void main(String[] args) {
		List<Integer> aLIntegers = List.of(1, 5, 7, 8, 2, 5, 4);
		List<Double> aLDoubles = List.of(2.2d, 3.21d, 6.4d, 7.3d);
		List<String> aLStrings = List.of("as", "d", "c", "d");
		List<Item> aLItem = DataModel.mockItems();

		printList_Using_GenericType(aLIntegers);
		printList_Using_GenericType(aLDoubles);
		printList_Using_GenericType(aLStrings);
		printList_Using_GenericType(aLItem);


	}

	//generic type: E extends
	public static <E> void printList_Using_GenericType(List<E> es) {
		System.out.println();
		for (E e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	public static <E> void addAll(List<E> list1, List<E> list2) {
		list1.addAll(list2);
	}
	
	// ? extends X --> X or con X
	// ? super X --> X or Cha X
	public static void printList_Using_GenericWildCard(List<?> es) {
		System.out.println();
		for (Object e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

	public static <E> void printArray_Using(E[] elements) {
		System.out.println();
		for (E element : elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
