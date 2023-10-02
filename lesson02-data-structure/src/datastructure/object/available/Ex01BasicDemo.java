package datastructure.object.available;

import datastructure.object.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//primative
		int a = 10;
		System.out.println("a --> " + a);
		System.out.println("\n----------------\n");
		//VD: Integer, Long, Double (class[attribute]) --> Chỉ có 1 thuộc tính
		//Lưu trữ ở vùng nhớ HEAP --> Không thay đổi đc giá trị trên HEAP vì final
		//new --> luôn tạo một ô nhớ mới rồi gán lại cho biến
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		Integer iE = new Integer(6);
		Item itA = new Item(1, 'A', 11f);
		
		System.out.println("iA --> " + iA); 
		System.out.println("iB --> " + iB); //H1
		System.out.println("iC --> " + iC); //H2
		System.out.println("iD --> " + iD); //H3
		System.out.println("iC address --> " + System.identityHashCode(iC));
		System.out.println("iE address --> " + System.identityHashCode(iE));
		System.out.println("\n----------------\n");
		//Lưu trữ ở vùng nhớ HEAP (constant pool - hằng số hồ)
		//tạo ra biến mới --> '55' --> Kiểm tra xem costant pool đã có ô nhớ nào chứa giá trị 55 chưa
		//						   --> Nếu chưa có thì tạo ô nhớ mới
		//						   --> Nếu có rồi không tạo ô nhớ mới
		Integer oB = 55; //H4
		Integer oC = 66; //H5
		Integer oD = 77; //H6
		Integer oE = 66; //H5
		//oE = new Integer(999); --> Tạo ô nhớ mới
		//oE = 999; --> Kiểm tra -> chưa có -> tạo ô nhớ mới
		System.out.println("oB --> " + oB);
		System.out.println("oC --> " + oC);
		System.out.println("oD --> " + oD);
		System.out.println("oE --> " + oE);
		
		System.out.println("oB address --> " + System.identityHashCode(oB));
		System.out.println("oC address --> " + System.identityHashCode(oC));
		System.out.println("oD address --> " + System.identityHashCode(oD));
		System.out.println("oE address --> " + System.identityHashCode(oE));
	}
}
