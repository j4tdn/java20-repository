package demomain;

public class Ex01DemoMainMethod {
	// ctrl f11 --> chạy chương trình
	
		// Hàm main tiêu chuẩn(bắt buộc) trong JAVA
		
		// System.out.println() --> In KQ ra màn hình console và xuống hàng
		// System.out.print()   --> In KQ ra màn hình console
		// \n --> break line xuống hàng
		
		public static void main(String[] args) {
			System.out.println("1. Java Class");
			System.out.println("2. Main Method");
			
			System.out.println("\nIn ra tam giác ngôi sao");
			Ex01DemoMainMethod.printStarTriangle();
			
			System.out.println("\nIn ra 2 tam giác ngôi sao");
			printStarTriangle();
			printStarTriangle();
		}
		
		/*
		  [] --> optional, có/không đều ok
		  - access modifier: phạm vi truy cập
			VD: public: sử dụng, được gọi ở bất kỳ(trong file hiện tại hoặc những file khác) đâu
			    private: sử dụng, được gọi trong phạm vi của class chứa nó
		  		mặc định: package scope
		  				--> sử dụng bên ngoài class được
		  				--> nhưng phải cùng package
		  		
		  - static: Lấy tên class chấm tên hàm để gọi và sử dụng hàm đó
		  - non-static: không thể lấy class chấm(gọi được) mà phải gọi bằng 1 cách 'khác'(chưa học)  
		 	
		 	Lưu ý: Tạm thời --> 'luôn luôn' có từ khóa static			
		 				
		  - return data type: kiểu dữ liệu trả về
		  	Là thông tin cần trả về sau khi thực thi hàm
		  	VD: hàm tính tổng 2 số --> trả về số nguyên --> int
		  	    hàm kiểm tra 1 số là chẵn hay lẻ --> trả về đúng sai --> boolean
		  	    hàm dùng để in ra tam giác ngôi sao --> không cần trả về --> void
		  	    hàm để thêm dữ liệu vào file --> không cần trả về --> void
		  	    
		  	    Với những hàm KDL trả về khác void
		  	    	--> trong phần thân hàm phải có từ khóa return để biết cần trả về gì
		  	    	--> khi gặp từ khóa return hàm sẽ dừng lại
		  	    Với những hàm KDL trả về là void
		  	    	--> không cần phải return
		  
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
		  --> có những đoạn code trùng nhau, tạo ra hàm để chứa những đoạn code đó
		  
		  Cấu trúc, cú pháp khai báo hàm, gồm 2 phần
		  + phần khai báo
		  + phần thực thi (thân hàm)
		  
		  [access modifier] [static] return_data_type method_name(parameters...) {
		  	 // body, statement
		  }
		 */
		
		// đang khai báo hàm
		// in ra tam giá ngôi sao luôn có 5 dòng
		
		// Để gọi hàm static
		// ClassOwner.staticMethodName(...)
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
