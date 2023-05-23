package datastructure.object;

/**
 * Khai báo, khởi tạo ra 1 Kiểu Dữ Liệu Đối Tượng --> Item 
 * 
 *  Thông tin cần lưu trữ --> Mã mặt hàng, tên mặt hàng, giá bán
 *  
 *   --> Item: ID, name, salesPrice;
 */
public class Item {
	
	// biến toàn cục (Gloval variables)
	// thuộc tính (Attibutes)
	// khi tạo và gán giá trị cho biến kiểu Item --> giá trị của biến đó 
	// sẽ gồm 3 thông tin là: id, name, salesPrice
	int id;
	char name;
	double salesPrice;
	
	// default constructor --> hàm khởi tạo mặc định
	// không có từ khoá static, không có KDL trả về
	// tên hàm trùng với tên của class
	public Item() {
	}
	
	
	public Item(int id, char name, double salesPrice ) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		
	}
	// i1.toString() --> this = i1
	// i2.toString() --> this = i2
	
	@Override
	public String toString() {
		return "pid = " + this.id + ", pname = " + this.name + ", pSalesPrice = " + this.salesPrice;
	}
	
}
