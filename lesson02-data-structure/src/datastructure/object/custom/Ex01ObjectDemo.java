package datastructure.object.custom;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		// thực thi
		// run --> ctrl f11 --> chạy toàn bộ quá trình và chạy xog dừng lại
		// debug --> f11 --> dùng dể dừng lại ctr tại 1 thời điểm bki để xem kq ở đó
		// 				 --> dùng breakpoint để dùng code tại đó
		// 				 --> step over --> nhảy qua dòng code mới
		//				 --> step into --> nhảy vào bên trong hàm
		
		// mặc định 
		// khi in biến dkl primitive --> lấy ô nhớ biến trỏ stack in ra
		// khi in biến dkl object --> lấy biến đó gọi hàm toString từ class cha object 
		
		// C1 để gọi 1 attributes/method thuộc 1 class sẽ khai báo biến/hàm là static
		// C2 khai báo thuộc tính, hàm đó là [non]static -->tạo ra biến KDL class
		//												 --> lấy biến đó . gọi tt,pt class
		
		
		// mọi class có sẵn/tự thêm đều mặc định là class con của class "Object"
		// class 'object' chứa 1 số hàm: hashCode --> hashing địa chỉ ở vùng HEAP
		//								 equals   --> so sánh giá trị 2 object
		//								 toString --> tự động gọi khi in biến KDL object
		
		// khai báo và gán giá trị cho biến KDL primitive
		int digit = 10;
		char letter = 'w';
		System.out.println(digit);
		System.out.println(letter);
		System.out.println("=========");
		
		// khai báo và gán cho KDL object
		// new Item() --> gọi hàm khởi tạo (constructor) của class/KDL item
		// --> khởi tạo 1 ô nhớ trên HEAP để lưu gtri của DKL Item
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'M';
		i1.salesPrice = 11d;
		System.out.println("item --> " + i1);
		System.out.println("item i1 toString --> " + i1.toString());
		System.out.println("item i1 info --> id = " + i1.id 
				+ ", name = " + i1.name 
				+ ", salesPrice = " + i1.salesPrice);
		
		System.out.println("====================");
		
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'H';
		i2.salesPrice = 22d;
		
		System.out.println("item --> " + i2);
		System.out.println("item i2 toString --> " + i2.toString());
		System.out.println("item i2 info --> id = " + i2.id 
				+ ", name = " + i2.name 
				+ ", salesPrice = " + i2.salesPrice);
	
		Item i3 = null;
		//System.out.println("item i3 --> " + i3);
		//System.out.println("item i3 toString --> " + i3.toString());
		// NPE --> JVM throws NullPointerException
		// 	   --> ko tìm thấy vị trí trỏ đến tại vùng nhớ HEAP --> dừng ctr
		
		Item i4 = new Item(4, 'B', 44d);
		System.out.println("item i4 --> " + i4);
	}
}
