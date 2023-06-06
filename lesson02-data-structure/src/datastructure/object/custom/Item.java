package datastructure.object.custom;

/**
 * khai báo, khởi tạo ra một kiểu dữ liệu đối tượng mặt hàng-->Item
 * thông tin cần lưu trữ --> Mã mặt hàng, tên mặt hàng, giá bán
 * --> Item: id, name, salesPrice; 
 *
 */
public class Item {
	//biến toàn cục --> globar variables
	//thuộc tính --> attributes
	//khi tạo và gán giá trị chi biến kiểu Item --> giá trị của biến đó sẽ gồm 3 thông tin id, name, salesPrice
	public int id;
	public char name;
	public double salesPrice;
	//default constructor --> hàm khởi tạo mặc định
	//không có từ khóa static, không có KDL trả về(mặc định trả về KDL của class chứa nó)
	//têm hàm trùng với tên của class
	public Item() {
		
	}
	public Item(int id, char name, double salesPrice ) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	@Override
	public String toString() {
		return "pid = " + this.id + ", pname = " + this.name + ", psalesPrice = " + this.salesPrice;
	}
}
