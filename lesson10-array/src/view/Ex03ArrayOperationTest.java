package view;

import functional.Operator;

public class Ex03ArrayOperationTest {
	
	
	
	public static void main(String[] args) {
		/*
		 Đề bài: Cho mảng A gồm n(5 -> 10) số nguyên dương với a[i] = [1,100]
		 Yêu cầu:
		 	+ Tìm tổng các phần tử là số lẻ trong mảng
		 	+ Tìm hiệu các phần tử là số chẵn trong mảng
		 	+ Tìm phần tử lớn nhất trong mảng
		 	+ Tìm phần tử nhỏ nhất trong mảng
		 */
		int[] numbers = {2,9,3,7,17,22,40,56,44};

		System.out.println("===============================================20");
		System.out.println(process(0, numbers, (a,b)->{
			return a + b;
		}));
		
		System.out.println(process(0, numbers, (a,b)->{
			return a - b;
		}));
		
		System.out.println(process(Integer.MIN_VALUE, numbers, (a,b) -> {
			return a > b ? a : b;
		}));
		
		System.out.println(process(Integer.MAX_VALUE, numbers, (a,b) -> a < b ? a : b));
	}
	
	private static int process(int initial ,int[] numbers, Operator operator) {
		int result = initial;
		for(int number : numbers) {
			result = operator.calc(result, number);
		}
		return result;
	}
}
