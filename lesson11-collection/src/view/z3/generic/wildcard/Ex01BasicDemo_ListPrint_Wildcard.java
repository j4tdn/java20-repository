package view.z3.generic.wildcard;

import java.math.BigDecimal;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex01BasicDemo_ListPrint_Wildcard {
	public static void main(String[] args) {
		// Write program to sort all elements from Array, List

		// Number: Integer, Double, BigDecimal,...
		// CharSequence: String
		// Object: All
		
		// Handle with list of elements
		List<Integer> aOIntegers = List.of(1, 5, 8, 4, 2, 10);
		List<Double> aODoubles = List.of(2.2d, 7.4d, 4.6d, 8.8d);
		List<String> aOStrings = List.of( "a", "d", "b", "c" );
		
		List<Number> lONumbers = List.of(1, 2d, BigDecimal.TEN);
		List<CharSequence> lOCharSequences = List.of("x", "z", "k");

		System.out.println("--- print array using generic method, generic type ---");
		printArray_UsingGenericType(aOIntegers);
		printArray_UsingGenericType(aODoubles);
		printArray_UsingGenericType(aOStrings);
		printArray_UsingGenericType(lONumbers);
		printArray_UsingGenericType(lOCharSequences);
		
		System.out.println("--- print array using generic method, generic wildcard ---");
		printArray_UsingGenericWildcard(aOIntegers);
		printArray_UsingGenericWildcard(aODoubles);
		printArray_UsingGenericWildcard(aOStrings);
		printArray_UsingGenericWildcard(lONumbers);
		printArray_UsingGenericWildcard(lOCharSequences);
	}
	
	public static <E> void addAll_GType(List<E> list1, List<E> list2) {
		list1.addAll(list2);
	}
	
	//	public static void addAll_GWildcard(List<?> list1, List<?> list2) {
	//		list1.addAll(list2);
	//	}
	
	// generic type: E extends ...
	public static <E> void printArray_UsingGenericType(List<E> es) {
		for (E e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
	
	// List<?> = List<E> = List<Object>
	// ? extends 
	public static <E> void printArray_UsingGenericWildcard(List<?> es) {
		for (Object e : es) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}
