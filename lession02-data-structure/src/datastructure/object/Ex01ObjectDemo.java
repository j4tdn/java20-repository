package datastructure.object;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Thực thi
		// Run   --> Ctrl F11 --> Chạy toàn bộ chương trình và chạy xong dừng lại
		// Debug --> F11 --> Dùng để dừng lại chương trình tại 1 thời điểm bất kỳ để xem KQ tại đó
		//				 --> Đặt breakpoint để dùng code tại vị trí đó
		//				 --> step over --> nhảy qua dòng code mới
		//				 --> step into --> nhảy vào bên trong hàm 
		
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
