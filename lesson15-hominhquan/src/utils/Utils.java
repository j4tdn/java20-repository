package utils;



import java.util.Collection;

import java.util.Map;



public class Utils {
	private Utils() {
	}	
	
	
	public static <E> void generate(String prefix, Collection<E> collection) {
		System.out.println(prefix + " --> {");

		for (E element : collection) {
			System.out.println("     " + element);
		}

		System.out.println("}\n");
	}
	
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		System.out.println(prefix + " --> {");	
		for (K key: map.keySet()) {
			System.out.println("  " + key + ", " + map.get(key));
		}
		System.out.println("}");
	}
}
