package view.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex03MapSorted {
	public static void main(String[] args) {
		//sort by key
		//Map<K,V> map = new TreeMap<>();
		Map<Integer,String> models = mockData();
		List<Entry<Integer,String>> modelList = new ArrayList<>(models.entrySet());
		//B2: Sort list by entry's properties(sort by value desc
		modelList.sort(Comparator.comparing(e->e.getValue()));
		//modelList.sort(Comparator.comparing(e->e.getValue(),Comparator.reverseOrder()));
		//Comparator.comparing(e->e.getValue())
		
		//B3: COpy elements from sorted list to new map (to be sorted)
		//vì hashmap k đưa vào đúng thứ tự  nên sau khi sắp xếp k nên đưa vào hash map
		//đưa vào map dùng put
		
		
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		//Phân biệt các trong Map
		//khi nào sử dungh cấu trúc dữ liệu map
		for(var entry: modelList)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
	}
	
	private static Map<Integer,String> mockData(){
		Map<Integer, String> models = new HashMap<>();
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		return models;
	}
}
