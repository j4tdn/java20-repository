package view;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import utils.FileUtils;
import utils.CollectionUtils;

public class Ex01MissITTest {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> mapFirstPlace = new HashMap<>();
		
		var listString = FileUtils.readLines("test01-missit.txt");
		
		for (int i = 1; i < listString.size(); i++) {
			int[] a = CollectionUtils.convertToArray(listString.get(i));
			mapFirstPlace.put(a[1], 1);
			int n = 3;
			for(int j = 1; j < a.length; j++) {
				if(map.containsKey(a[j])) {
					int value = map.get(a[j]).intValue() + n--;
					map.put(a[j], value);
				}else {
					map.put(a[j], n--);
				}
			}
		}
		Map<Integer, Integer> sortedMap = sort(map, comparing(c -> c.getValue(), reverseOrder()));
		CollectionUtils.generate("sortedMap", sortedMap);
		var firstEntry = sortedMap.entrySet().stream()
				.findFirst()
				.orElse(null); // Trả về null nếu map rỗng
		System.out.print("Selected contestant: ");
		var modelList = new ArrayList<>(map.entrySet());
		for (var entry: modelList) {
			if(entry.getValue() == firstEntry.getValue()) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
	
	private static <K, V> Map<K, V> sort(Map<K, V> map, Comparator<Entry<K, V>> comparator) {
		var modelList = new ArrayList<>(map.entrySet());
		modelList.sort(comparator);
		var sortedMap = new LinkedHashMap<K, V>();
		for (var entry: modelList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
}
