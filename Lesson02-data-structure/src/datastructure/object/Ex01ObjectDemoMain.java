package datastructure.object;

public class Ex01ObjectDemoMain {
	public static void main(String[] args) {
		//mặc định 
		// khi in biến KDL nguyên thủy --> lấy giá trị ở ô nhớ STACK để in ra
		//khi in biến KDL Đối tượng --> tư động lấy biến đó gọi hàm toString từ Class cha tên là Object
		
		//để gọi biến(thuộc tính), hàm (phương thức) thuộc 1 class
		// c1: khai báo biến hàm đó là static --> Tên Class. gọi biến, hàm đó
		// c2: khai báo thuộc tính, hàm đó là [non] static --> tạo ra biến thuộc KDL Class
														// --> lấy biến đó . gọi tt, pt của Class		
		
		// mọi class có sẵn/ tự thêm đều mặc định là class con của class 'object'
		//class object : chứa 1 số hàm: hashcode --> hashing địa chỉ ở vùng nhớ HEAP
		//								equals --> so sánh giá trị 2 đối tượng
		//								toString --> tự động được gọi khi in biến KDL Đối tượng
		
		// khai báo và gán giá trị cho biến KDL nguyên thủy
		int digit = 10;
		char letter = 'A';
		
		// khai báo và gán giá trị cho KDL Đối Tượng
		//new Item() --> gọi hàm khởi tạo constructure của class/KDL Item
		//--> khởi tạo 1 ô nhớ trên HEAP để lưu giá trị của KDL Item
		Item itemA = new Item();
		itemA.id = 1;
		itemA.name = 'X';
		itemA.salesPrice = 11000d;
		System.out.println("Item--> " + itemA);	
		System.out.println("Item--> " + itemA.toString());//.toString String (return type ) object(type chứa hàm toString);	
		System.out.println("itemA info --> id = " + itemA.id + "," 
										   + "name = " + itemA.name + ","  
										   + " salesPrice = " + itemA.salesPrice);
		
		Item itemB = new Item();
		itemB.id = 2;
		itemB.name = 'H';
		
		System.out.println("itemA info --> id = " + itemB.id + "," 
										   + "name = " + itemB.name + ","  
										   + " salesPrice = " + itemB.salesPrice);
		
		//compile time -> typing code
		//runtime --> initial objects at heap memory
		
		Item itemC = null;
		System.out.println("itemC: " + itemC);
		//System.out.println("itemC: " + itemC.toString());//NPE --> JVM throws NullPointerException -->
														// ko tìm thấy vị trí trỏ đến tại vùng nhớ Heap
		//hiện tại --> các bước khi khai báo/ khởi tạo biến thuộc KDL đối tượng
		//b1: tạo biến gọi hàm khởi tạo mặc định --> tạo 1 vùng nhớ ở Heap
		//    thuộc tính, của KDL đối tượng sẽ mang giá trị mặc định
		// b2: lấy biến gọi . đến các thuộc tính để cập nhật giá trị 
		
		// --> có thể khởi tạo ô nhớ và gán giá trị cho thuộc tính cùng lúc 
		// --> tạo ra 1 hàm khởi tạo mới nhận giá trị truyền vào cho các thuộc tính
		
		Item itemD = new Item(4, 'D', 44d);
		System.out.println("ItemD--> " + itemD);	
	}
}
