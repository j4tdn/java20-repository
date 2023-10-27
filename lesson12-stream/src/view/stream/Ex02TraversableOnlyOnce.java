package view.stream;

import java.util.List;
import java.util.stream.Stream;

public class Ex02TraversableOnlyOnce {
	public static void main(String[] args) {
		var sequences =  List.of("a","b","c","d","e");
		
		Stream<String> stream = sequences.stream();
		stream.forEach(seq -> System.out.println(seq));
		System.out.println("\n=======");
		// java.lang.IllegalStateException: stream has already been operated upon or closed
		stream.forEach(seq -> System.out.println(seq));
	}
}
