package ex02;

import java.util.Arrays;
import java.util.Collections;

public class Arrange {
	public static void main(String[] args) {
		int index = 0;
		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };

		int[] arra = new int[arr.length];

		for (var a : arr) {
			if (a % 7 == 0 && a % 5 != 0) {
				arra[index] = a;
				index++;
			}
		}
		
		for(var b : arr) {
			if ((b % 7 == 0 && b % 5 == 0) || (b % 7 != 0 && b % 5 != 0)) {
				arra[index] = b;
				index++;
			}
		}
		
		for(var c : arr) {
			if(c % 5 == 0 && c % 7 != 0) {
				arra[index] = c;
				index++;
			}
		}

		for (var item : arra) {
			System.out.println(item);
		}
//		Arrays.asList(arra).forEach(System.out::println);
	}

}
