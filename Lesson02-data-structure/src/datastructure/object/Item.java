package datastructure.object;
/**
 * khai báo, khởi tạo ra 1 kiểu dữ liệu Đối Tượng --> Item
 * 
 * thông tin cần lưu trữ --> mã mặt hàng, tên mặt hàng, giá bán
 * 
 * -->Item:id, name, salesPrice;
 */
public class Item {
	//biến toàn cục --> globle variables
	//thuộc tính --> attributes
	// khi tạo và gán giá trị cho biến kiểu Item --> giá trị của biến đó
	// sẽ gồm 3 thông tin Id, name, salesPrice
	int id;
	char name;
	double salesPrice;
	
	//defaut constructure--> hàm khởi tạo mặc định 
	//không có từ khóa Static, không có KDL trả về
	//tên hàm trùng với tên class
	public Item() {
		
	}
	
	public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	
	@Override
	public String toString() {
		return "pid =" + this.id
				+", pname = " + this.name 
				+", psalesPrice = " + this.salesPrice;
	}
}
