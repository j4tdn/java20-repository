package datastructure.object;

import java.security.Identity;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Thực thi
		// Run    --> Ctrl F11 --> Chạy toàn bộ chương trình và chạy xong dừng lại
		// Debug  --> F11 --> Dùng để dừng lại chương trình tại một thời điểm bất kì để xem kết quả tại đó
		// 				  --> Đặt breakpoint để dừng code tại vị trí đó
		// 				  --> Step over --> nhảy qua dòng code mới
		// 				  --> Step into --> nhảy vào bên trong hàm
		
		// Mặc định
		// Khi in biến KDL nguyên thuỷ --> Lấy giá trị của ô nhớ mà biến trỏ đến ở STACK để in ra
		// Khi in bién KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ class cha tên là Object
		
		// Để gọi 1 biến(thuộc tính), hàm(phương thức) thuộc 1 class
		// C1 --> Khai báo thuộc tính(biến) hàm đó là static --> Tên class. gọi biến, hàm đó
		// C2 --> Khai báo thuộc tính, hàm đó là [non] static --> Tạo ra biến thuộc KDL class
		//													  --> Lấy biến đó . gọi thuộc tính, phương thức của class
		
		// Mọi class có sẵn/tự thêm đều mặc định là class con của class 'Object'
		// class 'Object' chứa 1 số hàm : hashcode --> hashing địa chỉ ở vùng nhớ HEAP
		//								  equals   --> so sánh giá trị 2 đối tượng
		//								  toString --> ... tự động được gọi khi in biến KDL đối tượng
		
		// Khai báo và gán giá trị cho biến kiểu dữ liệu nguyên thuỷ
		int digit = 10;
		char letter = 'W';
		System.out.println("digit --> " + digit);
		System.out.println("letter --> " + letter);
		
		System.out.println("\n***__ --- __ ***\n");
		
		// Khai báo và gán giá trị cho biến kiểu dữ liệu đối tượng
		// new Item() --> gọi hàm khởi tạo(constructor) của class/kdl Item
		// --> Khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của kdl Item (mặc định trả về kiểu dữ liệu của class chứa nó)
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("item i1 --> " + i1); //datastructure.object.Item@4617c264
		System.out.println("item i1 toString  --> " + i1.toString()); // .toString String(return type) - Object(Type chứa hàm toString
		System.out.println("Item i1 info --> id=  " + i1.id + ", name = " + i1.name + ", salesPrice = " + i1.salesPrice);
		
		System.out.println("\n***__ --- __ ***\n");
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		System.out.println("item i2 --> " + i2); //datastructure.object.Item@4617c264
		System.out.println("item i2 toString  --> " + i2.toString()); // .toString String(return type) - Object(Type chứa hàm toString
		System.out.println("Item i2 info --> id=  " + i2.id + ", name = " + i2.name + ", salesPrice = " + i2.salesPrice);
		
		Item i3 = null;
		System.out.println("item i3 --> " + i3); // null
		// System.out.println("item i3 toString --> " + i3.toString());
		// NPE --> JVM throws NullPointerException
		//     --> Ko tìm thấy vị trí trỏ đến tại vùng nhớ HEAP --> dừng luôn chương trình tại đây
		
		System.out.println("\n***__ --- __ ***\n");
		
		Item i4 = new Item();
		i4.id = 4;
		i4.name = 'B';
		i4.salesPrice = 44d;
		System.out.println("item i4 --> " + i4); 
		System.out.println("item i4 toString  --> " + i4.toString()); 
		System.out.println("Item i4 info --> id=  " + i4.id + ", name = " + i4.name + ", salesPrice = " + i4.salesPrice);
		
	}
}
