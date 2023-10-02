package view.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex01VehicleModelDemo {
	
	public static void main(String[] args) {
		
		// put<k, v> --> hashing(k) --> hashed --> store to memory
		
		//       HashMap: unordered, unsorted
		// LinkedHashMap:   ordered, unsorted
		//       TreeMap:            sorted(by key ascending, required k(comparable))
		// 
		 
		// hashCode gy == hZ
		
		String s1 = "hello";
		String s2 = "ehllo";
		String s3 = "eholl";
		String s4 = "gy";      
		String s5 = "hZ";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println( "END --> "+ System.identityHashCode(s5));

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println("END --> "+ s5.hashCode());
		// Map<K, V> --> Entry<K, V>
		Map<Integer, String> models = new HashMap<>();
		Map<String, String> modelsString = new HashMap<>();
		
		models.put(92, "Quảng Nam");
		models.put(43, "Đà Nẵng");
		models.put(75, "Thừa Thiên Huế");
		models.put(74, "Quảng Trị");
		models.put(73, "Quảng Bình");
		
		modelsString.put("gy", "hihi");
		modelsString.put("hZ", "hihi");
		System.out.println(modelsString.size());
		for(Entry<String, String> entry : modelsString.entrySet()) {
			System.out.println(entry);
		}
		// Cơ chế nào để khi put mới 1 phần tử vào
		// map --> biết được key đã tồn tại
		
		// list<T>, để kiểm tra 1 phần tử tồn tại hay ko
		// duyệt từng phần tử xong có ai equals với phần tử cần kiểm tra hay ko
		// nếu có return true --> thay vì compare equals theo địa chỉ --> override equals theo tt
		
		// map.put(newKey, newValue)
		// map<K, V>, để kiểm tra 1 phần tử tồn tại hay ko
		// duyệt từng phần tử trong map
		// xem có 1. key nào equals với newKey hay ko
		//     và 2. key này cùng hashcode với newKey hay ko
		// nếu thỏa mãn 2 điều kiện trên --> newKey đã tồn tại
		// else --> chưa tồn tại trong map
		
		// mặc định
		// boolean: equals   --> so sánh địa chỉ
		// int    : hashcode --> trả về địa chỉ mà JVM cấp phát cho đối tượng
		
		// xử lý
		// override equals theo thuộc tính cần so sánh 2 đối tượng bằng nhau
		// override hashcode theo thuộc tính cần so sánh 2 đối tượng có hashing(key) bằng nhau
		
		models.put(43, "ĐN"); // override value if key available
		models.putIfAbsent(73, "QB"); // put if key absent
		
		// print by entry, key, value
		// List<T>, Set<T>
		Set<Entry<Integer, String>> entries = models.entrySet();
		for (Entry<Integer, String> entry: entries) {
			System.out.println(entry);
		}
	}
}

/*
 * Implementation notes.
 *
 * This map usually acts as a binned (bucketed) hash table, but
 * when bins get too large, they are transformed into bins of
 * TreeNodes, each structured similarly to those in
 * java.util.TreeMap. Most methods try to use normal bins, but
 * relay to TreeNode methods when applicable (simply by checking
 * instanceof a node).  Bins of TreeNodes may be traversed and
 * used like any others, but additionally support faster lookup
 * when overpopulated. However, since the vast majority of bins in
 * normal use are not overpopulated, checking for existence of
 * tree bins may be delayed in the course of table methods.
 ...
*/