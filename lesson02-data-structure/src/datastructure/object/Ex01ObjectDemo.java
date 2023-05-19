package datastructure.object;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// Thực thi
		// Run    --> Ctrl F11 --> Chạy toàn bộ chương trình và chạy xong dừng lại
		// Debug  --> F11 --> Dùng để dừng lại chương trình tại 1 thời điểm bất kỳ để xem KQ tại đó
		//                --> step over --> nhảy qua dòng code mới
		//                --> ste into --> nhảy vào bên trong hàm
			
		
		// Mặc định
		// Khi in biến KDL nguyên thủy --> lấy giá trị của ô nhớ mà biến trỏ đến ở STACK để in ra
		// Khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ class cha tên là Object
				
		// Để gọi 1 biến(thuộc tính), hàm(phương thức) thuộc 1 class
		// C1 --> Khai báo thuộc tính, hàm đó là static --> Tên class . gọi biến, hàm đó
	    // C2 --> Khai báo thuộc tính, hàm đó là [non] static --> Tạo ra biến thuộc KDL class 
		//                                                    --> Lấy biến đó . gọi tt, pt của class
				
		// Mọi class có sẵn/tự thêm đều mặc định là class còn của class 'Object'
		// class 'Object' chứa 1 số hàm: hashcode --> hashing địa chỉ ở vùng nhớ HEAP
		//                               equals   --> so sánh giá trị 2 đối tượng
		//                               toString --> ... tự động được gọi khi in biến KDL đối tượng
				
		
		// Khai báo và gán giá trị cho biến KDL nguyên thủy
		int digit;
		digit = 10;
		char letter = 'W';
		System.out.println("digit --> " + digit);
		System.out.println("letter --> " + letter);
				
		System.out.println("\n***___ --- ___ ***\n");
		
				
		// Khai báo vào gán giá trị cho biến KDL đối tượng
		// new Item() --> gọi hàm khởi tạo(constructor) của class/kdl Item
		// --> khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của kdl Item
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("item i1 --> " + i1); // datastructure.object.Item@626b2d4a
		System.out.println("item i1 toString --> " + i1.toString()); // .toString String(return type) - Object(Type chứa hàm toString)
		System.out.println("item i1 info --> id = " + i1.id 
				+ ", name = " + i1.name
				+ ", salesPrice = " + i1.salesPrice);
				
		System.out.println("\n***___ --- ___ ***\n");
				
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		System.out.println("item i2 --> " + i2); // datastructure.object.Item@.....
		System.out.println("item i2 toString --> " + i2.toString()); // .toString String(return type) - Object(Type chứa hàm toString)
		System.out.println("item i2 info --> id = " + i2.id 
				+ ", name = " + i2.name
				+ ", salesPrice = " + i2.salesPrice);
				
		System.out.println("\n***___ --- ___ ***\n");
		
				
		// compile time --> typing code
		// runtime --> initial objects at heap memory
		Item i3 = null;
		System.out.println("item i3 --> " + i3); // null
		// System.out.println("item i3 toString --> " + i3.toString()); 
		// NPE --> JVM throws(ném) NullPointerException 
		//     --> ko tìm thấy vị trí trỏ đến tại vùng nhớ HEAP --> dừng luôn chương trình
				
		// Hiện tại --> các bước khi khai báo/khởi tạo biến thuộc KDL đối tượng
		// B1: Tạo biến gọi hàm khởi tạo mặc định --> tạo 1 vùng nhớ ở heap
		//     thuộc tính, của KDL đối tượng sẽ mang giá trị mặc định
		// B2: Lấy biến gọi . đến các thuộc tính để cập nhật giá trị
				
		// --> Có thể khởi tạo ô nhớ và gán giá trị cho thuộc tính cùng lúc
		// --> Tạo ra 1 hàm khởi tạo mới, nhận giá trị truyền vào cho các tt
				
		System.out.println("\n***___ --- ___ ***\n");
				
		Item i4 = new Item(4, 'B', 44d);
		// Item i4 = new Item();
		// i4.id = 4;
		// i4.name = 'B';
		// i4.salesPrice = 44d;
		System.out.println("item i4 --> " + i4);
		}
	
}