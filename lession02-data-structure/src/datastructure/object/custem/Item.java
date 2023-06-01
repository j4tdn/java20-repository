package datastructure.object.custem;

//cmt cho class /**
/**
 * 
 * khai báo, khởi tạo ra kiểu dữ liệu đối tượng mặt hàng --> Item Thông tin lưu
 * trữ --> mã mặt hangd, tên mặt hàng, giá bán
 * 
 * --> tạo class Item: id, name, salesPrice;
 */
public class Item {
	// biến toàn cục --> Global variables
	// thuộc tính --> attributes
	// kho khởi tạo và gán giá trị cho biến kiểu Item --> giá trị biến đó sẽ gốm
	// 3 thông tin id,name,price
	int id;
	char name;
	double salesPrice;

//public Item(int id, char name, double salesPrice) : giá trị truyền vào(tên biến nhận tham số)
	public Item(int id, char name, double salesPrice) {
		this.id = id; // gán giá trị vào
		this.name = name;
		this.salesPrice = salesPrice;
	}
//Bôi đen chữ cần sửa -->Alt +Shift+R: 

	// default constructor -->hàm khởi tạo mặc định
	// tên hàm bth viết thường
	// tên hàm khởi tạo mặc định trùng với tên class
	// k có từ khóa static, ko có KDL trả về
	@Override
	public String toString() {
		return "id = " + id + ", " + "pname = " + name + ", " + "Price = " + salesPrice;
	}

	public Item() {
	}
}
