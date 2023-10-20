package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex06Matching {
	
	public static void main(String[] args) {
		// Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
		var numbers = List.of(1, 2, 1, 41, 5, 81, 10, 41, 121);
		
		// 1st: is there any element that is divisible by 10 --> anyMatch
		var isDivBy10 = numbers.stream().anyMatch(nb -> nb % 10 == 0);
		System.out.println("1st: is there any element that is divisible by 10 --> " + isDivBy10);
		
		// 2nd: find the first element that is divisible by 4
		Optional<Integer> optInt = numbers.stream()
			.filter(nb -> nb % 4 == 0)
			.findFirst();
		if (optInt.isPresent()) {
			System.out.println("2nd: find the first element that is divisible by 4 --> " + optInt.get());
		}
		
		// 3rd: find the elements that is divisible by 5 in the list --> filter --> stream, list
		
		// 4th: does all elements less than 100 --> allMatch --> boolean
		
		// 5th: does no elements greater than 0 --> noneMatch --> boolean
	}
}
