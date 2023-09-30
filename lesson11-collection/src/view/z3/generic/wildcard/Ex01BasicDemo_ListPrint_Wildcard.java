package view.z3.generic.wildcard;

import java.math.BigDecimal;
import java.util.List;

public class Ex01BasicDemo_ListPrint_Wildcard {

	public static void main(String[] args) {

		// Number: Integer, Double, Bigdecimal
		// CharSequence: String
		// Object: All
		
		
		List<Integer> lOIntegers = List.of(1, 5, 8, 2, 9);
		List<Double> lODoubles = List.of(1.2d, 5.9d, 2.3d, 4.9d);
		List<String> lOStrings = List.of("a", "b", "h", "c");
		
		List<Number> lONumbers = List.of(1, 2d, BigDecimal.TEN);
		List<CharSequence> lOChars = List.of("x", "z", "k");
		
		
		System.out.println("\n-- print list using generic method, generic type--\n");
		
		printList_UsingGeneric(lOIntegers);
		printList_UsingGeneric(lODoubles);
	//	printList_UsingGeneric(lOStrings);
		printList_UsingGeneric(lONumbers);
	//	printList_UsingGeneric(lOChars);
		
		System.out.println("\n-- print list using generic method, generic wildcard--\n");

		printList_UsingGenericWildCard(lOIntegers);
	//	printList_UsingGenericWildCard(lODoubles);
	//	printList_UsingGenericWildCard(lOStrings);
		printList_UsingGenericWildCard(lONumbers);
	//	printList_UsingGenericWildCard(lOChars);
		
		
	}
	
	// list1<T>.addAll(list2<? extends T>
	
	public static <E> void addAll_GType(List<E> list1, List<E> list2) {
		list1.addAll(list2);
	}
	
	public static void addAll_GWildCard(List<?> list1, List<?> list2) {
		// list1.addAll(list2);
	}

	// generic type: E extends
	public static <E extends Number> void printList_UsingGeneric(List<E> es) {
		for (E e : es) {
			// item.get...
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	// List<?> = List<E> = List<Object>
	// ? extends X --> X hoặc con của X
	// ? super 	 X --> X hoặc cha của X
	public static void printList_UsingGenericWildCard(List<? super Integer> es) {
		for (Object e : es) {
			// convert item...
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
