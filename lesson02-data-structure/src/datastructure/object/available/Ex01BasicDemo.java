package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//primitive
		int a = 10;
		System.out.println("a --> " + a);
		
		//vd: Integer(value), Long, Boolean, Double(c1, c2)
		// 100% DDl này chỉ có 1 thuộc tính duy nhất
		// giá trị lưu trữ ở vùng nhớ HEAP
		//new --> new ra --> luôn tạo ra 1 ô nhớ mới và gán lại cho biến
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		Integer iE = new Integer(6);
		Item itA = new Item(1, 'A', 11f);
		
		System.out.println("iA --> " +iA);
		System.out.println("iB --> " +iB);
		System.out.println("iC address --> " +System.identityHashCode(iC));
		System.out.println("iD --> " +iD);
		System.out.println("iE address --> " +System.identityHashCode(iE));

		
		System.out.println("\n------------------------\n");
		
		//giá trị lưu trữ ở vùng nhớ HEAP(contacnt(hằng số)pool(hồ))
		//tạo ra biến mới --> '55' --> kiểm tra xem constant pool đã có ô nhó nào chứa giá trị 55 chưa
		// nếu chưa có --> tạo ra ô nhớ để lưu giá trị 55
		//nếu có rồi --> không tạo ra ô nhớ mới --> gán địa chỉ đó cho biến
		Integer oB = 55;
		Integer oC = 66;
		Integer oD = 77;
		Integer oE = 66;
		oE = 999;

		System.out.println("oB address --> " +System.identityHashCode(oB));
		System.out.println("oC address --> " +System.identityHashCode(oC));
		System.out.println("oD address --> " +System.identityHashCode(oD));
		System.out.println("oE address --> " +System.identityHashCode(oE));
		
		System.out.println("oB --> " +oB);
		System.out.println("oC --> " +oC);
		System.out.println("oD --> " +oD);
		System.out.println("oE --> " +oE);
		
	}
}
