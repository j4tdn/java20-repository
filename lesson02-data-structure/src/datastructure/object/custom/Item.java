package datastructure.object.custom;
/**
 * 
 * Khai báo , khởi tạo ra 1 kiểu dữ liệu đối tượng Mặt Hàng -->Item
 * Thông tin cần lưu trữ --> mã mặt hàng , tên mặt hàng, giá bán
 * --> Item: id, name, salePrice;
 */
public class Item {
	//biến toàn cục -->global variable
	//thuộc tính -->attributes
	//khi khởi tạo và gán giá trị cho 1 biến kiểu Item --> Giá trị của biến đó
	//sẽ gồm 3 thông tin id,name,salePrice
	 public int id;
	public char name;
	public double salePrice;
	
	public Item(int id , char name, double salePrice) {
		this.id=id;
		this.name=name;
		this.salePrice=salePrice;
	}
	// 1 class sẽ tự khởi tạo 1 defaut constructor --> hàm khởi tạo mặc định
	//không có từ khóa statcic , không có KDL trả về(mặc định trả về KDL của class chứa nó)
	//tên hàm trùng với tên của class
	//i1.toString();
	@Override
	public String toString() {
		return "id = "+ this.id +", name =" + this.name + ", salePrice =" +this.salePrice ;
	}
	
}
