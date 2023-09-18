package view;

import functional.Test;

public class Ex03ArrayOperationsTest {
	
	/*
	Đề bài: Cho mảng A gồm n(5 < n < 10) số nguyên dương, mỗi phần tử Ak = [1, 100]
	Yêu cầu:
		+ Tính tổng các phần tử trong mảng A
		+ Tìm phần tử lớn nhất trong mảng A
		+ Tìm phần tử nhỏ nhất trong mảng A
	*/
	
	public static void main(String[] args) {
		
		int[] numbers = { 2, 9, 3, 7, 17, 22, 40, 56, 44 };
		
		System.out.println("Tong --> " + process(0, numbers, (number, result) -> number + result));
		
		System.out.println("Max --> " + process(Integer.MIN_VALUE, numbers, (number, result) -> number > result ? number : result));
		
		System.out.println("Min --> " + process(Integer.MAX_VALUE, numbers, (number, result) -> number < result ? number : result));
		
	}
	
	private static int process(int initial, int[] numbers, Test test) {
		int result = initial;
		for (int number : numbers) 
			result = test.calc(number, result);
		return result;
	}
	
}
