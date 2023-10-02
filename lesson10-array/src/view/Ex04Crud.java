package view;

import java.util.Arrays;

import ArrayUtils.ArraysUtils;

public class Ex04Crud {
public static void main(String[] args) {
		int[] numbers = {2,9,3,7,17};
		ArraysUtils.generate("Add number", add(numbers, 3, 99));
		ArraysUtils.generate("Add number", remove(numbers, 1));
		reverse(numbers);
		ArraysUtils.generate("Add number", numbers);
		
		
	
}
	private static int[] add(int[] numbers,int index,int newValue)
	{
		if(index<0 ||index >numbers.length-1)
		{
			return numbers;
		}
		int[] result =new int[numbers.length+1];
		
		for(int i=0;i<numbers.length;i++)
		{
			result[i]=numbers[i];
		}
		for(int i =result.length-1;i>index;i--)
		{
			result[i] =result[i-1];
		}
		result[index]=newValue;
		
		return result;
	
}
	
	private static int[] remove(int[] numbers,int index)
	{
		if(index<0 || index>numbers.length-1)
		{
			return numbers;
		}
		int[] result =new int[numbers.length];
		for(int i =0;i<numbers.length;i++)
		{
			result[i] =numbers[i];
		}
		for(int i=index ;i<result.length-1;i++)
		{
			result[i] =result[i+1];
		}
		return Arrays.copyOfRange(result, 0, numbers.length-1);
		
	}
	
	private static void reverse(int[] numbers)
	{
		int lenght =numbers.length;
		for(int i =0;i<lenght/2;i++)
		{
			int temp =numbers[i];
			numbers[i] =numbers[lenght-i-1];
			numbers[lenght-i-1]=temp;
		}
	}
}
