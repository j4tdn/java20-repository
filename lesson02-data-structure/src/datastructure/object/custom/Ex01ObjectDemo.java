package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Thực thi
		// Run    --> Ctrl + F11 --> chạy toàn bộ chương trình và chạy xong dừng lại
		// Debug  --> F11 --> Dùng để dừng lại chương trình tại 1 thời điểm bất kỳ để xem KQ tại đó
		//				  --> Đặt breakpoint để dùng code tại vị trí đó
		//				  --> step over --> nhảy qua dòng code mới
		//				  --> step into
		
		
		// Mặc định
		// khi in biến KDL nguyên thủy --> lấy gtrị của ô nhớ mà biến trỏ đến ở STACK
		// để in ra
		// Khi in biến KDL đối tượng --> tự động lấy biên đó gọi hàm toString từ class
		// cha tên là Object
		
		// Để gọi 1 biến(thuộc tính), hàm(phương thức) thuộc 1 class
		// c1 --> Khai báo thuộc tính, hàm đó là static --> tên class . gọi biến, hàm đó
		// c2 --> khai báo thuộc tính, hàm đó là [non] static --> tạo ra biến thuộc KDL
		//			class --> lấy biến đó . gọi tt, pt của class
		
		// Mọi class có sẵn/tự thêm đều mặc định là class con của clas 'Object'
		// clas 'Object' chứa 1 số hàm: hashcode --> hashing địa chỉ ở vùng nhớ HEAP
		// 								equals	 --> so sánh gtrị 2 đối tượng
		//								toString --> ... tự động đc gọi khi in biến KDL đtượng
		
		// Khai báo và gán giá trị cho KDL nguyên thủy
		int digit = 10;
		char letter = 'w';
		System.out.println("digit --> " + digit);
		// Khai báo và gán giá trị cho biến KDL đối tượng
		// new Item() --> gọi hàm khởi tạo(constructor) của class/kdl Item
		// --> khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của kdl Item
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("item i1 --> " + i1);
		System.out.println("item i1 toString --> " + i1.toString());
		System.out.println("item i1 infor --> id = " + i1.id 
									+ ", name = " + i1.name 
									+ ", salesPrice = " + i1.salesPrice);
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22;
		System.out.println("item i2 --> " + i2);
		System.out.println("item i2 toString --> " + i2.toString());
		System.out.println("item i2 infor --> id = " + i2.id 
									+ ", name = " + i2.name 
									+ ", salesPrice = " + i2.salesPrice);
		
		// compile time --> tying cope
		// runtime --> initial objects at HEAP memory
		/*
		 * Item i3 = null; System.out.println("item i3 --> " + i3); // null
		 * System.out.println("item i3 --> " + i3.toString());
		 */
		// NPE --> JVM throw NullPointerException
		// thấy vị trí trỏ đến tại vùng nhớ HEAP -->dừng luôn chương trình
		System.out.println("HELLO");
		Item i4 = new Item(3,'S',33);
		System.out.println("item i4 --> " + i4);
		System.out.println("item i4 toString --> " + i4.toString());
		System.out.println("item i4 infor --> id = " + i4.id 
									+ ", name = " + i4.name 
									+ ", salesPrice = " + i4.salesPrice);
	}
}
