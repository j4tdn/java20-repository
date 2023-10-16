package view.lambdaexpression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Comparator.*;

import bean.Apple;
import model.DataModel;

public class Ex03MethodReference {

	public static void main(String[] args) {
		// 1. implementation class
		
		// 2. anonymous class
		
		// 3. anonymous function(lambda expression)
		Predicate<Apple> predicate = apple -> {
			return apple.getExpiredDate().isBefore(LocalDate.now());
		};
		
		BinaryOperator<Integer> maxOperator = (a, b) -> {
			return a > b ? a: b;
		};
		
		BinaryOperator<Integer> sumOperator = (a, b) -> {
			return a + b;
		};
		
		// 4. method reference
		
		// 4.1 --> usign static method (apply for all lambda expression)
		predicate = Apple::testExpDate;
		maxOperator = Ex03MethodReference::max;
		maxOperator = Integer::max;
		sumOperator = Integer::sum;
		
		// 4.2 --> using non static method (few special cases)
		
		List<Apple> inventory = DataModel.mockApples();
		
		List<Apple> expiredItems = filterApples(inventory, predicate);

		// Consumer<T>
		expiredItems.forEach(expiredItem -> System.out.println(expiredItem));

		List<Integer> numbers = List.of(2, 4, 12, 28, 7, 5, 22);

		System.out.println("\n====================\n");

		int max = process(numbers, maxOperator);
		System.out.println("max --> " + max);

		int sum = process(numbers, sumOperator);
		System.out.println("sum --> " + sum);

		System.out.println("\n========= SORTED LIST ===========\n");

		// Sort list of apples by id descending
		Function<Apple, Integer> function = (Apple apple) -> {
			return apple.getId();
		};
		function = Apple::getId;
		inventory.sort(comparing(function, reverseOrder()));

		Consumer<Apple> consumer = (Apple apple) -> System.out.println(apple);
		consumer = System.out::println;

		inventory.forEach(consumer);
	}

	private static Integer max(Integer a, Integer b) {
		return a > b ? a : b;
	}

	private static Integer process(List<Integer> numbers, BinaryOperator<Integer> operator) {
		if (numbers.size() == 0) {
			return Integer.MAX_VALUE;
		}
		Integer result = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			result = operator.apply(result, numbers.get(i));
		}
		return result;
	}

	private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<>();

		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}
}
