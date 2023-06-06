package datastructure.object.custom;

/**
 * Khai báo, khởi tạo ra kiểu dữ liệu đối tượng --> Item.
 * 
 * Thông tin cần lưu trữ --> mã mặt hàng, tên mặt hàng, giá bán
 * 
 * --> Item: id, name, salesPrice;
 */
public class Item {
	// Bien toan cuc --> global variables
	// thuoc tinhs --> attributes
	// khi tạo và gán giá trị cho biến kiểu Item --> giá trị của biến đó 
	// sẽ gồm 3 thông tin id, name, price.
	public int id;
	public char name;
	public double salesPrice;
	
	// default constructor --> hàm khởi tạo mặc định
	// không có từ khóa static, không có KDL trả về
	// tên hàm trùng với tên của class
	public Item() {
	}
	
	public Item(int id, char name, double salesPrice) {
		// H3 --> this
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	// i1.toString() --> this = i1
	// i2.toString() --> this = i2
	@Override
	public String toString() {	
		return "pid = " + this.id + ", pname = " + this.name + ",pSalesPrice = " + this.salesPrice;
	}
}
