package view.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;

import bean.Item;

public class ExPractice {
	public static void main(String[] args) {
		var originalMap = mockData();
		
		System.out.println();
		
		// Sort map
		var sortedMap = sortMap(originalMap, Comparator.comparing(Entry::getValue));
		for(var entry : sortedMap.entrySet()) {
			System.out.println(entry);
		}
		
		int[] array = new int[] {3,4,5,1,2,7,8,10,9,6};
		int sum = processArray(array, Integer::sum);
		System.out.println("SUM: " + sum);
		
		int maxNum = processArray(array,(a,b) -> a > b ? a : b);
		System.out.println("MAX NUM: " + maxNum);
	}
	
	public static int processArray(int[] array, BinaryOperator<Integer> operator) {
		int result = array[0];
		for(int i = 1; i < array.length;i++) {
			result = operator.apply(result, array[i]);
		}
		return result;
	}
	
	private static <K,V> Map<K, V> sortMap(Map<K,V> map, Comparator<Entry<K,V>> comparator){
		var list = new ArrayList<>(map.entrySet());
		list.sort(comparator);
		LinkedHashMap<K,V> result = new LinkedHashMap<>();
		for(var entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
	
	private static Map<Integer, String> mockData() {
		// original items
		Map<Integer, String> items = new HashMap<>();
		items.put(92, "Quảng Nam");
		items.put(43, "Đà Nẵng");
		items.put(75, "Thừa Thiên Huế");
		items.put(74, "Quảng Trị");
		items.put(26, "Sơn La");
		items.put(73, "Hà Nội");
		items.put(45, "Hà Giang");
		items.put(37, "Đà Lạt");
		return items;
	}
}
