package demomain;

/*
 *   Class
 *      + Function/Method
 *        --> không thể khai báo hàm bên trong hàm.
 *      + Data Structure
 */

public class Ex01DemoMainMethod {
	// cytl f11 --> chay chuong trinh
	
	// Hàm main tiêu chuẩn (bắt buộc) trong JAVA
	
	// System.out.println() --> In ket qua ra man hinh console và xuống hàng
	// System.out.print() --> In KQ ra man hinh console
	// \n --> break line xuong hang
	public static void main(String[] args) {
		System.out.print("1. Java Class\n\n");
		System.out.println("2. Main Method");
		
		printStarTriangle();
	}
	
	/*
	 [] --> optional, có/không đều OK.
	 access modifier: phạm vi truy cập
	   VD: public: sử dụng, được gọi ở bất kỳ(trong file hiện tại hoặc những file khác) đâu.
	   	   private: sử dụng, được gọi trong phạm vi của class chứa nó.
	   	   mặc định: package scope
	   	   			--> sử dụng bên ngoài class được
	   	   			--> nhưng phải cùng package.
	 - static: Lấy (class).(method) để sử dụng hàm đó.
	 - non-static: không thể lấy class để gọi method được mà phải gọi bằng 1 cách 'khác' (chưa học).
	 
	 - return data type: kiểu dữ liệu trả về.
	   Là thông tin cần trả về sau khi thực thi hàm
	   VD: hàm tính tổng 2 số --> trả về số nguyên --> int
	       hàm kiểm tra 1 số là chẵn hay lẻ --> trả về đúng sai --> boolean
	       hàm dùng để in ra tam giác ngôi sao --> không cần trả về --> void
	       hàm để thêm dữ liệu vào file --> không cần trả về --> void
	       
	       với những hàm KDL trả về khác void
	           --> trong phần thân hàm phải có từ khóa return để biết cần trả về gì
	           --> khi gặp từ khóa return hàm sẽ dừng lại.
	       với những hàm KDL trả về là void
	       
	 - method name
	 
	 - (parameters): danh sách tham số/input của hàm hiện tại
	   VD: method_name() --> hàm này ko cần input
	   	   method_name(int a, int b) --> hàm này cần 2 tham số truyền vào là a, b KDL int
	   	   --> Lúc khai báo
	   	       + Tham số hoàn toàn không có giá trị
	   	       + Khi nào chỗ nào gọi hàm thì mới truyền giá trị vào cho tham số
	 Hàm
	 Được dùng để xây dựng, giải quyết 1 chức năng của dự án, bài toán
	 Tạo ra hàm khi
	 --> Có những đoạn code trùng nhau, tạo ra hàm để chứa những đoạn code đó
	  
	 Cấu trúc, cú pháp khai báo hàm, gồm 2 phần
	  + phần khai báo
	  + phần thực thi (thân hàm)
	  
	 [access modifier] [static] return_data_type method_name(parameters...)
	 	// body, statement
	*/
	
	// đamg khai báo hàm
	// in ra tam giác ngôi sao luôn có 5 dòng
	
	// Để gọi hàm static
	// ClassOwner.StaticMethodName(...)
	static void printStarTriangle() {
		System.out.println("*");
		System.out.println("* *");
		System.out.println("* * *");
		System.out.println("* * * *");
		System.out.println("* * * * *");
	}
	
	public static void printNumberTriangle() {
		System.out.println("1");
		System.out.println("1 2");
		System.out.println("1 2 3");
		System.out.println("1 2 3 4");
		System.out.println("1 2 3 4 5");
	}
}
