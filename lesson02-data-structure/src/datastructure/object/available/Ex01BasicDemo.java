package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// primitive
		int a = 10;
		System.out.println("a --> " + a );
		System.out.println("\n-----------------\n");
		
		// VD: Integer(value), Long, Boolean, Double(class[attributes])
		// 100% KDL này chỉ có 1 thuộc tính duy nhât
		
		// giá trị lưu trữ ở vùng nhớ HEAP(normal).
		// new --> new ra --> luôn tạo ra 1 ô nhớ mới --> gán lại địa chỉ cho biến
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
		
		System.out.println("\n-----------------\n");
		
		// giá trị lưu trữ ở vùng nhớ HEAP(constant pool)
		// tạo ra biến mới --> '55' --> kiểm tra xem constant pool đã có ô nhớ nào 
		// chứa giá trị 55 chưa
		// Nếu chưa có --> tạo ra ô nhớ để lưu giá trị 55
		// Nếu có rồi --> không tạo ra ô nhớ mới
		Integer oB = 55; // H4
		Integer oC = 66; // H5
		Integer oD = 77; // H6
		Integer oE = 66; // H5
		oE = 999;
		
		// Item itAA = 1, 'A', 11f;
		System.out.println("oB --> " + oB); //H4
		System.out.println("oC --> " + oC); //H5
		System.out.println("oD --> " + oD); //H6
		System.out.println("oE --> " + oE); //H5
		
		System.out.println("oB --> " + System.identityHashCode(oB)); //H4
		System.out.println("oC --> " + System.identityHashCode(oC)); //H5
		System.out.println("oD --> " + System.identityHashCode(oD)); //H6
		System.out.println("oE --> " + System.identityHashCode(oE)); //H5
	}
}
