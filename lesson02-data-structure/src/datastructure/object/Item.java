package datastructure.object;

/**
 * Khai báo, khởi tạo ra Kiểu Dữ Liệu Đối Tượng Mặt Hàng
 * 
 * Thông tin cần lưu trữ --> mã mặt hàng, tên mặt hàng, giá bán
 * 
 * --> Item: id, name, salesPrice;
 *
 */
public class Item {
	
	// biến toàn cục --> global variables
	// thuộc tính --> attributes
	// khi tạo và gán giá trị cho biến kiểu Item --> giá trị của biến đó
	// sẽ gồm 3 thông tin id, name, salesPrice	
	int id;
	char name;
	double salesPrice;
	
	
	// default constructor --> hàm khởi tạo mặc định
	// không có từ khóa static, không có KDL trả về(mặc định trả về KDL của class chứa nó)
	// tên hàm trùng với tên của class
	public Item() {
		
	}
		
	// Item i4 = new Item(4, 'B', 44d);
	public Item(int id, char name, double salesPrice) {
		// H3 --> this
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
		
	// ... int   a
	// ... Item  b
		
	// i1.toString() --> this = i1
	// i2.toString() --> this = i2
	@Override
	public String toString() {
		return "pid = " + this.id + ", pname = " + this.name + ", pSalesPrice = " + this.salesPrice;
	}
	
}
