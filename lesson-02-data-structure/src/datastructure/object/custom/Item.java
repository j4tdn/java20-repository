package datastructure.object.custom;

/**
 * khai báo, khởi tạo ra kiểu dữ liệu đối tượng mặt hàng --> Item
 * 
 * Thông tin cần lưu trữ --> mã mặt hàng, tên mặt hàng, giá bán
 * 
 * --> Item: id, name, salesPrice;
 *
 */

	public class Item {
	
	//biến toàn cục --> global variables
	//thuộc tính --> attributes
	//khi tạo và gán giá trị cho biến kiểu Item --> giá trị của biến đó
	//sẽ bao gồm 3 thông tin id, name, salesPrice
	public int id;
	public char name;
	public double salesPrice;
	
	//default constructor --> hàm khởi tạo mặc định
	//không có từ khoá static, không có kiểu dữ liệu trả về KDL của classs chứa nó)
	//tên hàm trùng với tên class
	
	public Item() {
	}
	
	public Item(int id, char name, float salesPrice) {
		
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		
	}
	
	//...int a
	//...Item b
	
	//i1.toString()
	//i2.toString()
	
	
	@Override
	public String toString() {
		return "pid = " + this.id + ", pname = " + this.id + ", pSalesPrice = " + this.salesPrice;
	}

}
