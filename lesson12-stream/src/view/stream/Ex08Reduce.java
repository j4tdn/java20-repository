package view.stream;

import java.util.List;

public class Ex08Reduce {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(2,3,4,5);
		
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println("Reduce sum --> " + sum);
		
		numbers.stream()
			.reduce(Integer::max)
			.ifPresent(val -> System.out.println("Reduce max --> " + val));
		
		int lcm = numbers.stream().reduce(1, (a, b) -> (a * b) / gcd(a, b));
		System.out.println("Reduce least common multiple --> " + lcm);
	}
	
	private static int gcd(int a, int b) {
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
	
}