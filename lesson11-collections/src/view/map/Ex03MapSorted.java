package view.map;

import java.util.ArrayList;
import java.util.Comparator;

import static java.util.Comparator.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import utils.CollectionUtils;


public class Ex03MapSorted {

	public static void main(String[] args) {
		// arrays.sort(T[])

		// sort by key
		var models = mockData();
		var sortedMap = sort(models, Entry.comparingByValue(reverseOrder()));
		CollectionUtils.generateMap("demo sorted mao", sortedMap);
	}

	private static <K,V> Map<K, V> sort(Map<K, V> map, 
			Comparator<Entry<K, V>> comparator) {
		// convert map --> list
		var modelList = new ArrayList<>(map.entrySet());

		// b2: sort list by entry property
		modelList.sort(comparator);

		// b3: copy elements from sorted list to new map (to be sorted)
		var sortedMap = new LinkedHashMap<K,V>();
		for (Entry<K, V> entry : modelList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> models = new HashMap<>();

		models.put(92, "quang nam");
		models.put(43, "Da nang");
		models.put(75, "thua thien hue");
		models.put(74, "quang tri");
		models.put(73, "quang binh");
		return models;
	}

}
