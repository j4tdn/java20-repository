package utils;

import java.util.List;
import java.util.Map;

import bean.Item;

public class CollectionUtils {
	
	private CollectionUtils() {	
	}
	
	public static <K, V> void generateMap(String prefix, Map<K, V> elements) {
		System.out.println(prefix + "{");
		int no = 1;
		for(var item : elements.entrySet()) {
			System.out.println("  " + no++ + ". " + item.getKey() + " --> " + item.getValue());
		}
		System.out.println("}\n");
	}
	
	public static void generateItem(String prefix, List<Item> elements) {
		// Khi dùng 1 local varialle bên trong lamda(anonymous class) 
		// --> ngầm định local variable đó là final
		System.out.println(prefix + "{");
		int no = 1;
//		elements.forEach(seq -> System.out.println("  " + seq)); -> unable to run
		for(Item item : elements) {
			System.out.println("  " + no++ + ". " + item);
		}
		System.out.println("}\n");
	}
	
	public static void generate(String prefix, List<String> elements) {
		System.out.println(prefix + "{");
		elements.forEach(seq -> System.out.println("  " + seq));
		System.out.println("}\n");
	}
	
	public static void generateInt(String prefix, List<Integer> elements) {
		System.out.println(prefix + "{");
		elements.forEach(seq -> System.out.println("  " + seq));
		System.out.println("}\n");
	}
	
}
