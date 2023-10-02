package strategy;

import java.util.Arrays;

import strategy.functional.Condition;

public class Ex02ArrayOperationsStrategyPattern {
	public static void main(String[] args) {
		int[] numbers ={1,2, 9, 3, 7, 17, 22, 40, 56, 44};
		
		generate("1.Tìm số lẻ trong mảng", getNumbers(numbers, new Condition() { // anonymous class
			
			@Override
			public boolean test(int number) {
				return number%2 !=0;
			}
		}));
		generate("1.Tìm số lẻ trong mảng", getNumbers(numbers, (int number) ->{ //anonymous function
				return number%2 !=0;
			}));
		
		
		generate("1.Tìm số lẻ trong mảng", getNumbers(numbers, (int number) ->number%2 !=0 //lamda
		));
		System.out.println("\n---------------RESULT-----------------\n");
		
		generate("1.Tìm số lẻ trong mảng", getNumbers(numbers, (int number) ->number%2 !=0 //lamda
				));
		generate("2.Tìm số chẵn trong mảng", getNumbers(numbers, (int number) ->number%2 ==0 //lamda
				));
		generate("3.Tìm số nguyên tố trong mảng", getNumbers(numbers, (int number) ->isPrime(number) //lamda
				));
		generate("4.Tìm số lẻ trong mảng", getNumbers(numbers, (int number) ->isHappyNumber(number)//lamda
				));
		
	}
	
	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	private static boolean isHappyNumber(int number)
	{
		int sum =0;
		int temp = number;
		while(temp!= 0)
		{
			int digits = temp%10;
			sum+= digits*digits;
			temp/=10;
		}
		return sum==number;
			
	}
	
	private static int[] getNumbers(int[] numbers,Condition conditon)
	{
		int[] result = new int[numbers.length];
		int count =0;
		for(int number: numbers)
		{
			if(conditon.test(number))
			{
				result[count++]=number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
			
	}
	private static void generate(String prefix,int[] elements)
	{
		System.out.println(prefix+ " --> {");
		for(int element: elements)
		{
			System.out.println("\t"+element);
		}
		System.out.println("\n }");
	}
}
