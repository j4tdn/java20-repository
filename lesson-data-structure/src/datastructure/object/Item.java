package datastructure.object;
/*
 * khai bao, khoi tao ta du lieu doi tuong mat hang
 * 
 * Thong tin can luu tru --> ma mat hang, ten mat hang, gia ban
 * 
 * -> item : id, name, salesPrice;
 */
public class Item {
	
	// bien toan cuc --> global varibles
	// nhung thong tin nay goi la thuoc tinh --> attributes
	// khi tao va gan gia tri cho bien cho KDL Item --> gia tri bien do
	//     se gom 3 thong tin id, name, salesPrice
   public int id;
   char name;
   double salesPrice;
   
   //--. hàm khởi tạo mặc định
   // không có từ khóa static, không có KDL trả về
   // tên hàm trùng với tên class
   public Item() {
	   
   }
   
   public Item(int id, char name, double salesPrice) {
	   this.id = id;
	   this.name = name;
	   this.salesPrice = salesPrice;
	   
   }
   // ... int  a 
   // ... Item b
   
   @Override
public String toString() {
	return "pid = " + this.id + ", pname = "+ this.name + ", psalesPrice = " + this.salesPrice;
}
}
