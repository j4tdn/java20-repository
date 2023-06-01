package datastructure.object.available;

import java.util.List;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// Primitive
		int a = 10;
		System.out.println("a --> " + a);

		// VD: Integer, Long, Boolean, Double(Class[Attributes])
		// 100% KDL này chỉ có 1 thuộc tính duy nhất
		// Giá trị lưu trữ ở vùng nhớ HEAP
		// new ra -> luôn tạo ra 1 vùng nhớ mới và gán lại địa chỉ cho biến ở vùng nhớ STACK
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		
		System.out.println("iA --> " + iA);
		System.out.println("iB --> " + iB); // H1
		System.out.println("iC --> " + iC); // H2
		System.out.println("iD --> " + iD); // H3
		
		System.out.println("\n-------------------------\n");
		
		
		//Giá trị lưu trữ ở vùng nhớ HEAP (constant pool)
		//Tạo ra biến mới chứa giá trị được gán (55) -> gán lại địa chỉ cho biến
		//Nếu chưa có --> tạo ra ô nhớ mới lưu trữ giá trị 55 -> gán lại địa chỉ cho biến
		//Nếu đã có --> không tạo ra ô nhớ mới --> lấy địa chỉ của ô nhớ chứa giá trị đã có gán cho biến
		Integer oB = 55;
		Integer oC = 66;
		Integer oD = 77;
		
		System.out.println("iB --> " + iB); // H4
		System.out.println("iC --> " + iC); // H5
		System.out.println("iD --> " + iD); // H6
		
	}
}