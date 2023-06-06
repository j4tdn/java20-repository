package demomain;

import datastructure.object.custom.Java20Int;

public class Ex04Test {

	public static void main(String[] args) {
		Java20Int a = new Java20Int(2);
		Java20Int b = new Java20Int(5);
		
		swap(a, b);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		
		//cho 2 số nguyên, viết hàm hoán vị 2 số nguyên
		
	}
	public static void swap(Java20Int a, Java20Int b)
	{
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}

}
