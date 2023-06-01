package datastructure.object.available;

import datastructure.object.custem.Item;
public class Ex01BasicDemo {	
	public static void main(String[] args) {
		//primitive
		int a =10;
		System.out.println("a--> "+a);
		
		//VD ;Integer ,Long ,Boolean, Double(class[attribute])
		
		//100% KDL này chỉ có 1 thuộc tính duy nhất
		//giá trị lưu ở vùng nhớ HEAP
		//new --> new ra --> luôn tạo ra 1 ô nhớ mới và gán lại cho biến
		Integer iA = null;
		Integer iB =new Integer(5);//h1
		Integer iC =new Integer(6);//h2
		Integer iD =new Integer(7);//h3
		Integer iE =new Integer(6);//h22
		Item itA = new Item(1,'A',11f);
		
		System.out.println("iA --> "+ iA);
		System.out.println("iB --> "+ iB);//H1
		System.out.println("iC --> "+ iC);//H2
		System.out.println("iD --> "+ iD);//H3
		System.out.println("---------");
		
		System.out.println("iC address --> "+ System.identityHashCode(iC));//H1
		System.out.println("iE address --> "+ System.identityHashCode(iE));//H1
		//giá trị lưu trữ ở vungd nhớ HEAP(constant(hằng số) pool(hồ))
		//tạo ea biến mới --> '55' -->Kiểm tra xem constant pool đã có ô nhớ nào trên chứa giá trị 55 chưa
		//Nếu chưa có --> tạo ra ô nhớ để lưu giá trị 55 --> gán địa chỉ lại cho biến  
		//Nếu có rồi --> ko tại ra ô nhớ mới --> gán địa chỉ đó cho biến
		
		Integer oB =55;
		Integer oC =66;
		Integer oD = 77;
		Integer oE =66;
		System.out.println("oB --> "+ oB);//H4
		System.out.println("oC --> "+ oC);//H5
		System.out.println("oD --> "+ oD);//H6
		System.out.println("oE --> "+ oE);//H6
		
		System.out.println("oB address --> "+ System.identityHashCode(oB));//H4
		System.out.println("oC address--> "+ System.identityHashCode(oC));//H5
		System.out.println("oD address --> "+ System.identityHashCode(oD));//H6
		System.out.println("oE address--> "+ System.identityHashCode(oE));//H6
		System.out.println("---------");
		
		
	
	}
}
