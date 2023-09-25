package utils;

import java.util.List;

import bean.Item;

public class CollectionUtils {
	private CollectionUtils() {
		
	}
	
	public static void generateItem(String prefix, List<Item> elements) {
		// khi dùng 1 local variable bên trong lambda(anonymous class)
		// --> ngầm định local variable đó là final
		int no = 1;
		System.out.println(prefix + " --> {");
		for (Item item: elements) {
			System.out.println("    " + (no++) + ", " + item);
		}
		System.out.println("}\n");
	}
	
	public static void generate(String prefix, List<String> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(element -> {
			System.out.println("     " + element);
		});
		System.out.println("}\n");
	}
	
	public static void generateInt(String prefix, List<Integer> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(element -> {
			System.out.println("     " + element);
		});
		System.out.println("}\n");
	}
}
