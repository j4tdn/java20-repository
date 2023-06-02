package datastucture.object.available;

import datastructure.object.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// primitive
		int a = 10;
		System.out.println("a --> " + a);
		
		System.out.println("\n-----------------------\n");
		
		// VD: Integer, Long, Boolean, Double(class [attribute])
		// 100% KDL này chỉ có 1 thuộc tính duy nhất
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		Integer iE = new Integer(6);
		Item itA = new Item(1, 'A', 11f);
		
		System.out.println("iA --> " + iA); 
		System.out.println("iB --> " + iB); //H1
		System.out.println("iC address --> " + System.identityHashCode(iC));
		System.out.println("iD --> " + iD); //H3
		System.out.println("iE address --> " + System.identityHashCode(iE));
		
		System.out.println("\n-----------------------\n");
		
		// giá trị lưu trữ ở vùng nhớ HEAP()
		// Nếu chưa có --> tạo ra ô nhớ để lưu giữ
		// Nếu có lỗi --> không tạo ra ô nhớ mới --> gán địa chỉ đó cho biến 
		Integer oB = 55;
		Integer oC = 66;
		Integer oD = 77;
		Integer oE = 66;
		oE = 999;
		
		//Item itA = 1, 'A', 11f;
		System.out.println("oB --> " + oB); //H4
		System.out.println("oC --> " + oC); //H5
		System.out.println("oD --> " + oD); //H6
		System.out.println("oE --> " + oE); //H5
		
		System.out.println("oB address --> " + System.identityHashCode(oB));
		System.out.println("oC address --> " + System.identityHashCode(oC));
		System.out.println("oD address --> " + System.identityHashCode(oD));
		System.out.println("oE address --> " + System.identityHashCode(oE));
	}
}
