package view.z3.generic.wildcard;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Ex01BasicDemo_ListPrint_Wildcard {
	
	// Write a program to print all elements from List
	
	public static void main(String[] args) {
		
		// Handle with array of elements
		List<Integer> lOIntegers = List.of(1, 5, 8, 4, 2, 10);
		List<Double> lODoubles = List.of(2.2d, 7.4d, 4.6d, 8.8d); 
		List<String> lOStrings = List.of("a", "d", "b", "c");
		List<Number> lONumbers = List.of(1, 2d, BigDecimal.TEN); // Number là cha của Integer, Double ...
		List<CharSequence> lOChars = List.of("x", "z", "k");
		
		System.out.println("\n--- print list using generic method, generic type ---");
		printList_UsingGenerictType(lOIntegers);
		printList_UsingGenerictType(lODoubles);
		printList_UsingGenerictType(lOStrings);
		printList_UsingGenerictType(lONumbers);
		printList_UsingGenerictType(lOChars);
		
		System.out.println("\n--- print list using generic method, generic wildcard ---");
		printList_UsingGenericWildcard(lOIntegers);
		printList_UsingGenericWildcard(lODoubles);
		printList_UsingGenericWildcard(lOStrings);
		printList_UsingGenericWildcard(lONumbers);
		printList_UsingGenericWildcard(lOChars);
	}
	
	public static <E> void addAll_GType(List<E> list1, List<E> list2) {
		list1.addAll(list2);
	}
	
	public static void addAll_GWildCard(List<?> list1, List<?> list2) {
		list1.addAll(list2);
	}
	
	public static <E extends CharSequence> void printList_UsingGenerictType(List<E> es) {
		for (E e : es)
			System.out.print(e + " ");
		System.out.println();
	}
	
	// List<?> = List<E> = List<Object>
	public static <E> void printList_UsingGenericWildcard(List<? super Integer> es) {
		for (Object e : es)
			System.out.print(e + " ");
		System.out.println();
	}
	
}
