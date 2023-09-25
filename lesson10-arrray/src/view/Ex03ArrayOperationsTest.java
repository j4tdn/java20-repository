package view;

import functional.Operation;

public class Ex03ArrayOperationsTest {
	public static void main(String[] args) {
		/*
		  cho 1 mang A n < 5 < 10 so nguyen duong, moi phan tu Ak [1,100]
		  require: tinh tong cac phan tu trong mang 
		  			tinh hieu cac phan tu trong mang  
		  			tinh max của cac phan tu trong mang 
		  			tinh min của cac phan tu trong mang 
		 */
		int[] numbers = {2, 9, 3, 7, 17, 22, 40, 56, 44};
		System.out.println("tong cac phan tu trong mang: " + 
					getNumbers(0, numbers, (a, b) -> a + b));	
		System.out.println("tong cac phan tu trong mang: " + 
				getNumbers(0, numbers, (a, b) -> a - b));	
		System.out.println("tong cac phan tu trong mang: " + 
				getNumbers(Integer.MIN_VALUE, numbers, (a, b) -> a < b ? b : a));
		System.out.println("tong cac phan tu trong mang: " + 
				getNumbers(Integer.MAX_VALUE, numbers, (a, b) -> a > b ? b : a));
	
	}	
	private static int getNumbers(int initial, int[] numbers, Operation operation) {
		int result = initial;
		for(int number : numbers) {
			result = operation.test(result, number);
		}
		return result;
	}
}
