package view.z1.generic.method;

import java.util.Arrays;

import bean.DataModel;
import bean.Item;

public class Ex02BasicDemo__ArraySorting {
	public static void main(String[] args) {
		//write program to print all elements from array, List
		
		
		
		//Handle with array of elements
		Integer[] aOIntegers = {1,5,7,8,2,5,4};
		Double[] aODoubles = {2.2d, 3.21d, 6.4d, 7.3d};
		String[] aOStrings = {"as", "d", "c", "d"};
		Item[] aOItem = DataModel.mockItem();
		
		
		printArray_UsingGeneric(aOIntegers);
		printArray_UsingGeneric(aODoubles);
		printArray_UsingGeneric(aOStrings);
		printArray_UsingGeneric(aOItem);
		
		sort(aODoubles);
		sort(aOItem);
		// handle with list of elements
	}
	// support to cast error at compile
	public static<Element extends Comparable<Element>> void sort(Element[] elements){
		Arrays.sort(elements);
		
	}
	
	//Da hinh trong doi tuong
	// Cha = Con
	// <E>: generic type, tu dinh nghia
	//    : pham vi su dung trong ham no khai bao
	public static<E> void printArray_UsingGeneric(E[] elements) {
		System.out.println();
		for(E element: elements) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
