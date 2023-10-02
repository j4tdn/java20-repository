package view.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import utils.CollectionUtils;

public class Ex03MapSorted {

	public static void main(String[] args) {
		// sort by key
		// Map<K, V> map = new TreeMap<>()
		// Map<K, V> map = new TreeMap<>(Comparator<K>)
		
		var models = mockData();
		
		// Comparator.comparing(e -> e.getValue())
		
		var sortedMap = sort(models, Entry.comparingByValue());
		
		CollectionUtils.generate("demo sorted map", sortedMap);
		
	}
	
	private static <K, V> Map<K, V> sort(Map<K, V> map, 
			Comparator<Entry<K, V>> comparator) {
		// B1: convert map<k, v> -> set<entry<k, v>> -> list<entry<k, v>>
		var modelList = new ArrayList<>(map.entrySet());

		// B2: sort list by entry's properties
		modelList.sort(comparator);

		// B3: copy elements from sorted list to new map (to be sorted)
		var sortedMap = new LinkedHashMap<K, V>();
		for (var entry : modelList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> models = new HashMap<>();

		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		return models;
	}
}
