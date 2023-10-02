package lesson11.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	public static void main(String[] args) {
		Map<String, String> dict = mockdata();
		String lookup = "Hello";
		System.out.println("Tra cứu từ vựng# " + lookup + " nghĩa là: " + dict.get(lookup));
		String removed = "Developer";
		System.out.println("Tra cứu từ vựng# " + removed + " nghĩa là: " + dict.get(removed));
		dict.remove(removed);
		System.out.println("Tra cứu từ vựng#Sau khi xóa " + removed + " nghĩa là: " + dict.get(removed));
		System.out.println("Số từ vựng có trong từ điển: " + dict.size());
		// Sắp xếp danh sách từ vựng
	}
	
	public static Map<String, String> mockdata() {
		Map<String, String> dict = new HashMap<>();
		dict.put("Hello", "Xin chào");
		dict.put("Breakfast", "Bữa ăn sáng");
		dict.put("Developer", "Lập trình viên");
		dict.put("Doctor", "Bác sĩ");
		dict.put("Motobike", "Xe máy");
		dict.put("Crazy", "Điên");
		
		return dict;
	}
}
