package view.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01VehicleModelDemo {
	
	public static void main(String[] args) {
		
		// Map<K, V> --> Entry<K, V>
		Map<Integer, String> models = new HashMap<>();
		
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		models.put(43, "ĐN");
		models.putIfAbsent(73, "QB");
		
		
		// print by entry, key, value
		// List<T>, Set<T>
		Set<Entry<Integer, String>> entries = models.entrySet();
		for (Entry<Integer, String> entry : entries) 
			System.out.println(entry);
		
	}

}
