package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BacsiDemo_TryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your year of Birth = ");
		//Cách 2: Xử lý vưới try catch(tiền xử lý)
		//Đặt đoạn mã có khả năng xảy ra ngoại lệ vào khối try
		//Nếu đoạn mã trong khối try bị exception --> bắt exception đó trong khối catch
		//--> bắt exception đó trong khối catch
		//--> code sẽ nhảy xuống khối catch xong tiếp tục chương trình
		
		//Nếu đoạn mã trong khối try không bị exception
		//--> code sẽ k nhyayr vào khối catch ,chỉ tiếp tục chương trình
		//Lưu ý : catch đúng exception bị quăng ra , hoặc là exception cha của nó
		
		/*
		 Quy trình khi bị exception 
		 
		 1.Dòng code bị exception(vd NumberException)
		 -->JAVA sẽ tạo ra 1 đối tượng (new NumberFotmartException(defaut message)
		 2.Nếu bắt lỗi vs catch
		 --> Java sẽ ẩn đối tượng ở bước 1 cho biến trong khối catch
		 * */
		int yearOfBirth = 0 ;
		while(true) {
			try {
				 yearOfBirth  = Integer.parseInt(ip.nextLine());
				 break;
			}catch(NumberFormatException nfe) {
				//Quăng thông tin lỗi cơ bản System.out.println("nfe" +nfe.getMessage());
				nfe.printStackTrace();//quăng ra lỗi giống java nhưng vẫn típ tục chương trình
				System.out.println("Please Enter your year of Birth = ");
			};
		}
	
		
		System.out.println("Age--> "+ (Year.now().getValue() - yearOfBirth +1));
		
		ip.close();
	}
}
