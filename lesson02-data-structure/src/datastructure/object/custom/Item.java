package datastructure.object.custom;

/**
 * khai báo, khởi tạo ra kiểu dữ liệu đối tượng mặt hàng --> Item
 * 
 * Thông tin cần lưu trữ --> mã, tên, giá --> Item: id, name, salesPrice
 * 
 */
public class Item {
	// global variables
	// thuộc tính --> attributes
	// khi tạo và gán giá trị cho biến kiểu Item --> giá trị của biến đó 
	// gồm 3 thông tin id name salesPrice
	int id;
	char name;
	double salesPrice;
	
	// default constructor
	// k có từ khóa static, kdl trả về (mặc định trả về kdl của class chứa nó)
	// tên hàm trùng tên class
	public Item() {
	}
	
	public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	@Override
	public String toString() {
		return "id = " + this.id + ", name = " + this.name + ", salesPrice = " + this.salesPrice;
	}
}
