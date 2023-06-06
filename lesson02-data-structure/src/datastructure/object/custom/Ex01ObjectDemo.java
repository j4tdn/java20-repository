package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Thực thi
		// Run    --> Ctrl F11 --> Chạy toàn bộ chương trình và chạy xong dừng lại
		// Debug  --> F11 --> Dùng để dừng lại chương trình tại 1 thời điểm bất kỳ để xem KQ tại đó
		//   			  --> Đặt breakpoint để dùng code tại vị trí đó
		//     			  --> step over --> nhảy qua dòng code mới
		//				  --> step into --> nhảy vào bên trong hàm
		
		// Mặc định
		// Khi in biến KDL nguyên thủy --> Lấy giá trị của ô nhớ mà biến trỏ đến ở STACK để in ra.
		// Khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ class cha tên là Object.
		
		// Để gọi 1 biến(thuộc tính), hàm(phương thức) thuộc 1 class
		// C1 --> Khai báo thuộc tính, hàm đó là static --> Tên class . gọi biến, hàm đó
		// C2 --> Khai báo thuộc tính, hàm đó là [non] static --> Tạo ra biến thuộc KDL class
		//													  --> Lấy biến đó, gọi tt, pt của class
		
		// Mọi class có sẵn/tự thêm đều mặc định là class con của class Object
		// class 'Object' chứa 1 số hàm: hashcode --> hashing địa chỉ ở vùng nhớ HEAP
		//						     	 equals --> so sánh giá trị 2 đối tượng
		//								 toString --> ... Tự động được gọi khi in biến KDL đối tượng.
		
		// Khai bao va gan gia tri cho bien KDL nguyen thuy
		int digit = 10;
		char letter = 'a';
		System.out.println("digit --> " + digit);
		System.out.println("letter --> " + letter);
		
		// Khai bao vao gan gia tri cho bien KDL doi tuong
		// new Item() --> gọi hàm khởi tạo (Constructor) của class/kdl Item
		// --> Khởi tạo 1 ô nhớ trên Heap để lưu giá trị của kdl Item.
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("item i1 --> " + i1);
		System.out.println("item i1 toString --> " + i1.toString());
		System.out.println("item i1 info --> id = " + i1.id + ", name = " + i1.name + 
						   ", salesPrice = " + i1.salesPrice);
		
		System.out.println();
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		System.out.println("item i2 --> " + i2);
		System.out.println("item i2 toString --> " + i2.toString());
		System.out.println("item i2 info --> id = " + i2.id + ", name = " + i2.name + 
						   ", salesPrice = " + i2.salesPrice);
		
		// compile time --> typing code
		// runtime --> initial objects at HEAP memory
		//Item i3 = null;
		//System.out.println("Item i3 --> " + i3); //null
		//System.out.println("Item i3 toString --> " + i3.toString());
		//NPE: --> JVM throws(ném) NullPointerException
		//     --> ko tìm thấy vị trí trỏ đến tại vùng nhớ HEAP --> dừng luôn chương trình
		
		Item i4 = new Item(4, 'B', 44d);
		System.out.println("item i4 --> " + i4);
		System.out.println("item i4 toString --> " + i4.toString());
		System.out.println("item i4 info --> id = " + i4.id + ", name = " + i4.name + 
						   ", salesPrice = " + i4.salesPrice);
	
	}
}
