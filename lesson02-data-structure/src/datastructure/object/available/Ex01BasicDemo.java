package datastructure.object.available;

public class Ex01BasicDemo {
   public static void main(String[] args) {
	   //primitive
		int a = 10;
		System.out.println("a --> " +a);
		System.out.println("\n-----------------------\n");
		//VD: Integer ,Long, Boolean, Double(class[attribute])
		//100% chỉ có 1 thuộc tính duy nhất
		// giá trị lưu trữ ở vùng nhớ HEAP
		//new --> new ra --> luôn tạo ra ô nhớ ms và gán lại cho biến
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		Integer iE = new Integer(6);
		System.out.println("iA --> "+iA);
		System.out.println("iB --> "+iB); //H1
		System.out.println("iC --> "+iC); //H2
		System.out.println("iD --> "+iD); //H3
		
		System.out.println("iC --> "+System.identityHashCode(iC)); //H2
		System.out.println("iE --> "+System.identityHashCode(iE)); //H3
		
		
		
		System.out.println("\n------------------\n");
		
		// giá trị lưu trữ ở vùng nhớ HEAP(constant pool)
		//tạo ra biến mới --> '55' --> kiểm tra xem constant pool đã có ô nhớ nào
		//chứa giá trị 55 chưa
		// Nếu chưa có --> tạo ra ô nhớ để lưu giá trị 55
		//Nếu có rồi --> không tọa ra ô nhớ mới --> gán địa chỉ cho biến
		Integer oB = 55;
		Integer oC = 66;
		Integer oD = 77;
		Integer oE = 66;//H5
		System.out.println("iB --> "+oB); //H4
		System.out.println("iC --> "+oC); //H5
		System.out.println("iD --> "+oD); //H6
		System.out.println("iE --> "+oE); //H5
		
		System.out.println("iB --> "+System.identityHashCode(oB)); //H4
		System.out.println("iC --> "+System.identityHashCode(oC)); //H5
		System.out.println("iD --> "+System.identityHashCode(oD)); //H6
		System.out.println("iE --> "+System.identityHashCode(oE)); //H5
		
		
}
	
}
