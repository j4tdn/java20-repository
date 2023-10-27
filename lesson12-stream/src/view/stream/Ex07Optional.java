package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex07Optional {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("Max odd number: " + findMaxOddNumber(numbers));

		Optional<Integer> otpMaxOdd = findMaxOddNumber(numbers);
		if (otpMaxOdd.isPresent()) {
			System.out.println("Max odd number optional: " + otpMaxOdd.get());
		} else {
			System.out.println("Not existed odd number!");
		}
		System.out.println("\n=========================\n");

		otpMaxOdd.ifPresentOrElse(sq -> System.out.println(sq), null);
	}

	private static Optional<Integer> findMaxOddNumber(List<Integer> numbers) {
		Integer max = null;
		int running = 0;
		for (Integer number : numbers) {
			if (running == 0 && number % 2 != 0) {
				running++;
				max = number;
			} else {
				if (number % 2 != 0) {
					max = max < number ? number : max;
				}
			}
		}
		return Optional.ofNullable(max);
	}
}
