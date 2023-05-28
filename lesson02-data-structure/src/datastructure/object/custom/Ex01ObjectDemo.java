package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//Thực thi
		//Run		--> Ctrl + F11 --> chạy toàn bộ chương trình và chạy xong dừng lại
		//Debug		--> F11	--> dùng để dừng lại chương trình lại 1 thời điểm bất kỳ để xem KQ tại đó
		//			--> Đặt breakpoint để dừng code tại vị trí đó
		//			--> Step over --> nhảy qua dòng code mới
		//			--> Step into --> nhảy vào bên trong hàm
		
		// Mặc định
		// Khi in biến kdl nguyên thủy --> lấy giá trị của ô nhớ mà biến trỏ đến ở STACK

		// Khi in biến kdl đối tượng --> tự động lấy biến đó gọi hàm toString từ class
		// cha tên là Object

		// In Java, mọi class có sẵn/tự thêm đều mặc định là class con của class
		// 'Object'
		// Class 'object' chứa một số hàm:
		// HashCode --> hashing địa chỉ ở vùng nhớ HEAP
		// Equals --> so sánh giá trị 2 đối tượng
		// toString --> tự động được gọi khi in ra biến kdl đối tượng

		// Để gọi 1 biến(thuộc tính), hàm (phương thức) thuộc 1 class
		// C1: --> khai báo thuộc tính, hàm đó là static --> tên class . gọi biến, hàm đó
		// C2: --> khai báo thuộc tính, hàm đó là non-static --> tạo ra biến thuộc kdl class
		//     												 --> lấy biến đó gọi thuộc tính, phương thức của class
		// Khai báo và gán giá trị cho biến KDL nguyên thủy
		
		int digit = 10;
		char letter = 'W';
		System.out.println("digit --> " + digit);
		System.out.println("------------------------------------\n");

		// Khai báo và gán giá trị cho biến KDL đối tượng
		// new Item() --> gọi hàm khởi tạo của class/ kdl Item
		// --> khởi tạo 1 ô nhứ ở HEAP để lưu trữ fias trị của kdl Item
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("Item i1 --> " + i1);
		System.out.println("Item i1 --> " + i1.toString());
		System.out.println("Item i1 info --> id = " + i1.id + ", name = " + i1.name + ", salesPrice = " + i1.salesPrice);
		
		System.out.println("\n----------------------------------------------------\n");
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		System.out.println("Item i2 --> " + i2);
		System.out.println("Item i2 --> " + i2.toString());
		System.out.println("Item i2 info --> id = " + i2.id + ", name = " + i2.name + ", salesPrice = " + i2.salesPrice);
		
		System.out.println("------------------------------------\n");
		// Compile time --> typing code
		// Runtime --> initial objects at heap memory
		Item i3 = null;
		System.out.println("I3 = " + i3);
		
		// Compile time: Không phát hiện lỗi vì lúc viết code chưa khởi tạo các đối tượng trong HEAP
		// Runtime	   : Báo lỗi vì khởi tạo đối tượng không có vùng nhớ HEAP
		//System.out.println("I3 = " + i3.toString()); //NPE --> JVM throws NullPointerException -> dừng luôn CT
		
		System.out.println("------------------------------------\n");
		Item i4 = new Item(4,'B',44d);
		System.out.println("Item i4 --> " + i4);

	}
}
