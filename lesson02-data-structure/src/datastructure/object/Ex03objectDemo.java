package datastructure.object;

public class Ex03objectDemo {
	public static void main(String[] args) {
		// thực thi
		// run --> chạy toàn bộ chương trình và chạy xong dừng lại
		// Debug --> f11 --> dùng để dừng lại chương trình tại 1 thời điểm bất kỳ để xem KQ tại đó
		//				 --> đặt breakpoint để dùng code tại vị trí đó
		//				 --> step over --> nhảy vào dòng code mới
		//				 --> step into --> nhảy vào bên trong hàm
		
		// mặc đinh
		// khi in biến KDL nguyên thử --> lấy giá trị của ô nhớ mà biến trỏ đến ở STACK để in ra
		// khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ class cha tên là Object
		
		// để gọi 1 biến(thuộc tính), hàm(phương thích) thuộc 1 class
		// c1: khai báo thuộc tính, hàm đó là static --> tên class . gọi biến, hàm số
		// c2: khai báo thuộc tính, hàm đó là [non] statuc --> tạo ra biến thuộc KDL class 
		//												   --> lấy biến đó . gọi thuộc tính, phương thức của class
		
		// mọi class có sẵn hoặc tự thêm đều mặc định là class con của class Object
		// class Object chứa 1 số hàm hashcode -->hasshing địa chỉ ở vùng nhớ HEAP
		// 							  equals --> so sách giá trị 2 đối tượng
		//							  toString --> tự động được gọi khi in biến KDL đối tượng
		
		// khai báo và gán giá trị cho biến KDL nguyên thủy
		int digit = 10;
		char letter = 'W';
		System.out.println("digit -->" + digit);
		System.out.println("letter -->" + letter);
		// khai báo và gán giá trị cho biến KDL đối tượng
		// new Item() --> gọi hàm khởi tạo(constructor) của class/KDL Item
		// --> khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của KDL Item
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("item i1 -->" + i1);
		System.out.println("item i1 soString -->" + i1.toString());
		System.out.println("item i1 --> id = " + i1.id + ", name = " + i1.name + ", salesPrice = " + i1.salesPrice);
		
		System.out.println("\n***__---__***\n");
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		System.out.println("item i2 -->" + i2);
		System.out.println("item i2 soString -->" + i2.toString());
		System.out.println("item i2 --> id = " + i2.id + ", name = " + i2.name + ", salesPrice = " + i2.salesPrice);
		
		System.out.println("\n***__---__***\n");
		
		Item i3 = null;
		System.out.println("item i3 -->" + i3);
		//System.out.println("item i3.toString --> " + i3.toString());
		// NPE --> JVM throws(ném) NullPointerException
		// --> không tìm thấy vị trí trỏ đến tại vùng nhớ HEAP --> dừng luôn chương trình
		
		// hiện tại --> các bước khi khai báo/ khởi tạo biến thuộc KDL đối tượng
		// b1: tạo biến gọi hàm khởi tạo mặc định --> tạo 1 vùng nhớ ở HEAP
		//	thuộc tính, của KDL đối tượng sẽ mang giá trị mặc định
		
System.out.println("\n***__---__***\n");
		

		Item i4 = new Item(4 , 'B', 44d);
//		i2.id = 2;
//		i2.name = 'H';
//		i2.salesPrice = 22d;
		System.out.println("item i4 -->" + i4);
		
		}
}
