package view.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex09StreamBuilding {
	
	public static void main(String[] args) {
		
		// Arrays.stream(int[]) --> IntStream
		
		// Arrays.sstream(Integer[]) --> Stream<Integer>
		
		// Arrays.stream(Item[]) --> Stream<Item>
		
		// Collection<T>#stream() --> Stream<T>
		
		Stream.of("a", "b", "c")
			.forEach(System.out::println);
		
		System.out.println("\n");
		
		String line = "1, Le Teo, 28";
		Pattern.compile(", ")
			.splitAsStream(line) // Stream<String>
			.forEach(System.out::println);
		
	}
}
