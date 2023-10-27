package view.lambda.expression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

import bean.Apple;
import model.DataModel;

public class Ex03MethodReference {
	public static void main(String[] args) {

		// 1. implementation class --> anonymous class --> anonymous function

		// --> method reference

		// using static method (apply for all lambda expression)

		// using non static method(few special cases)

		List<Apple> inventory = DataModel.mockApple();

		List<Apple> expiredItems = filterApplers(inventory,
				(apple) -> apple.getExpiredDate().isBefore(LocalDate.now()));
		expiredItems.forEach(System.out::println);
		System.out.println("============");
		int max = process(List.of(5, 4, 8, 9, 5), Ex03MethodReference::maxOperator);
		System.out.println("max: " + max);
		
		int sum = process(List.of(5, 4, 8, 9, 5), (a,b) -> a + b);
		System.out.println("sum: " + sum);
		
		//sort list of Apple by id descending
		inventory.sort(Comparator.comparing(Apple::getId).reversed());
		inventory.forEach(System.out::println);
	}
	private static Integer maxOperator(Integer a, Integer b) {
		return a > b ? a:b;
	}
	
	private static int process(List<Integer> numbers, BinaryOperator<Integer> operator) {
		if(numbers.size() == 0) {
			return Integer.MAX_VALUE;
		}
		Integer result = numbers.get(0);
		for(int i = 1; i< numbers.size(); i++) {
			result = operator.apply(result, numbers.get(i));
		}
		return result;
	}
	
	private static List<Apple> filterApplers(List<Apple> inventory, Predicate<Apple> predicate) {
		List<Apple> result = new ArrayList<Apple>();
		for (Apple apple:inventory) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
}
