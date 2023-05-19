package datastructure.object;

//Mọi class có sẵn/ tự thêm đều mặc định là class con của class 'Object'
//Class ở 'Object' chứa 1 số hàm: hashcode --> hasing địa chỉ ở vùng nhớ HEAP
//       						  equals   --> so sánh giá trị 2 đối tượng
//								  toString   --> 
public class Ex01ObjectDemo {
	public static void main(String[] args) {
		//Khai báo và gán giá trị cho biến kiểu dữ liệu nguyên thủy
		//Khi in biến KDL nguyên thủy --> lấy giá trị của ô nhớ mà biến trỏ đến ở stack để in ra
		//
		int digit=10;
		char letter='W';
		
		
		//Khai báo và gán giá trị cho biến kiểu dữ liệu đối tượng
		//new Item() --> gọi hàm khởi tạo (constructor) của class/KDL Item
		//Tạo 1 ô nhớ HEAP để lưu trữ dữ liệu
		//Ctrl + nhấn vào hàm --> chuyển sang hàm đc tạo
		
		//Để gọi 1 biến(thuộc tính), hàm(phương thức) thuộc 1 class
		//C1: Khai báo biến hàm đó là static --> tên class.gọi biến, hàm đó
		//C2: Khai báo thuộc tính, hàm đó là [non] static --> Tạo ra biến thuộc KDL class --> Lấy biến đó.gọi phương thức, thuộc tính
		
		Item i1 = new Item();
		i1.id=1;
		i1.name='M';
		i1.salesPrice=100;
		//Khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ class cha tên là Object
		System.out.println("item --> "+i1);
		System.out.println("item toString--> "+i1.toString());
		System.out.println("item i1 infor --> id="+i1.id+", name="+i1.name+", salesPrice="+i1.salesPrice);
		
		Item i2 = new Item();
		i2.id=2;
		i2.name='N';
		i2.salesPrice=200;
		System.out.println("\nitem --> "+i2);
		System.out.println("item i2 toString--> "+i2.toString());
		System.out.println("item i2 infor --> id="+i2.id+", name="+i2.name+", salesPrice="+i2.salesPrice);
		
		Item i3 = null;
		System.out.println("\nitem --> "+i3);
		//System.out.println("item i2 toString--> "+i3.toString()); //NPE --> JVM throws null NullPointerException
																	//Không tìm thấy vị trí trỏ đến tại vùng nhớ HEAP --> Dừng luôn chương trình
		//chuột phải vào biến --> Refactor --> Rename
		Item i4=new Item(4, 'B', 44d);
		System.out.println("\nitem i4--> "+i4.toString());
	}
}
