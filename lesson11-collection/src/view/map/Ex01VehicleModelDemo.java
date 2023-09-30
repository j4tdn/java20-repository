package view.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01VehicleModelDemo {

	public static void main(String[] args) {
		
		// put<k, v> --> hashing(k) --> hashed --> store to memory
		
		// HashMap		: unordered, unsorted
		// LinkedHashMap: ordered, unsorted
		// TreeMap		: sorted(by key ASC, required k(comparable))
		
		
		// Map<K, V> --> Entry<K, V>
		Map<Integer, String> models = new HashMap<>();
		
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		// cơ chế nào để khi put mới 1 phần tử vào
		// map --> biết được key đã tồn tại
		
		// list<T>, để kiểm tra 1 phần tử đã tồn tại không
		// duyệt từng phần tử xog có ai equals với ptu cần kiểm tra ko
		// nếu có return true --> thay vì compare equals theo địa chỉ --> override equals
		
		// map, để kiểm tra 1 phần tử đã tồn tại không
		// --> override equals, hashcode
		
		models.put(43, "DN"); // override value if key available
		models.putIfAbsent(73, "QB"); // put if key absent
		
		// print by entry, key, value
		// List<T>, Set<T>
		Set<Entry<Integer, String>> entries = models.entrySet();
		for (Entry<Integer, String> entry: entries) {
			System.out.println(entry);
		}
	}

}
