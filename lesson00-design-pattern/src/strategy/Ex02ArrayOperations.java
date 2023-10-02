package strategy;

import java.util.Arrays;

public class Ex02ArrayOperations {
	/*
	 Đề bài: Cho danh sách các số nguyên dương [1, 20]
	 Yêu cầu:
	 + Tìm những phần tử là số lẻ trong mảng
	 + Tìm những phần tử là số chẵn trong mảng
	 + Tìm những phần tử là số nguyên tố trong mảng
	 + Tìm những phần tử là số hạnh phúc trong mảng
	 */
	
	public static void main(String[] args) {
		int[] numbers ={1,2, 9, 3, 7, 17, 22, 40, 56, 44};
		generate("odd number", getOddNumbers(numbers));
		generate("Even number ", getEvenNumbers(numbers));
		generate("prime number", getPrimeNumber(numbers));
		generate("Happy number ", getHappyNumber(numbers));
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
	private static int[] getHappyNumber(int[] numbers)
	{
		int[] result =new int[numbers.length];
		int count =0;
		for(int number :numbers)
		{
			if(isHappyNumber(number))
			{
				result[count++]=number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int[] getPrimeNumber(int[] numbers) {
		int[] result =new int[numbers.length];
		int count = 0;
		for(int number : numbers)
		{
			if(isPrime(number))
			{
				 result[count++]=number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static int[] getOddNumbers(int[] numbers)
	{
		int[] result = new int[numbers.length];
		int count =0;
		for(int number: numbers)
		{
			if(number%2!=0)
			{
				result[count++]=number;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static int[] getEvenNumbers(int[] numbers)
	{
		int[] result = new int[numbers.length];
		int count =0;
		for(int number : numbers )
		{
			if(number%2==0)
			{
				result[count++]= number;
						
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
