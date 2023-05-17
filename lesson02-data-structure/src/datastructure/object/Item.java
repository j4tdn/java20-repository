package datastructure.object;

/**
 * Khai báo, khởi tạo ra một kiểu dữ kiệu đối tượng --> Item (Mặt hàng)
 * 
 * Thông tin cần lưu trữ --> Mã mặt hàng, tên mặt hàng, giá bán
 * 
 * --> Item: id, name, salesPrice
 */
public class Item {

	// Biến toàn cục --> global variables
	// Thuộc tính --> Attributes
	// Khi tạo và gán giá trị cho biến kiểu Item --> gián trị của biến đó
	// Sẽ gồm 3 thông tin id,name ,salesPrice
	int id;
	char name;
	double salesPrice;

	// Không có kdl trả về(mặc định trả về kdl của class chứa nó)

	public Item() {

	}
	
	public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	@Override
	public String toString() {
		return "pid = " + this.id + " , pname = " + this.name + " , pSalesPrice = " + this.salesPrice;
	}

}