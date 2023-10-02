package view;

import ArrayUtils.ArraysUtils;
import funtional.Operator;

public class Ex03ArrayOprerationsTest {
public static void main(String[] args) {
		
		/*
		 Đề bài: Cho mảng A gồm n(5 < n < 10) số nguyên dương, mỗi phần tử Ak = [1, 100]
		 Yêu cầu:
		 + Tính tổng các phần tử trong mảng A
		 + Tính hiệu các phần tử trong mảng A
		 + Tìm phần tử lớn nhất trong mảng A
		 + Tìm phần tử nhỏ nhất trong mảng A
		 */
		
		int[] numbers = {2, 9, 32, 71, 17, 22, 40, 56, 44};
		
		System.out.println("Tính tổng các phần tử trong mảng A1 --> " + sum(numbers));
		
		System.out.println("\nTính hiệu các phần tử trong mảng A1 --> " + sub(numbers));
		
		System.out.println("\nTìm phần tử lớn nhất trong mảng A1 --> " + max(numbers));
		
		System.out.println("\nTìm phần tử nhỏ nhất trong mảng A1 --> " + min(numbers));
		
		System.out.println("\n ==================== \n");
		
		System.out.println("Tính tổng các phần tử trong mảng A2 --> " 
				+ process(0, numbers, (int a, int b) -> {
					return a + b;
				})
		);
		
		System.out.println("\nTính hiệu các phần tử trong mảng A2 --> " 
				+ process(0, numbers, (a, b) ->  a - b)
		);
		
		System.out.println("\nTìm phần tử lớn nhất trong mảng A2 --> " 
				+ process(Integer.MIN_VALUE, numbers, (a, b) ->  a < b ? b : a)
		);
		
		System.out.println("\nTìm phần tử nhỏ nhất trong mảng A2 --> " 
				+ process(Integer.MAX_VALUE, numbers, (a, b) ->  a > b ? b : a)
		);
		
	}
	
	// int result = 0;
	// int result = Integer.MIN_VALUE;
	// int result = Integer.MAX_VALUE;
	
	// result = result + number;
	// result = result - number;
	// result = result < number ? number : result;
	// result = result > number ? number : result;
	
	// Biểu thức: int calc(int a, int b)
	private static int process(int initial, int[] numbers,Operator operator)
	{
		int result= initial;
		for(int number: numbers)
		{
			result = operator.calc(result, number);
			
		}
		return result;
	}
	
	
	
	// Tính tổng các phần tử trong mảng A
	private static int sum(int[] numbers)
	{
		int result =0;
		for(int number: numbers)
		{
			result += number;
		}
		return result;
	}
	
	// Tính hiệu các phần tử trong mảng A
	private static int sub(int[] numbers)
	{
		int result =0;
		for(int number: numbers)
		{
			result -=number;
		}
		return result;
	}
	
	// Tính  phần tử min trong mảng A
	
	private static int min(int[] numbers)
	{
		int result =Integer.MAX_VALUE;
		for(int number: numbers)
		{
			result =result >number ? number:result;
		}
		return result;
	}
	
	
	// Tính  các phần tử MAX trong mảng A
	
	private static int max(int[] numbers)
	{
		int result =Integer.MIN_VALUE;
		for(int number: numbers){
			result = result <number ?number:result;
		}
		return result;
	}
}
