package datastructure.object.custom;

/**
 *	Khai báo, khởi tạo một kiểu dữ liệu đối tượng Mặt hàng --> Item
 *	Thông tin cần lưu trữ --> Mã mặt hàng, tên mặt hàng, giá bán
 *	-->Item:id, name, salesPrice
 */
public class Item {
	
	//Thực thi: Run --> Chạy toàn bộ chương trình và chạy xong dừng lại
	//			Debug --> Dừng chương trình tại 1 thời điểm bất kỳ xem KQ tại đó
	//				  --> Đặt breakpoint để dừng code tại vị trí đó
	//				  --> Step infor nhảy 
	
	//biến toàn cục --> global variables
	//thuộc tính --> attributes
	//khi tạo và gán giá trị cho 1 biến kiểu Item thì giá trị của biến gồm 3 thông tin
	//id, name, salesPrice
	public int id;
	public char name;
	public double salesPrice;
	
	//default constructor --> Hàm khởi tạo mặc định
	//Không có từ khóa static, kiểu dữ liệu trả về (mặc định kdl của class chứa nó)
	//Tên hàm trùng với class
	public Item() {}
	
	public Item(int id, char name, double salesPrice) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "id: "+this.id+", name: "+this.name+", salesPrice: "+this.salesPrice;
	}
}
