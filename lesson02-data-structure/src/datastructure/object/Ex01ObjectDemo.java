package datastructure.object;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//thực thi
		// Run --> Ctrl F11 --> chạy toàn bộ chương trinhf và chạy xong dừng lại
		//Debug --> F11 --> DÙng để dừng lại chương trinhg tại 1 thời điểm bất kỳ để xem KQ tại đó
		//				--> Đặt breakpoint để dừng code tại vị trí đó
		//				--> step over --> nhảy qua dòng code mới
		//				--> step into --> nhảy vào bên trong hàm
		
		//mặc định
		//khi in biến KDL nguyên thủy --> lấy giá trị của ô nhờ mà biến trỏ đến ở STACK để in ra
		//khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm tótring từ class cha tên là Object
		
		//để gọi 1 biến (thuộc tính), hàm(phưong thức) thuộc 1 class
		//C1--> Khai báo biến hàm đó là static --> tên class. gọi biến,hàm đó
		//C2--> khai báo thuộc tính, hàm đó là [non] static --> tạo ra biến thuộc KDL class, lấy biến đó . gọi tt, pt của class
		
		//mọi class có sẵn/ tự thêm đều mặc định là class con của class 'Object'
		//class 'Object' chứa 1 số hàm: hashcode --? hashing địa chỉ ở vùng nhớ HEAP
		//								equals --> so sánh giá trị 2 đối tượng
		//								toString --> ,, tự đôgj được gọi khi in biến KDL đối tượng
		
		//Khai báo và gán giá trị cho biến KDL nguyên thủy
		int digit = 10;
		char letter ='W';
		System.out.println("digit --> " + digit);
		
		//Khai báo và gán trị cho biến KDL đối tượng
		//new item() --> gọi hàm khởi tạo(constructor) của class/kdl Item
		//--> khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của kdl Item
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("item --> " + i1);
		System.out.println("item i1 toString --> " + i1.toString());
		System.out.println("item i1 info --> id = " + i1.id + ", name " + i1.name + ", salesPrice " +i1.salesPrice );
		
		System.out.println("--------------------------");
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		System.out.println("item --> " + i2);
		System.out.println("item i1 toString --> " + i2.toString());
		System.out.println("item i1 info --> id = " + i2.id + ", name " + i2.name + ", salesPrice " +i2.salesPrice );
		
		Item i3=null;
		System.out.println("item i3 --> " +i3);
		//System.out.println("item i3 toString " + i3.toString());
		//NPE --> JVM throws() NullPointerException
		//    --> k tim thay vi tri tro den tai vung nho HEAP --> dung luon chuong trinh
		
		Item i4 = new Item(4, 'B', 44d);
		System.out.println("item --> " + i4);
	}
}
