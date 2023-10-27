package utils;

import java.util.Collection;

public class StreamUtils {
	private StreamUtils() {
	}
	
	public static <T> void generate(String prefix, Collection<T> elements) {
		System.out.println(prefix + "{");
		
		elements.forEach(element -> System.out.println("     " + element));
		
		System.out.println("}\n");
	}
	
}
