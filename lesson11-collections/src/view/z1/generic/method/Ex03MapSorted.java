package view.z1.generic.method;

import static java.util.Comparator.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import util.CollectionUtils;

public class Ex03MapSorted {
	public static void main(String[] args) {
		Map<Integer, String> models = mockData();

		//var modelSorted = sort(models, comparing(e -> e.getValue()));
		var modelSorted = sort(models, Entry.comparingByValue(reverseOrder()));
		CollectionUtils.generateStrings("Sort", modelSorted);

	}

	private static <K, V> Map<K, V> sort(Map<K, V> map, Comparator<Entry<K, V>> comparator) {
		List<Entry<K, V>> modelList = new ArrayList<>(map.entrySet());

		modelList.sort(comparator);
		Map<K, V> sortedMap = new LinkedHashMap<>();
		for (Entry<K, V> e : modelList) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		return sortedMap;
	}

	private static Map<Integer, String> mockData() {
		Map<Integer, String> models = new TreeMap<>();

		models.put(43, "Đà Nẵng");
		models.put(92, "Quảng Nam");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		return models;
	}

}
