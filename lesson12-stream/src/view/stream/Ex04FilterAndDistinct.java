package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import utils.StreamUtils;

public class Ex04FilterAndDistinct {
	
	public static void main(String[] args) {
		
		// question: filter all odd element
		
		var numbers = List.of(1, 2,33, 33, 4, 2,5,6,5);
		List<Integer> resultOddElement = numbers.stream()
			   .filter(number -> number % 2 != 0)
			   .distinct()
			   .toList();
		StreamUtils.generate("1. Odd elements", resultOddElement);
		
		var digits = new int[]{1, 2,33, 3, 4, 2,5,6,6,5};
		Arrays.stream(digits)
			  .filter(digit -> digit % 2 == 0)
			  .distinct()
			  .forEach(digit -> System.out.println(digit));
		
		// distinct: những phần tử trùng nhau lấy 1 phần tử
		// unique: chỉ lấy những phần tử xuất hiện 1 lần
		var letters = List.of("a", "a", "b", "b", "b", "c", "c");
		var letterCounter = letters.stream()
				.collect(Collectors.groupingBy(letter-> letter, Collectors.counting()));
		StreamUtils.generate("2. letter Group", letterCounter.entrySet());
		
		letterCounter.entrySet()
		.stream()
		.filter(e -> e.getValue() == 2)
		.map(Entry::getKey).forEach(e-> System.out.println(e));				
						
							
		
	}
}
