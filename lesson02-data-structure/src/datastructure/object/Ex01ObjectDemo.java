package datastructure.object;

public class Ex01ObjectDemo {
	public static void main(String[] args) {
		
		// mọi class có sẵn hay tự thêm đều mặc định là class con của class 'Object'
		// class 'Object' chứa 1 số hàm : hashcode --> hashing địa chỉ ở vùng nhớ HEAP
		//								  equals --> so sánh giá trị 2 đối tượng
		//								  toString --> tự động đc gọi khi in biens kdl đối tượng
		
		// khia báo và gán trá trị cho biến KDL nguyên thủy
		int digit;
		digit = 10;
		char letter = 'W';
		System.out.println("digit --> " + digit);
		System.out.println("letter --> " + letter);
		System.out.println("\n****************\n ");
		// khia báo và gán trá trị cho biến KDL đối tượng
		// new Item() --> gọi hàm khởi tạo (constructor) của class/kdl Item
		// --> khởi tạo 1 ô nhớ trên HEAP để lưu trữ giá trị của kdl Item
		Item i1 = new Item(1, 'M', 11d);
		// khi in biến kdl đối tượng --> tự động lấy biến đó gọi hàm 
		// toString từ class cha tên là OBject
		//i1.id = 1;
		//i1.name = 'M';
		//i1.salesPrice = 11d;
		System.out.println("i1 --> " + i1);
		System.out.println("item i1 toString --> " + i1.toString());
		System.out.println("item i1 --> " + i1.id + "\nname = " + i1.name + "\nsalesPrice" + i1.salesPrice);
		
		Item i2 = new Item(2, 'H',22d);
		//i2.id = 2;
		//i2.name = 'H';
		//i2.salesPrice = 22d;
		System.out.println("i2 --> " + i2);
		System.out.println("item i2 toString --> " + i2.toString());
		System.out.println("item i2 --> " + i2.id + "\nname = " + i2.name + "\nsalesPrice" + i2.salesPrice);
		
		
		//Item i4 = new Item();
		//i4.id = 2;
		//i4.name = 'H';
		//i4.salesPrice = 22d;
		Item i4 = new Item(4, 'B', 44d);
		System.out.println("i4 --> " + i4);
	}
}
