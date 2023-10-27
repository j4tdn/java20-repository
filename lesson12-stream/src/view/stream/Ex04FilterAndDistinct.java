package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static utils.StreamUtils.*;
public class Ex04FilterAndDistinct {
	public static void main(String[] args) {
		// Q1: filter all odd numbers from a list and makes sure that there are no
		// duplicates

		// using list
		var listNumbers = List.of(1, 2, 4, 1, 2, 4, 5, 5, 6, 7, 8, 8, 9);
		var distinct = listNumbers.stream()	//Stream<Integer>
					.filter(number -> number % 2 != 0)  //Stream<Integer>
					.distinct() //Stream<Integer>
					.collect(Collectors.toList()); //List<Integer>
		generate("1. Distinct odd number", distinct);
		
		// using array
		var arrayNumbers = new int[] {1, 2, 4, 1, 2, 4, 5, 5, 6, 7, 8, 8, 9};
		
		// Stream<T> : Mỗi phần tử là <T>: Integer, Double, Item, String, Tuple
		// Stream<Integer>: Sử dụng các hàm của KDL Stream, áp dụng cho kiểu T
		
		// Primitive Stream -> IntStream(từng phần tử là Int), DoubleStream(từng phần tử là Double), LongStream...
		// IntStream : Sử dụng các hàm đặc thù của primitive Stream Ex: IntStream hỗ trợ cho Int(sum,mul,...)
		//			 : Lưu trữ tránh boxing tốn memory
		int[] distinctArray = Arrays.stream(arrayNumbers) // IntStream
				.filter(number -> number % 2 != 0)		  // IntStream
				.distinct()								  // IntStream
				.toArray();								  // int[]
		
		Arrays.stream(distinctArray).forEach(num -> System.out.println(num));
		
		//Unique
		var letters = new String[] { "aa", "bbb", "c", "a", "b", "c", "a", "b", "c", "e", "e", "G", "g", "H" };
	
		var letterGroupUnique = Arrays.stream(letters) // Stream<String>
							.collect(Collectors.groupingBy(letter -> letter, Collectors.counting())); //Map<String,Long>
		generate("2. Letter groups", letterGroupUnique.entrySet());
		
		var letterNeeded = letterGroupUnique.entrySet() //Set<Entry<String,Long>>
											.stream()	//Stream<Entry<K, V>>
											.filter(en -> en.getValue() == 1L)	
											.map(e -> e.getKey())	//Entry<K, V> -> Key
											.collect(Collectors.joining(", ")); // String
		System.out.println("Unique elements --> " + letterNeeded);
	}
}
