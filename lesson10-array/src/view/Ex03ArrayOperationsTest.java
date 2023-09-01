package view;

import functional.Operator;

public class Ex03ArrayOperationsTest {

	public static void main(String[] args) {
		
		/*
		 Đề: cho mảng A gồm n (5 < n < 10) số nguyên dương, mỗi phần tử Ak = [1, 100]
		 Yêu cầu: 
		 + tính tổng các phần tử
		 + tính hiệu các phần tử
		 + tìm phần tử lớn nhất
		 + tìm phần tử nhỏ nhất
		 */
	
		int[] numbers = {2, 9, 3, 7, 17, 22, 40, 8, 30, 56, 44};
		
		System.out.println("cau 1: " + process(0, numbers, (a, b) ->  a + b));
		
		System.out.println("cau 2: " + process(0, numbers, (a, b) ->  a - b));
	
		
		System.out.println("cau 3: " + process(Integer.MIN_VALUE, numbers, (a, b) ->  Math.max(a, b)));
		
		System.out.println("cau 3: " + process(Integer.MAX_VALUE, numbers, (a, b) -> Math.min(a, b)));
	}

	private static int process(int initial, int[] numbers, Operator operator) {
		int result = initial;
		for (int number: numbers) {
			result = operator.cal(result, number);
		}
		return result;
	}
}
