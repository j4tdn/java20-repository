package view.map;

//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.TreeMap;
//
//public class Ex01VehicleModeDemo {
//	public static void main(String[] args) {
//		
//		// put<k,v> ---> hashing(k) ---> hashed --> store to memory
//		Map<Integer, String> models =new HashMap<>();
//		//Map<Integer, String> models =new LinkedHashMap<>();
//		//Map<Integer, String> models =new TreeMap<>(); //mặc định sort tăng dấn theo key, yêu cầu key phải là con của 
//		//COmparable
//		models.put(43,"Đà Nẵng");
//		models.put(92, "Quảng Nam");
//		models.put(75, "Thừa Thiên Huế");
//		models.put(74, "Quảng Trị");
//		models.put(73, "Quảng Bình");
//		models.put(43, "ĐN"); //override value if key available
//		models.putIfAbsent(75, "QB"); //chỉ put khi key không tồn tại
//		
//		//cơ chế nào để khi put mới 1 phần tử vào 
//		//map --> biết được key đã tồn tại
//		
//		//list, để kireemr tra 
//		
//		//print by entry, key, value
//		Set<Entry<Integer,String>> entries =models.entrySet();
//		for(Entry<Integer,String> entry:entries)
//		{
//			System.out.println(entry);
//		}
//		
//	}
	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Set;
	import java.util.TreeMap;

	public class Ex01VehicleModeDemo {
		
		public static void main(String[] args) {
			
			// put<k, v> --> hashing(k) --> hashed --> store to memory
			
			//       HashMap: unordered, unsorted
			// LinkedHashMap:   ordered, unsorted
			//       TreeMap:            sorted(by key ascending, required k(comparable))
			// 
			 
			
			// Map<K, V> --> Entry<K, V>
			Map<Integer, String> models = new HashMap<>();
			
			models.put(92, "Quảng Nam");
			models.put(43, "Đà Nẵng");
			models.put(75, "Thừa Thiên Huế");
			models.put(74, "Quảng Trị");
			models.put(73, "Quảng Bình");
			
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
			// override hashcode theo thuộc tính cần so sánh 2 đối tượng có hashing bằng nhau
			
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
