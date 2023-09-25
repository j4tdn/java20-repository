package utils;

import java.util.List;

import bean.Item;

public class CollectionUtils {

	private CollectionUtils() {
	}
	
	public static void generateItem(String prefix, List<Item> items) {
		int no = 1;
		System.out.println(prefix + " {");
		for (Item item: items) {
			System.out.println("    " + (no++) + ". " + item);
		}
		System.out.println("}\n");
	}
	
	public static void generate(String prefix, List<String> elements) {
		System.out.println(prefix + " {");
		elements.forEach(seq -> System.out.println("   " + seq));
		System.out.println("}\n");
	}
	
	public static void generateInt(String prefix, List<Integer> elements) {
		System.out.println(prefix + " {");
		elements.forEach(seq -> System.out.println("   " + seq));
		System.out.println("}\n");
	}

}
