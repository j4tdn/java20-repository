package view;

import java.util.Arrays;

import Functional.Operator;



public class Ex03ArrayOperationsTest {

	public static void main(String[] args) {
		int [] numbers = {2,9,3,7,17,22,56,44};
		
		
		System.out.println("Tong : "  + sum(numbers));
		System.out.println("hieu : "  + sub(numbers));
		System.out.println("max : "  + max(numbers));
		System.out.println("min : "  + min(numbers));
		
		System.out.println("==============");
		
		System.out.println("Tong2 : "  + process(0, numbers, ( a, b) -> a + b)); 	
		
		
		System.out.println("hieu : "  + process(0, numbers, ( a, b) -> a - b));
		System.out.println("max : "  + process(Integer.MIN_VALUE, numbers, ( a, b) -> a + b));
		System.out.println("min : "  + min(numbers));
	}
	
	private static int process(int initial,int[] numbers, Operator operator) {
		int result = initial;
		for(int number : numbers) {
			result = operator.calc(result, number);
		}
		return result;
	}
	private static int sum(int[] numbers) {
		int result = 0;
		for(int numbrt : numbers) {
			result = result +numbrt;
		}
		return result;
	}
	
	private static int sub(int[] numbers) {
		int result = 0;
		for(int numbrt : numbers) {
			result = result - numbrt;
		}
		return result;
	}
	private static int max(int[] numbers) {
		int result = Integer.MIN_VALUE;
		for(int numbrt : numbers) {
			result = result < numbrt ? numbrt : result;
		}
		return result;
	}
	private static int min(int[] numbers) {
		int result = Integer.MAX_VALUE;
		for(int numbrt : numbers) {
			result = result > numbrt ? numbrt : result;
		}
		return result;
	}
}
