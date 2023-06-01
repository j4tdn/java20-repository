package datastructure.custom;

public class Ex01ObjectDemo {
     public static void main(String[] args) {
    	 // thực thi
    	 // run --> ctrl f11 --> chạy toàn bộ chương trình và chạy xong thì dừng lại
    	 // debug --> f11 --> dùng để dừng lại chường trình tại 1 thời điểm bất kì để xem KQ tại đó
    	 //               --> đặt cái breakpoint để dừng code tại vị trí đó
    	 //               --> step over --> nhảy qua dòng code mới
    	 //               --> step into --. nhảy vào bên trong hàm
    	 // mặc định
    	 // khi in KDL nguyên thủy --> lấy giá trị ô nhớ mà biến trỏ đến STRCK để in ra
    	 // Khi in biến KDL đối tượng --> tự động lấy biến đó gọi hàm toString từ class cha tên là Objicet
		
    	 // Để gọi 1 biếnhay thuộc tính, hàm hoặc phương thức thuộc 1 class
    	 // c1 : Khai báo biến/ hàm đó là static --> tên class . gọi biến hàm đó
    	 // c2 : Khai báo thuộc tính, hàm đó là [non] static --> Taoh ra biến KDL  class
    	 //                                                 --> lấy biến đó . gọi tt, pt của class
    	 
    	 // Mọi class có sẵn hay tự thêm đều mặc định là class con của class Object
    	 //  class Object chứa 1 số hàm : hashcode --> hashing địa chỉ vùng nhớ HEAP
    	 //                               equals --> so sánh giá trị 2 đối tượng
    	 //                               tótring --> tự động được gọi khi in KDL đối tượng
    	 
    	 
    	 // Khai bao va gan gia tri cho KDL nguyen thuy
    	 int digit ; 
    	 // bien luu o STACK, gia tri cua bien o KDL nguyen thuy nen luu o STACK luon
    	 digit = 10;
    	 char letter = 'W';
    	 System.out.println("digit --> "+ digit);
    	 System.out.println("letter --> " + letter);
    	 
    	 System.out.println("\n *** ____ ****\n");
    	 
    	 // Khai bao va gan gia tri cho KDL doi tuong
    	 // new Item() --> gọi hàm khởi tạo (constructor) của class/ kdl Item
    	 // --> khởi tạo 1 ô nhớ trên HEAO để lưu giá trị của kdl Item
    	 Item i1 = new Item();
    	 i1.id = 1;
    	 i1.name = 'M';
    	 i1.salesPrice = 11d;
    	 System.out.println("item i1 --> + i1");
    	 System.out.println("item I1 toString --> " + i1.toString()); // . toString(return type) - object(Type chứa hàm
    	 System.out.println("item i1 info --> id = "+ i1.id + ", name =" + i1.name + ", salesPrice =" + i1.salesPrice);
	
    	 Item i2 = new Item();
    	 i2.id = 2;
    	 i2.name = 'H';
    	 i2.salesPrice = 21d;
    	 System.out.println("item i2 --> + i2");
    	 System.out.println("item i2 toString --> " + i2.toString()); // . toString(return type) - object(Type chứa hàm
    	 System.out.println("item i2 info --> id = "+ i2.id + ", name =" + i2.name + ", salesPrice =" + i2.salesPrice);
	     
    	 
    	 Item i3 = null;
    	 System.out.println("item i3 --> " + i3);
    	 //System.out.println("item i3 --> " + i3.toString());
    	 // npe --. jvm throws NullPointerException
    	 // -> --> ko tìm thấy vị trí trỏ hiện tại vugnf nhớ HEAP --> dừng luôn chương trình
    	 
    	 System.out.println("HELOOOOOOOOO");
    	 
    	 //Item i4 = new Item(4, 'J', 44d);
    	 /*
    	 i4.id = 4;
    	 i4.name = 'J';
    	 i4.salesPrice = 44d;
    	 System.out.println("item i4 --> + i2");
    	 System.out.println("item i4 toString --> " + i4.toString()); // . toString(return type) - object(Type chứa hàm
    	 System.out.println("item i4 info --> id = "+ i4.id + ", name =" + i4.name + ", salesPrice =" + i4.salesPrice);
	     */
    	 //System.out.println("item ĩ --> " + i4);
    	 //alt shift R sửa nhanh kích đúp sửa nhanh
    	 
    	 
     }
}
