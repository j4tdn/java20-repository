package view.lambda.expression;

import java.time.LocalDate;
import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

public class Ex03MethodReference {

	public static void main(String[] args) {

		// 1. implementation class

		// 2. anonymous class

		// 3. anonymous function(lambda)
		Predicate<Apple> predicate = apple -> {
			return apple.getExpiredDate().isBefore(LocalDate.now());
		};

		BinaryOperator<Integer> maxOperator = (a, b) -> a + b;
		
		// 4. method reference

		// 4.1 --> using static method(apply for all lambda expression)
		predicate = Ex03MethodReference::testExpiredDate; // --> functional interface
		maxOperator = Ex03MethodReference::max;
		maxOperator = Integer::max;
		// 4.2 --> using non static method(few special cases)
		List<Apple> inventory = DataModel.mockApples();

		List<Apple> expiredItems = filterApples(inventory, predicate);

		expiredItems.forEach(System.out::println);

		List<Integer> numbers = List.of(2, 4, 6, 5, 1);

		System.out.println("\n============\n");
		
		int max = process(numbers, maxOperator);

		System.out.println("max: " + max);
		
		System.out.println("\n============\n");
		
		int sum = process(numbers, (a, b) -> a + b);

		System.out.println("sum: " + sum);
		
		// sort list of apples by id desc
		inventory.sort(comparing(Apple::getId, reverseOrder()));
		
		inventory.forEach(System.out::println);
	}
	
	private static Integer max(Integer a, Integer b) {
		return a > b ? a : b;
	}

	private static Integer process(List<Integer> numbers, BinaryOperator<Integer> operator) {
		if (numbers.size() == 0) {
			return Integer.MAX_VALUE;
		}

		Integer res = numbers.get(0);
		for (int i = 1; i < numbers.size(); i++) {
			res = operator.apply(res, numbers.get(i));
		}
		return res;
	}

	private static boolean testExpiredDate(Apple apple) {
		return apple.getExpiredDate().isBefore(LocalDate.now());
	}

	private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> res = new ArrayList<>();

		for (Apple apple : inventory) {
			if (predicate.test(apple)) {
				res.add(apple);
			}
		}

		return res;
	}

}
