package view.map;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import bean.Item;
import utils.CollectionUtils;

public class Ex03MapSorting {

	public static void main(String[] args) {
		Map<Integer, String> models = mockData();
		CollectionUtils.generateMap("Demo sorted map", models);
		// var sorted = sort(models, Comparator.comparing(s -> s.getValue()));		
		
		// var sortedMap = sort(models, Entry.comparingByValue());
		
		var sort = sort(models, (o1, o2) -> o1.getKey() - o2.getKey());
		
		CollectionUtils.generateMap("Demo sorted map", sort);
	}


	public static <K, V> Map<K, V> sort(Map<K, V> map, Comparator<Entry<K, V>> comparator) {
		// B1: Convert Map<K, V> -> Set<Entry<K, V>> -> List<Entry<K, V>>
		var modelList = new ArrayList<>(map.entrySet());

		// B2: Sort list
		modelList.sort(comparator);
		
		// B3: Copy elements from sorted list to a new map
		var sortedMap = new LinkedHashMap<K,V>();
		
		for (var entry : modelList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static Map<Integer, String> mockData() {
		// original items
		Map<Integer, String> items = new HashMap<>();
		items.put(92, "Quảng Nam");
		items.put(43, "Đà Nẵng");
		items.put(75, "Thừa Thiên Huế");
		items.put(74, "Quảng Trị");
		items.put(73, "Quảng Bình");
		return items;
	}
}