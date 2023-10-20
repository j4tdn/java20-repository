package view.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex09StreamBuilding {

	public static void main(String[] args) {

		// Arrays.stream(int[]) --> IntStream

		// Arrays.stream(Integer[]) --> Stream<Integer>

		// Arrays.stream(Item[]) --> Stream<Item>

		// Collection<T>#stream() --> Stream<T>

		Stream.of("a", "b", "c").forEach(System.out::println);
		
		String line = "1, le teo, B";
		Pattern.compile(", ")
			   .splitAsStream(line) // Stream<String>
			   .forEach(System.out::println);

	}

}
