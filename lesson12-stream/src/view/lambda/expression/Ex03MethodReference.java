package view.lambda.expression;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import bean.Apple;
import bean.Tuple;
import model.DataModel;

public class Ex03MethodReference {
	public static void main(String[] args) {
		List<Apple> inventory = DataModel.mockApples();
		inventory.forEach(apple -> System.out.println(apple));
		
		List<Apple> expiredItems = filterApple(inventory, apple -> {
			return apple.getExpiredDate().isBefore(LocalDate.now());
		});
		
		List<Integer> numbers = List.of(10,11,12);
		System.out.println("MAX: " + process(numbers, (a,b) -> a > b ? a : b));
		System.out.println("SUM: " + process(numbers, (a,b) -> a + b));
		// 1. Implementation class
		
		// 2. -> anonymous class
		
		// 3. -> anonymous function(lambda expression)
		Predicate<Apple> predicate = apple -> {
			return apple.getExpiredDate().isBefore(LocalDate.now());
		};
		
		BinaryOperator<Integer> maxOperator = (a,b) -> {
			return a > b ? a : b;
		};
		// 4. -> method reference
		
		// *** 4.1 -> using static method(apply for all lambda expression)
		predicate = Apple::testExpDate; // Tham chiếu đến phương thức testExpDate, trả về KDL FI
		expiredItems = filterApple(inventory, predicate);
		maxOperator = Ex03MethodReference::max;
		
		maxOperator = Integer::max;
		
		
		// *** 4.2 -> using non-static method(few special cases)
		// Sort list<apple> by id ASC
		Function<Apple, Integer> function = (Apple apple) -> {
			return apple.getId();
		};
		function = Apple::getId;
		//inventory.sort(Comparator.comparing(function));
		
		Consumer<Apple> consumer = (Apple apple) ->{
			System.out.println(apple);
		};
		consumer = System.out::println;
		inventory.forEach(consumer);
		//--------------------------------------------------------------
		System.out.println("TỔNG IN ARRAY: " + process(numbers, Ex03MethodReference::sumArray));
		
		System.out.println("TÁO HẾT HẠN");
		expiredItems.forEach(expiredItem -> System.out.println(expiredItem));
		
	}
	
	private static int sumArray(int a, int b) {
		return a + b;
	}
	
	private static Integer max(Integer a, Integer b) {
		return a > b ? a : b;
	}
	
	private static int process(List<Integer> numbers, BinaryOperator<Integer> operator) {
		int result = numbers.get(0);
		
		for(int i = 1; i < numbers.size();i++) {
			result = operator.apply(result, numbers.get(i));
		}
		return result;
	}

	public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate) {
		
		List<Apple> result1 = new ArrayList<>();
		
		for(Apple apple : inventory) {
			if(predicate.test(apple)) {
				result1.add(apple);
			}
		}
		
		return result1;
	}
}
