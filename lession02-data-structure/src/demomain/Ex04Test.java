package demomain;

import datastructure.primitive.integer;

public class Ex04Test {
	
	public static void main(String[] args) {
		integer x1 = new integer(2);
		integer x2 =new integer(5);
		swap(x1,x2);
		System.out.println(x1.value);
		System.out.println(x2.value);
	}
	
	//int, Integer 
	private static void swap(integer a,integer b)
	{
		int temp = a.value;
		 a.value = b.value ;
		 b.value = temp;
	}
	
}
