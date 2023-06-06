package demomain;

import java.util.Scanner;

import datastructure.object.custom.Java20Int;

public class Ex04Test {
	public static void swap(Java20Int a, Java20Int b) {
		int temp =a.value;
		a.value = b.value;
		b.value = temp;
	}
	public static void main(String[] args) {
//		Integer a = 2;
//		Integer b = 5;
		Java20Int x = new Java20Int(2);
		Java20Int y = new Java20Int(5);
		swap(x, y);
		System.out.println("a = " + x + ", b = " + y);

	}
}
