package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// primitive
		int a = 10;
		System.out.println("a --> " + a);

		System.out.println("\n---------------\n");	
		
		
		// VD: Integer(value(private final int)), Long, Boolean, Double(class[attribute])
		// 100% KDL này chỉ có 1 thuộc tính duy nhất
		
		// giá trị lưu trữ ở vùng nhớ HEAP(normal)
		// new --> new ra --> luôn tạo ra 1 ô nhớ mới và gán lại cho biến
		Integer iA = null;
		Integer iB = new Integer(5); // H1
		Integer iC = new Integer(6); // H2
		Integer iD = new Integer(7); // H3
		Integer iE = new Integer(6); // H22
		Item itA = new Item(1, 'A', 11f);	
		
		System.out.println("iA --> " + iA);
		System.out.println("iB --> " + iB); 
		System.out.println("iC address --> " + System.identityHashCode(iC)); 
		System.out.println("iD --> " + iD); 
		System.out.println("iE address --> " + System.identityHashCode(iE));
		
		System.out.println("\n---------------\n");	
		
		// giá trị lưu trữ ở vùng nhớ HEAP(constant(hằng số) pool(hồ))
		// tạo ra biến mới --> '55' --> kiểm tra xem trên constant pool đã có ô nhớ nào
		// chứa giá trị 55 chưa
		// Nếu chưa có --> tạo ra ô nhớ để lưu giá trị 55 --> gán địa chỉ lại cho biến
		// Nếu có rồi  --> không tạo ra ô nhớ mới --> gán địa chỉ đó cho biến
		Integer oB = 55; //H4
		Integer oC = 66; //H5
		Integer oD = 77; //H6
		Integer oE = 66; //H5
		oE = 999; // H7
		
		// Item itAA = 1, 'A', 11f;
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
