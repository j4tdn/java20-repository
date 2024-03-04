package utils;

import java.util.Collection;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	
	public static void generate(String prefix, Object object) {
		System.out.println(prefix + " --> {");
		
		System.out.println("   " + object);
		
		System.out.println("}\n");
	}
	
	public static <Element> void generate(String prefix, Collection<Element> elements) {
		System.out.println(prefix + " --> {");
		
		elements.forEach(e -> System.out.println("   " + e.toString()));
		
		System.out.println("}\n");
	}
}
