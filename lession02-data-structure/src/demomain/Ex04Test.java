package demomain;

import datastructure.object.Java20Int;

public class Ex04Test {
	
	public static void main(String[] args) {
		// Cho 2 số nguyên a, b
		// Viết hàm hoán vị 2 số nguyên a, b
		
		Java20Int x = new Java20Int(2);
		Java20Int y = new Java20Int(5);
		
		swap(x, y);
		
		System.out.println("a --> " + x);
		System.out.println("b --> " + y);
	}
	
	private static void swap(Java20Int a, Java20Int b) {
		int tmp = a.value;
		a.value = b.value;
		b.value = tmp;
	}
}
