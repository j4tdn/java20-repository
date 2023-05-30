package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		
		//thực thi
		//Run --> ctrl F11 --> chạy toàn bộ chương trình và chạy xong dừng lại
		//Debug --> F11 --> dừng lại chương trình taij 1 thời điểm bất kì để xem KQ tại đó
		//              --> đặt breakpoint để dùng code tại vị trí đó
		//              --> step over
		
		//mặc định
		//khi in 1 biến KDL nguyên thuỷ --> lấy giá trị của ô nhớ mà biến trỏ đến ở STACK để in ra
		//khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ classs cha tên là Object
		
		//để gọi 1 biến(thuộc tính), hàm(phương thức) thuộc 1 class
		//c1 --> khai báo thuộc tính, hàm đó là static --> tên class . gọi biến, hàm đó
		//c2 --> khai báo thuộc tính, hàm đó là [non]static --> tạo ra biến thuộc KDL class
		//                          --> lấy biến đó . gọi thuộc tính, phương thức của class
		
		//mọi class có sẵn/ tự thêm đều mặc định là class còn của class 'Object'
		//class 'Object' chứa 1 số hàm: hashcode --> hashing địa chỉ vùng nhớ HEAP
		//                            : equals --> so sánh giá trị 2 đối tượng
		//                            : toString --> ... tự động được gọi khi in biến KDL đối tượng
		
		//khai báo và gán giá trị cho biến KDL nguyên thuỷ
		int digit = 10;
		char letter = 'W';
		System.out.println("digit --> " + digit);
		
		//khai báo vào gán giá trị cho biến KDL đối tượng
		// new Item() --> gọi hàm khởi tạo(cóntructor) của class/kdl Item
		//--> khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của kdl Item
		Item i1 = new Item() ;
		i1.id = 1;
		i1.name = 'A';
		i1.salesPrice = 100;
		System.out.println("item --> " + i1);
		System.out.println("item i1 toString --> " + i1.toString()); //.toString String(return type) - Object(type chứa hàm toString)
		System.out.println("item info --> id = " + i1.id + ", name " + i1.name + ", salesPrice = " + i1.salesPrice );
		

		System.out.println("---------------------------");
		
		
		Item i2 = new Item() ;
		i2.id = 2;
		i2.name = 'B';
		i2.salesPrice = 200;
		System.out.println("item --> " + i2);
		System.out.println("item i2 toString --> " + i2.toString()); //.toString String(return type) - Object(type chứa hàm toString)
		System.out.println("item info --> id = " + i2.id + ", name " + i2.name + ", salesPrice = " + i2.salesPrice );
		
//		Item i3 = null;
//		System.out.println("item i3 --> " + i3); // null
//		System.out.println("item i3 --> " + i3.toString()); 
		//NPE throws - NullPointerException
	    //--> không tìm thấy vị trí trỏ đến tại vùng nhớ HEAP --> dừng luôn ctrinh
		
		//hiện tại --> các bước khai báo/khởi tạo biến thuộc KDL đối tượng
		//B1: tạo biến gọi hàm khởi tạo mặc định --> tạo 1 vùng nhớ ở HEAP
		//    thuộc tính, của KDL đối tượng sẽ mang giá trị mặc định
		//B2: lấy biến gọi . đến các thuộc tính để cập nhật giá trị
		
		//--> có thể khởi tạo ô nhớ và gán giá trị cho thuộc tính cùng lúc
		//--> tạo ra 1 hàm khởi tạo mới, nhận giá trị truyền vào cho các thuộc tính.
		
		//Item i4 = new Item(4, 'D', 400);
		System.out.println("--------------------");
		Item i4 = new Item(4, 'D', 400);
		System.out.println("item i4 --> " + i4);
	
		
	}

}
