package view.stream;

import java.util.List;

public class Ex08Reduce {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 5,7,8);
		//sum
		
		int sum = numbers.stream()
			   .reduce(0, Integer::sum);
		System.out.println("reduce sum--> "+ sum);
	
		numbers.stream()
			   .reduce(Integer::max)
			   .ifPresent(val -> System.out.println("reduce optMax--> " + val));
		
		int lcm = numbers.stream().reduce(1, (a, b) -> (a * b) / gcd(a, b));
		System.out.println("reduce least common mutiple--> " + lcm);
	}
	private static int gcd(int a, int b) {
		while( a != b) {
			if(a > b) {
				a = a -b;
			}else {
				b = b- a;
			}
		}
		return a;
	}	
}
