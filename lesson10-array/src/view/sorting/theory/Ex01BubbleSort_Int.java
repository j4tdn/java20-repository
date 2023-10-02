package view.sorting.theory;

import javax.annotation.processing.Generated;

import ArrayUtils.ArraysUtils;
import funtional.Comparator_int;
import funtional.ArraySortBool;

public class Ex01BubbleSort_Int {
	public static void main(String[] args) {
		//cho mang so nguye khong am
		int[] numbers = {1,5,8,2,4,9};
		
		//1. Sap xep cac phan tu tang dan
		
		//2.Sap xep cac phan tu giam dan
		sortD(numbers,(a,b)->a>b);
		ArraysUtils.generate("Accessding", numbers);
		
		sortD(numbers,(a,b)->a<b);
		ArraysUtils.generate("Accessding", numbers);
		
		
		
	}
	private static void sortD(int[] elements ,Comparator_int aSort)
	{
		int length =elements.length;
		for(int i =0;i<length;i++)
		{
			for(int j =0;j<length-i-1;j++)
			{
				if(aSort.compare(elements[j], elements[j+1]))
					
				{
					ArraysUtils.swap(elements,j,j+1);
				}
			}
		}
	}
	
	private static void sortDesc(int[] elements ,Comparator_int aSort)
	{
		int length =elements.length;
		for(int i =0;i<length;i++)
		{
			for(int j =0;j<length-i-1;j++)
			{
				if(elements[j]<elements[j+1])
				{
					ArraysUtils.swap(elements,j,j+1);
				}
			}
		}
	}
	private static void sortDescInjava(int[] elements ,Comparator_int aSort)
	{
		int length =elements.length;
		for(int i =0;i<length;i++)
		{
			for(int j =0;j<length-i-1;j++)
			{
				if(elements[j+1] -elements[j]>0)
				{
					ArraysUtils.swap(elements,j,j+1);
				}
			}
		}
	}
	//tang dan
	private static void sort(int[] elements)
	{
		int length =elements.length;
		for(int i =0;i<length;i++)
		{
			for(int j =0;j<length-i-1;j++)
			{
				if(elements[j]>elements[j+1])
				{
					ArraysUtils.swap(elements,j,j+1);
				}
			}
		}
	}
		private static void sortINT(int[] elements ,ArraySortBool aSort)
		{
			int length =elements.length;
			for(int i =0;i<length;i++)
			{
				for(int j =0;j<length-i-1;j++)
				{
					if(aSort.compare(elements[j], elements[j+1])>0)
					{
						ArraysUtils.swap(elements,j,j+1);
					}
				}
			}
}
}