package datastructure.object.custom;
/**
 * Khai báo, khởi tạo ra kiểu dữ liệu đối tượng mặt hàng
 * 
 * Thông tin cần lưu trữ --> mã mặt hàng, tên mặt hàng, giá bán
 * 
 * --> Item: id, name, salesPrice
 */
public class Item {
	// biến toàn cục --> global variables
	// thuộc tính --> attributes
	// Khi khỏi tạo và gán giá trị cho biến kiểu Otem -->giá trịvủa biến đó
	// sẽ gồm 3 thông tin id, name, salesPrice
	int id;
	char name;
	double salesPrice;
	
	// default constructor --> hàm khởi tạo mặc định
	// không có từ khóa static, không có kiểu dữ liệu trả về(mặc định trả về kdl của class chứa nó)
	// tên hàm trùng với tên của class
	public Item() {}
	
	public Item(int id, char name, double price) {
		this.id = id;
		this.name = name;
		this.salesPrice = price;
	}
	
	// i1.toString()
	// i2.toString()
	
	@Override
	public String toString() {
		return "pid = " + this.id + ", pName = " + this.name + ", pSalesPrice = " + this.salesPrice;
	}
}
