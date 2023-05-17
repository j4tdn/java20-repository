package datastructure.object;

public class Item {
	// biến toàn cục --> global variabbles : biến dùng trong package
	// thuộc tính --> attributes
	// khi tạo và gán giá trị cho biến kiểu Item --> gán giá trị của biến đó
	// sẽ gồm 3 thông tin id, name, salesPrice
	int id;
	char name;
	double salesPrice;
	
	// default constructor : hàm khởi tạo mặc định
	// khoong có từ khóa static, không có kdl trả về
	// tên hàm trùng với tên class
	// 
	
	// Item i4 = new Item(4, 'B', 44d);
	 public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	 }
	 
	// ... int a
	// ... Item b
	@Override
	public String toString() {
		return "id = " + this.id + "\n name = " + this.name + "\nsalesPrice = " + this.salesPrice;
	}
}
