package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionUtils {
	private CollectionUtils() {
	}
	public static <K, V> void generate(String prefix, Map<K, V> elements) {
		System.out.println(prefix + " --> {");
		List<Entry<K, V>> modelList = new ArrayList<>(elements.entrySet());
		for(var e : modelList) {
			System.out.println("\t" + e.getKey() + ". " + e.getValue());
		}
		System.out.println("}\n");
	}

	//chuyển string sang mảng int
	public static int[] convertToArray(String string) {
		int[] result = new int[string.length()];
		int running = 0;
		String[] strings = string.split("\\s");
		for(String s : strings) {
			result[running++] = Integer.parseInt(s);
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
