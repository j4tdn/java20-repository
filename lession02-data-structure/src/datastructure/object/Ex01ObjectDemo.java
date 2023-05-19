package datastructure.object;

public class Ex01ObjectDemo {

	// debug -->F11 --> dừng lại chương trình tại 1 thời điểm bất kì để xem kq tại
	// đó
	public static void main(String[] args) {
		// MẶC ĐỊNH
		// Kho in biến KDL nguyên thủy -->lấy giá trị của ô nhớ mà biến trỏ đến ở Stack
		// để in ra
		// Khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ class
		// cha tên là Object
		// --> đặt breakpoint để dừng code tại vị trí đó
		// --> step over --> nhảy qua dòng code mới
		// --> step into --> nhảy vào bên trong hàm
		// Để gọi 1 biến (thuộc tính) ,hàm(phương thức) thuộc 1 class
		// C1: Khai báo biến hàm đó là static -->Tên class.tên biến,hàm đó
		// C2:

		// Mọi class có sẵn hay tự thêm đều mặc định là class con của class "Object"
		// class 'Object' chứa 1 số hàm: hashcode --> hashing địa chỉ vùng nhớ Heap
		// equals --> so sánh giá trị 2 đối tượng
		// toStrong --> tự động được gọi khi in biến KDL đối tượng
		// khai báo và gán giá trị cho biến nguyên thủy
		int digit = 10;
		char letter = 'W';

		// Khai báo và gán giá trị cho biến KDL đối tượng
		// new Item() --> gọi hàm khởi tạo (contructor) của class/ kdl Item
		// --> Khởi tạo 1 ô nhớ trên Heap để lưu giá trị của KDL Item(mặc đinh LD; trả
		// về )
		Item i1 = new Item();
		i1.id = 1;
		i1.name = 'N';
		i1.salesPrice = 11d;

		// cần khởi tạo
		System.out.println("i1 --> " + i1);
		System.out.println("Item i1 toString  --> " + i1.toString());
		System.out.println(
				"Item i1 info  --> id = " + i1.id + ", " + "name = " + i1.name + " ," + "Price = " + i1.salesPrice);

		System.out.println("\n");
		Item i2 = new Item();
		i2.id = 2;
		i2.name = 'T';
		i2.salesPrice = 22d;

		// cần khởi tạo
		System.out.println("i2 --> " + i2);
		System.out.println("Item i2 toString  --> " + i2.toString());
		System.out.println(
				"Item i2 info  --> id = " + i2.id + ", " + "name = " + i2.name + " ," + "Price = " + i2.salesPrice);

		// compile time --> typing code
		// runtime --> initial object
		Item i3 = null;
		System.out.println("Item i3 --> " + i3);
		// System.out.println("Item i3 --> " +i3.toString());
		// NPE --> JVM throws NullPointerException
		// --> khoong tìm thấy vị trí trỏ đến taij vùng nhớ HEAP --> dừng luôn chương
		// trình

		System.out.println("HELLO");
		Item i4 = new Item(4, 'R', 40d);
		System.out.println("\nItem i4 --> " + i4);

	}
}
