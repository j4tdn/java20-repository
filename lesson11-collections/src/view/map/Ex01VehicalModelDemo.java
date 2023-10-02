package view.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01VehicalModelDemo {
	public static void main(String[] args) {
		
		// put<K,V> --> hashing(K) --> hashed --> store to memory
		
		// hashMap: unordered, unsorted
		// LinkedHashMap: ordered, unsorted
		// treeMap: sorted(By Key ASC, required k(Comparable))
		
		// map<K,V> --> Entry<K,V>
		Map<Integer, String> models = new HashMap<>();
		
		models.put(92, "quang nam");
		models.put(43, "Da nang");
		models.put(75, "thua thien hue");
		models.put(74, "quang tri");
		models.put(73, "quang binh");
		
		
		// cơ chế nào khi put mới 1 phần tử vào
		//map --> biết đc key đã tồn tại
		models.put(43, "DN");//override value if key value
		models.putIfAbsent(73, "QB"); // put if key absent
		
		// print by entry, value
		//List<T>, Set<T>
		Set<Entry<Integer, String>> entries = models.entrySet();
		for(Entry<Integer, String> entry: entries) {
			System.out.println(entry);
		}
	}
}
