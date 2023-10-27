package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex07Optional {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		
		Optional<Integer> optMaxOdd = findMaxOddNumber(numbers);
		
		if (optMaxOdd.isPresent()) {

			System.out.println("Max odd number: " + optMaxOdd.get());
		} else {
			System.out.println("not exist odd element");
		}
		
		System.out.println("\n===================\n");
		
		optMaxOdd.ifPresentOrElse(
				val -> System.out.println("Max number --> " + val),
				() -> System.out.println("List has no odd element"));
	}
	
	private static Optional<Integer> findMaxOddNumber(List<Integer> numbers) {
		Integer max = Integer.MIN_VALUE;
		int running = 0;
		for (Integer number: numbers) {
			if (running == 0 && number % 2 != 0) {
				max = number;
				running++;
			} else {
				if (number % 2 != 0) {
					max = max < number ? number : max;
				}
			}
		}
		return Optional.ofNullable(max);
	}
}
