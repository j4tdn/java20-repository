 package view.stream;

import java.util.List;
import java.util.stream.IntStream;

public class Ex08Reduce {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		
		//sum
		int sum = numbers.stream()
							.reduce(0, Integer::sum);
		System.out.println("Reduce sum --> " + sum);
		
		int lcm = numbers.stream()
							.reduce(1, (a,b) -> {
								return (a * b) / gcd(a,b); 
							});
		System.out.println("LCM: " + lcm);
		
		numbers.stream()
				.reduce(Integer::max)
				.ifPresent(val -> System.out.println("Max val: " + val)); 
	}
	
	private static int gcd(int a,int b) {
		while(a != b) {
			if(a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
}
