package datastructure.object;

/**
 * Khai báo, khởi tạo ra kdl đối tượng Item Thông tin cần lưu trữ: mã mặt hàng,
 * tên mặt hàng, giá bán Item: id, name, salesPrice
 */
public class Item {
	int id;
	char name;
	double salesPrice;

	public Item() {
	}

	public Item(int pId, char pName, double pSalesPrice) {
		id = pId;
		name = pName;
		salesPrice = pSalesPrice;
	}

	@Override
	public String toString() {
		return "pid = " + this.id + ", pname = " + this.name + ", psalesPrice = " + this.salesPrice;
	}
}
