package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//Thực thi 
		//Run --> Crtl F11 --> Chạy toàn bộ chương trình và chạy xong dừng lại
		//Debug --> F11 --> Dùng để dừng lại chương trình tại 1 thời điểm bất kỳ để xem KQ tại đó
		//              --> Đặt cái breakpoint để dừng code tại vị trí đó
		//              --> step over --> nhảy qua dòng code mới
	    //              --> step into --> nhảy vào bên trong hàm
		
		//Mặc định khi in biến KDL nguyên thủy --> lấy giá trị của ô nhớ mà biến trỏ đến ở Stack để in ra
		//Khi in biến KDL đối tượng -->tự động lấy biến đó gọi hàm toString từ class cha tên là Object
		
		//Mọi class có sẵn/tự thêm đều mặc định là class con của class 'Object'
		//class 'Object chứa 1 số hàm: hashcode -->hashing địa chỉ ở vùng nhớ HEAP
		                                        //equal--> ss giá tị 2 đối tượng
												//toString--> ..tự động được gọi khi biến KDL đối tượng
		
		//Để gọi 1 biến(thuộc tính),hàm(phương thức) thuộc 1 class
		//C1: Khai báo thuộc tính hàm đó là static -->Tên class , gọi biến , hàm đó
		//C2: Khai báo thuộc tính hàm đó là non static -->Tạo ra biến(tên đặt cho class) thuộc KDL class 
		//											   -->Lấy biến đó(tên đặt cho class) , gọi thuộc tính , phương thức của class 
		
		//Khai báo và gán giá trị  cho biến KDL nguyên thủy
		int digit=10;
		char letter='W';
		//Khai báo và gán giá trị cho biến KDL đối tượng
		//new Item() --> gọi 1 hàm khởi tạo (constructor) của class/kdl của Item
		//--> Khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của kdl Item
		Item i1 = new Item(1,'J',11d);
		i1.id=1;
		i1.name='J';
		i1.salePrice=11d;
		System.out.println("item --> " + i1.toString());
//		System.out.println("item i1 info --> id = "+ i1.id +","+ i1.name + ",salePrice= "+i1.salePrice);
		Item i2 = new Item(1,'J',11d);
		i2.id=2;
		i2.name='H';
		i2.salePrice=22d;
		System.out.println("item --> " + i2.toString());
//		System.out.println("item i2 info --> id = "+ i2.id +","+ i2.name + ",salePrice= "+i2.salePrice);
		
		Item i3 = null;
//		System.out.println("item3 --> "+ i3.toString()); NPE --> JVM throws(ném) NullPointerException 
		//sẽ xảy ra lỗi NPE sẽ dừng chương trình luôn do không tìm thấy con trỏ tại vùng nhớ HEAP
		Item i4 = new Item(4,'B',44d);
		System.out.println("i4 --> " +i4 );
	}
	
}
