package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex07Optional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2, 4, 6 ,3, 7);

		Optional<Integer> optMaxOdd = findMaxOddNumber(numbers);
		
		if (optMaxOdd.isPresent()) {
			System.out.println("max odd number: " + optMaxOdd.get());
		}else {
			System.out.println("not exist odd element");
		}

		optMaxOdd.ifPresentOrElse(
				val -> System.out.println("max odd number: " + val),
				() -> System.out.println("not exist odd element"));
	}

	private static Optional<Integer> findMaxOddNumber(List<Integer> numbers) {
		Integer max = null;
		int running = 0;
		for (Integer number : numbers) {
			if (running == 0 && number % 2 != 0) {
				max = number;
				running++;
			}else {
				if (number % 2 != 0) {
					max = Math.max(max, running);
				}
			}
		}
		return Optional.ofNullable(max);
	}

}
