package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static utils.StreamUtils.*;
public class Ex04FilterAndDistinct {

	public static void main(String[] args) {
		
		// filter odd number and make sure that there are no duplicates
		// using list
		var numbers = List.of(1, 2, 4, 7, 5, 1, 7);
		
		// distinct | toSet
		var oddNumbers = numbers.stream()
			   .filter(nb -> nb %2 != 0)
			   .distinct()
			   .collect(Collectors.toList());
		
		generate("1.Odd numbers: ", oddNumbers);
		
		// using array
		int[] digits = {1, 2, 5, 1, 7, 5, 4};
		
		// Stream<T>: mỗi ptu là Integer, Double
		// Stream<Integer>: sử dụng các hàm của DKL Stream, áp dụng cho T
		
		// Primitive stream: IntStream(ptu là int), DoubleStream(ptu là double), LongStream
		// IntStream: sử dụng các hàm đặc thù của primitive stream vd IntStream hỗ trợ cho int
		//			: lưu trữ tránh boxing tốn memory
		int[] oddDigits = Arrays.stream(digits) // IntStream
			  .filter(nb -> nb %2 != 0)// IntStream
			  .distinct()// IntStream
			  .toArray();// int[]
		
		System.out.println("2.Odd digits: ");
		Arrays.stream(oddDigits)
			  .forEach(System.out::println);
		
		var letters = List.of("a", "b", "d", "a", "e");
		// a
		
		numbers.stream()
			   .collect(Collectors.groupingBy(letter -> letter, Collectors.counting()));
		
		
	}

}
