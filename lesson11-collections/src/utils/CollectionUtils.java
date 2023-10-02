package utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import bean.Item;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	public static <K,V> void generateMap(String prefix, Map<K, V> map) {
		System.out.println(prefix + " {");
		int no = 1;
		for(var entry: map.entrySet()) {
			System.out.println("     " + (no++)+". " + entry.getKey()  + "--> "+ entry.getValue());
		}
		System.out.println("}\n");
	}
	
	public static void generateItem(String prefix, List<Item> elements) {
		System.out.println(prefix + " {");
		int no = 1;
		for(Item item: elements) {
			System.out.println("     " + (no++) + ". "+ item);
		}
		System.out.println("}\n");
	}
	public static void generate(String prefix, List<String> elements) {
		System.out.println(prefix + " {");
		elements.forEach(seq -> {
			System.out.println("     " + seq);
		});
		System.out.println("}\n");
	}
	public static void generateInt(String prefix, List<Integer> elements) {
		System.out.println(prefix + " {");
		elements.forEach(seq -> {
			System.out.println("     " + seq);
		});
		System.out.println("}\n");
	}
	public static BigDecimal  bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
