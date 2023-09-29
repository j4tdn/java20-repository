package view.z3.generic.wildcard;

import java.math.BigDecimal;
import java.util.List;

public class Ex01BasicDemo_ListPrint_WildCard {

	public static void main(String[] args) {
		// Write program to print all elements from List
		
		// Number: Integer, Double, BigDecimal ...
		// CharSequence: String
		// Object: All
		
		// Handle with array of elements
		List<Integer> lOIntegers = List.of(1, 5, 8, 4, 2, 10);
		List<Double> lODoubles = List.of(2.2d, 7.4d, 4.6d, 8.8d);
		List<String> lOStrings = List.of("a", "d", "b", "c");
		
		List<Number> lONumbers = List.of(1, 2d, BigDecimal.TEN);
		List<CharSequence> lOChars = List.of("x", "z", "k");
		
		System.out.println("\n--- print list using generic method, generic type ---");
	    // printList_UsingGenericType(lOIntegers);
	    // printList_UsingGenericType(lODoubles);
	    printList_UsingGenericType(lOStrings);
	    // printList_UsingGenericType(lONumbers);
	    printList_UsingGenericType(lOChars);
	    
	    System.out.println("\n--- print list using generic method, generic wildcard ---");
	    printList_UsingGenericWildCard(lOIntegers);
	    // printList_UsingGenericWildCard(lODoubles);
	    // printList_UsingGenericWildCard(lOStrings);
	    printList_UsingGenericWildCard(lONumbers);
	    // printList_UsingGenericWildCard(lOChars);
	    
	}
	
	// list1<T>.addAll(list2<? extends T>)
	
	public static <E> void addAll_GType(List<E> list1, List<E> list2) {
		list1.addAll(list2);
	}
	
	public static void addAll_GWildCard(List<?> list1, List<?> list2) {
		// list1.addAll(list2);
	}
	
	// generic type: E extends ...
	public static <E extends CharSequence> void printList_UsingGenericType(List<E> es) {
		for (E e: es) {
			// item.get...
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	// List<?> = List<E> = List<Object>
	// ? extends X --> X hoặc con của X
	// ? super   X --> X hoặc cha của X
	public static void printList_UsingGenericWildCard(List<? super Integer> es) {
		for (Object e: es) {
			// convert item ...
			System.out.print(e + " ");
		}
		System.out.println();
	}

}
