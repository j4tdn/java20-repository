package datastructure.object.availible;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//primitive type
		int a = 10;
		System.out.println("a--> " + a);
		System.out.println("=========");
		//VD: Integer(value), Long, Double, Boolean(class[attribute])
		//100% KDL này chỉ có 1 thuộc tính duy nhất
		//giá trị lưu trữ ở vùng nhớ HEAP
		//new --> luôn tạo ra 1 ô nhớ mới và gán lại cho biến
		
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(7);
		System.out.println("A--> " + iA);
		System.out.println("B--> " + iB);//h1
		System.out.println("C--> " + iC);//h2
		System.out.println("D--> " + iD);//h3
		
		//giá trị lưu trữ ở vùng nhớ HEAP(constant pool)
		//new --> luôn tạo ra 1 ô nhớ mới và gán lại cho biến
		//nếu chưa có --> tạo ra ô nhớ để lưu trữ giá trị
		//nế có rồi --> ko tạo ra ô nhớ mới --> gán địa chỉ đó cho biến 
		Integer oB = 55;
		Integer oC = 66;
		Integer oD = 77;
		Integer oE = 66;
		oE = 999;
		System.out.println("oB--> " + oB);//h1
		System.out.println("oC--> " + oC);//h2
		System.out.println("oD--> " + oD);//h3
		System.out.println("E--> " + oE);//h1
		System.out.println("============");
		System.out.println("oB--> " + System.identityHashCode(oB));//h1
		System.out.println("oC--> " + System.identityHashCode(oC));//h1
		System.out.println("oD--> " + System.identityHashCode(oD));//h1
		System.out.println("oE--> " + System.identityHashCode(oE));//h1
		
	}
}