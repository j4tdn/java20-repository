package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		
		
		
		int a = 10;
		System.out.println("a --> " + a);
		
		System.out.println("\n---------------------------------------\n");
		
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		Integer iE = new Integer(6); 
		Item itA = new Item(1, 'A', 11f);
		
		System.out.println("iA --> " + iA);
		System.out.println("iB --> " + iB); // H1
		System.out.println("iC --> " + iC); // H2
		System.out.println("iD --> " + iD); // H3
		System.out.println("iE --> " + iE); // H22
		
		System.out.println("iC address --> " + System.identityHashCode(iC));
		System.out.println("iE address --> " + System.identityHashCode(iE));
		
		System.out.println("\n---------------------------------------\n");
		
		// Giá trị lưu trữ ở vùng nhớ HEAP (constant pool)
		// Tạo ra biến mới bằng 55 => Kiểm tra xem constant pool đã có ô nhớ nào chứa giá trị 55 chưa
		// Nếu chưa => Tạo ra ô nhớ lưu giá trị 55 => Gán địa chỉ lại cho biến
		// Nếu có rồi => Không tạo ra ô nhớ mới
		Integer oB = 55;
		Integer oC = 66;
		Integer oD = 77;
		Integer oE = 66;
		oE = 999;
		
		System.out.println("oB --> " + oB); // H4
		System.out.println("oC --> " + oC); // H5
		System.out.println("oD --> " + oD); // H6
		System.out.println("oE --> " + oE); // H5
		
		System.out.println("oB address --> " + System.identityHashCode(oB)); // H4
		System.out.println("oC address --> " + System.identityHashCode(oC)); // H5
		System.out.println("oD address --> " + System.identityHashCode(oD)); // H6
		System.out.println("oE address --> " + System.identityHashCode(oE)); // H5
	}
}
