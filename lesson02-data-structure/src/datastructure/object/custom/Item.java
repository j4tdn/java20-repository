package datastructure.object.custom;
/**
 * Khai bao, khoi tao ra kieu du lieu doi tuong --> Item 
 *
 * Thong tin can luu tru --> ma mat hang,ten mat hang, gia ban
 * 
 * --> Item: id, nam, salesPrice;
 */
public class Item {
	// Bien toan cuc
	// Thuoc tinh
	// Khi tao va gan gia tri cho bien kieu Item --> Gia tri cua bien do
	// Se gom 3 thong tin
	int id;
	char name;
	double salesPrice;
	public Item() {}
	public Item(int id, char name , double salesPrice) {
		//H3 --> this
		this.id= id;
		this.name= name;
		this.salesPrice= salesPrice;
	}
	
	
	@Override
	public String toString() {
		return "pid = "+ this.id+ ", name =" +this.name +", pSalesPrice = "+ this.salesPrice;
	}
}
 