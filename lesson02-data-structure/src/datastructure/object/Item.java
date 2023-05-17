package datastructure.object;

/**
 khai báo, khởi tạo ra kiểu dữ liệu đối tượng mặt hàng tên là Item
 thông tin cần lưu trữ: mã mặt hàng, tên mặt hàng, giá bán
 
 class--> id, name, salesPrice
 */
public class Item {

	// biến toàn cục --> global variables
	// thuộc tính --> attributes
	// khi tạo và gán giá trị cho biến kiểu Item --> giá trị của biến đó sẽ gồm 3 thông tin
	
	int id;
	char name;
	double salesPrice;
	
	//default constructor --> hàm khởi tạo mặc định
	// không có từ khóa static, không có kiểu dữ liệu trả về (mặc định trả về KDL của class chứa nó)
	// tên hàm phải trùng với tên class
	public Item() {
		public Item(int id, char name, double salesPrice) {
			this.id = id;
			this.name = name;
			this.salesPrice = salesPrice;
		}
	}
	@Override
	public String toString() {
		return "pid = " + this.id + ", pname = " + this.name +", pSalesPrice = " + this.salesPrice;
		
		
		// --> int a
		// --> item b
	}
}

	

	