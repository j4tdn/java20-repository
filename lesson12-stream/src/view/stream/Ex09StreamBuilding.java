package view.stream;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ex09StreamBuilding {
	public static void main(String[] args) {
		
		//Arrays.Stream(int[] --> IntStream)
		
		//Arrays.Stream(Integer[]) --> Stream<Integer>
		//Arrays.Stream(Item[]) --> Stream<Item>
		
		//Collection<T>#stream() --> stream<T>
		Stream.of("a", "b", "C")
			  .forEach(System.out::println);
		String line = "1, le teo, 25";
		Pattern.compile(",")
			   .splitAsStream(line)//Stream<String>
			   .forEach(System.out::println);
	}
}
