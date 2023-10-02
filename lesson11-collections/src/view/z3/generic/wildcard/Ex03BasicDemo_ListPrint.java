package view.z3.generic.wildcard;

import java.util.List;

public class Ex03BasicDemo_ListPrint {

	public static void main(String[] args) {
		// Write program to print all elements from List
		
		// Number: Integer, Double, BigDecimal
		//CharSequence: String
		//Object: all
		List<Integer> lOIntegers = List.of(1, 5, 8, 4, 2, 10);
		List<Double> lODoubles = List.of(2.2d, 7.4d, 4.6d, 8.8d);
		List<String> lOStrings = List.of("a", "d", "b", "c");
		List<Number> lONumbers = List.of(3, 2, 4.6d, 8.8d);
		List<CharSequence> lOChar = List.of("a", "d", "b", "c");
		
		
		System.out.println("--- print list using oop polymorphism ---");
		printList_UsingGeneric(lOIntegers);
	    printList_UsingGeneric(lODoubles);
	    printList_UsingGeneric(lOStrings);
	    printList_UsingGeneric(lONumbers);
	    printList_UsingGeneric(lOChar);
		
		System.out.println("\n--- print list using generic method ---");
	    printList_UsingGenericType(lOIntegers);
	    printList_UsingGenericType(lODoubles);
	    printList_UsingGenericType(lOStrings);
	    printList_UsingGenericType(lONumbers);
	    printList_UsingGenericType(lOChar);
	}
	
	
	public static <E> void printList_UsingGeneric(List<E> es) {
		for (E e: es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	//List<?> = List<E> = List<Object> 
	public static void printList_UsingGenericType(List<?> es) {
		for (Object e: es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}