package a.validate_trycatch_throw_throws;

import java.time.Year;
import java.util.Scanner;

public class Ex02BasicDemo_TryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your Year of Birth = ");
		//Cách 2 : Xử lý exception với try catch 
		//Đặt đoạn mã có khả năng xảy ra ngoại lệ vào khối try(thử)
		//Nếu đoạn mã trong khối try bị exception 
			//--> bắt exception đó trong khối catch
			//--> code sẽ nhảy xuống khối catch xong tiếp tục chương trình
		
		//Nếu đoạn mã trong khối try không bị exception 
		//--> code sẽ không nhảy vào khối catch, chỉ tiêp tục chương trình
		int yearOfBirth =0;
		while(true)
		{
			try
			{
				 yearOfBirth = Integer.parseInt(ip.nextLine());
				 break;
			}catch(NumberFormatException nfe) {
				//quăng thông tin lỗi
				//lỗi cơ bản: System.out.println("nfe --> "+nfe.getMessage());
				nfe.printStackTrace();
				System.out.println("Please enter a valid number = ");
			}
		}
		
		//Lưu ý: catch đúng exception bị quăng ra, hoặc là exception cha của nó
		
		System.out.println("Age --> "+ (Year.now().getValue() - yearOfBirth+1));
		ip.close();
	}
}
