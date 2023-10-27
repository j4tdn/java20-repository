package view.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex09StreamBulding {
	//Array.stream(int[])-->IntStream
	//Array.stream(Integer[])-->Stream<Integer>
	//Array.stream(Item[])-->Stream<Item>
	//Collection<T>#Stream() -->Stream<T>
	
	public static void main(String[] args) {
		Stream.of("a","b","c")
		.forEach(System.out::println);
		
		String line ="1,Le Teo,28";
		Pattern.compile(", "
				+ "")
		.splitAsStream(line) //Stream<String>
		.forEach(System.out::println);
	}
}
