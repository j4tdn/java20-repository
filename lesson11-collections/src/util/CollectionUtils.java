package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Item;

public class CollectionUtils {
	private CollectionUtils() {
	}
	
	public static <K, V> void generateStrings(String prefix, Map<K, V> elements) {
		int no = 1;
		System.out.println(prefix + " --> {");
		List<Entry<K, V>> modelList = new ArrayList<>(elements.entrySet());
		for(var e : modelList) {
			System.out.println(no + ". " + e.getValue());
		}
		System.out.println("}\n");
	}
	public static void generateStrings(String prefix, List<String> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(seq -> System.out.println(seq));
		System.out.println("}\n");
	}
	
	public static void generateInts(String prefix, List<Integer> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(seq -> System.out.println("\t" + seq));
		System.out.println("}\n");
	}
	public static void generateItems(String prefix, List<Item> elements) {
		//Khi dùng 1 local variable bên trong lambda (anonymous class)
		//--> ngầm định local variable đó là final
		int no = 1;
		System.out.println(prefix + " --> {");
		for(Item i : elements) {
			System.out.println("\t" + (no++) + "." + i);
		}
		System.out.println("}\n");
	}
}
