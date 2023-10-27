package utils;

import java.util.Arrays;
import java.util.Collection;

public class StreamUtils {
	private StreamUtils() {
	}
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + "{");
		collection.forEach(e -> System.out.println("     " + e));
		System.out.println("}");
	}
	
	public static <T> void generate(String prefix, T[] collection) {
		System.out.println(prefix + "{");
		Arrays.stream(collection)
				.forEach(e -> System.out.println(e));
		System.out.println("}");
	}
}
