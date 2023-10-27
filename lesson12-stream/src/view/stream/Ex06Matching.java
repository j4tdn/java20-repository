package view.stream;

import java.util.List;

public class Ex06Matching {
	public static void main(String[] args) {
		// Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
		var numbers = List.of(1,2,1,4,5,8,10,4,12);
		
		var isDivBy10 = numbers.stream().anyMatch(nb -> nb % 10 == 0);
		System.out.println("1st: ");
		
		// 3rd: find the elements 
	}
}
