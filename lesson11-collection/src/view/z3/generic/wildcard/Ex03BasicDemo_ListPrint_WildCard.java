package view.z3.generic.wildcard;

import java.math.BigDecimal;
import java.util.List;

public class Ex03BasicDemo_ListPrint_WildCard {

	public static void main(String[] args) {
		// Write program to print all elements from List
		
		// Number: Integer, Double, BigDecimal ...
		// CharSequence: String
		// Comparable<?> : Object ==> ALL
		
		// Handle with array of elements
		List<Integer> lOIntegers = List.of(1, 5, 8, 4, 2, 10);
		List<Double> lODoubles = List.of(2.2d, 7.4d, 4.6d, 8.8d);
		List<String> lOStrings = List.of("a", "d", "b", "c");
		
		List<Number> lONumbers = List.of(1, 2d, BigDecimal.TEN);
		List<CharSequence> lOChars = List.of("a", "b", "c","d");
		
		
		System.out.println("\n--- print list using generic method ---");
//	    printList_UsingGeneric(lOIntegers);
//	    printList_UsingGeneric(lODoubles);
//	    printList_UsingGeneric(lOStrings);
//	    printList_UsingGeneric(lONumbers);
//	    printList_UsingGeneric(lOChars);
	    
	    System.out.println("\n--- print list using generic wildcard ---");
	    printList_UsingGenericWildCard(lOIntegers);
//	    printList_UsingGenericWildCard(lODoubles);
//	    printList_UsingGenericWildCard(lOStrings);
	    printList_UsingGenericWildCard(lONumbers);
//	    printList_UsingGenericWildCard(lOChars);
	}
   
	public static <E extends CharSequence> void printList_UsingGeneric(List<E> es) {
		for (E e: es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	// List<?> = List<E> = List<Object>
	public static void printList_UsingGenericWildCard(List<? super Integer> es) {
		for (Object e: es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}