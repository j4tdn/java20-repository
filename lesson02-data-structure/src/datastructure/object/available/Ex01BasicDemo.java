package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// primitive
		int a = 10;
		System.out.println("a --> " + a);

		System.out.println("\n---------------\n");	
		
		
		// VD: Integer(value), Long, Boolean, Double(class[attribute])
		// 100% KDL này chỉ có 1 thuộc tính duy nhất
		
		// giá trị lưu trữ ở vùng nhớ HEAP
		// new --> new ra --> luôn tạo ra 1 ô nhớ mới và gán lại cho biến
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
		System.out.println("iE --> " + iE);
		
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
		// Item itAA = 1, 'A', 11f;
		System.out.println("oB --> " + oB); //H4
		System.out.println("oC --> " + oC); //H5
		System.out.println("oD --> " + oD); //H6
		System.out.println("oE --> " + oE); //H5

		
	}

}
