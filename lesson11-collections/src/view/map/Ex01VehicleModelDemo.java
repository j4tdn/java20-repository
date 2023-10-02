package view.map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01VehicleModelDemo {
	public static void main(String[] args) {
		
		//put<k, v> --> hashing(k) --> hashed --. store to memory
		//HashMap: unordered, unsorted
		//LinkedMap: ordered, unsorted
		//TreeMap: unordered, unsorted
		
		//Map<K,V> --> Entry<K, V>
		Map<Integer, String> models = new TreeMap<>();
		
		models.put(43, "Đà Nẵng");
		models.put(92, "Quảng Nam");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		models.put(43, "ĐN"); //override value if key available
		models.putIfAbsent(74, "QB"); //put if key absent
		
		//Cơ chế nào để khi put mới 1 phần tử vào 
		//map --> biết được key nào đã tồn tại
		
		//list để kiểm tra 1 phần tử tồn tại hay không -> duyệt từng phần tử -> boolean
		//map 
		
		//print by entry, key, value
		//List<T>, Set<T>
		Set<Entry<Integer, String>>  entries = models.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry);
		}
		
	}
}
