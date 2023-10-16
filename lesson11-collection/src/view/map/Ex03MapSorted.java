package view.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import utils.CollectionUtils;

import static java.util.Comparator.*;

public class Ex03MapSorted {
	public static void main(String[] args) {
		// sort by key
		// Map<K, V> map = new TreeMap<>(); --> K implements Comparable<K>
		// Map<K, V> map = new TreeMap<>(Comparator<K>);

		Map<Integer, String> models = mockData();
		
		var sortedmap = sort(models, comparing(e -> e.getValue(), reverseOrder()));
		
		CollectionUtils.generate("models sort", sortedmap);
	}

	private static Map<Integer, String> sort(Map<Integer, String> map,
			Comparator<Entry<Integer, String>> comparator) {
		// B1: Convert map<k, V> -> set<Entry<k, V>> -> list<entry<k, V>>
		var modelList = new ArrayList<>(map.entrySet());

		// B2: Sort list by entry's property (sort by value desc)
		modelList.sort(comparator);

		// B3: Copy elements from sorted list to new map(to be sorted)
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
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
