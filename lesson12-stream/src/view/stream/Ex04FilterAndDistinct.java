package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static utils.StreamUtils.*;

public class Ex04FilterAndDistinct {

	public static void main(String[] args) {
		// Question 1: filter all odd numbers from a list and makes sure that there are
		// no duplicates
		
		// using list
		var numbers = List.of(1, 2, 3, 4, 2, 4, 6, 3, 4, 5, 3, 5, 1);
		var oddNumbers = numbers.stream()
			.filter(nb -> nb % 2 != 0)
			.distinct()
			.collect(Collectors.toList());
		
		generate("1. Odd numbers", oddNumbers);
		
		// using array
		int[] digits = {4, 5, 6, 7, 3, 5, 7, 8, 3, 2, 7};
		
		// Stream<T> : Mỗi phần tử là T: Integer, Double, Item, String, Tuple
		// Strea<Integer>: Sử dụng các hàm của KDL Stream, áp dụng chung cho kiểu T
		
		// Primitive Stream --> IntStream(từng phần tử là int), DoubleStream(từng phần tử là double), LongStream
		// IntStream: Sử dụng các hàm đặc thù của primitive stream ví dụ IntStream hỗ trợ cho int
		//			: Lưu trữ tránh boxing tốn memory
		int[] oddDigits = Arrays.stream(digits) // IntStream
				.filter(nb -> nb % 2 != 0) // IntStream
				.distinct() // IntStream
				.toArray(); // int[]
		
		System.out.println("2. Odd digits {");
		Arrays.stream(oddDigits)
		.forEach(od -> System.out.print("  " + od));
		System.out.println("\n}");
		
		// distinct: những phần tử trùng nhau lấy 1 phần tử 1, 2, 2, 3, 3, 4 --> 1, 2, 3, 4
		// unique: chỉ lấy những phần tử xuất hiện 1 lần 1,2,2,3,3,4 --> 1, 4
		
		var letters = List.of("a", "b", "b", "b", "c", "c", "d", "d", "d", "e");
		// a -> 1
		// b -> 3
		// c -> 2
		// d -> 3
		// e -> 1
		
		var letterGroups = letters.stream() // Stream<String>
			.collect(Collectors.groupingBy(letter -> letter)); // Map<String, List<String>>
		
		generate("2. Letter Group", letterGroups.entrySet());
		
		var letterCounts = letters.stream() // Stream<String>
				.collect(Collectors.groupingBy(letter -> letter, Collectors.counting())); // Map<String, Long>
		
		generate("3. Letter Count", letterCounts.entrySet());
		
		var uniqueElements = letterCounts.entrySet() // set<entry<k, v>>
				.stream() // stream<entry<k, v>>
				.filter(e -> e.getValue() == 1L) // Stream<entry<k, v>>
				.map(e -> e.getKey())
				.collect(Collectors.joining(", ")); // String
		
		System.out.println("4. Unique Elements --> " + uniqueElements);
	}
}
