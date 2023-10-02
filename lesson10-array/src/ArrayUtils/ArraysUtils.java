package ArrayUtils;

import java.util.Arrays;


import bean.SortOrder;

public class ArraysUtils {
	private ArraysUtils() {
		
	}

	public static void sort(int[] elements)
	{
		Arrays.sort(elements);
	}
	
	public static void sort(int[] elements, SortOrder sortOrder)
	{
		Arrays.sort(elements);
		if(SortOrder.DESC.equals(sortOrder))
		{
			reverse(elements);
		}
	}
	
	public static void reverse(int[] numbers)
	{
		int lenght = numbers.length;
		for(int i=0;i<=lenght/2;i++)
		{
			int temp = numbers[i];
			numbers[i] =numbers[lenght-i-1];
			numbers[lenght-i-1]=temp;
		}
	}
	
	public static void generate(String prefix, int[] elements)
	{
		System.out.println(prefix + "-->{ ");
		for(int element: elements)
		{
			System.out.println(element+ " ");
			
		}
		System.out.println("}\n");
	}
	
	public static void generate(String prefix,Object[] elements)
	{
		System.out.println(prefix+ "--> { ");
		for(Object element: elements)
		{
			System.out.println(element+ " ");
		}
		System.out.println("} \n");
	}
	
	private static boolean isValidIndex(int i,int[] elements)
	{
		return i>=0 && i<elements.length;
	}
	
	private static boolean isValidIndex(int i,Object[] elements)
	{
		return i>=0&& i<=elements.length;
	}
	
	public static void swap(int[]elements,int i,int j)
	{
		if(isValidIndex(i, elements)||isValidIndex(j, elements))
		{
			int temp = elements[i];
			elements[i] = elements[j];
			elements[j] =temp;
		}
	}
	
	public static void swap(Object[] elements,int i,int j)
	{
		if(isValidIndex(i, elements)||isValidIndex(i, elements))
		{
			Object temp = elements[i];
			elements[i]=elements[j];
			elements[j] =temp;
		}
	}
	
}
