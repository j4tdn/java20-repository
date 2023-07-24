package a.validate.trycatch_throw;

import java.time.Year;
import java.util.Scanner;

public class Ex02BacsicDemo_TryCatch {
  public static void main(String[] args) {
	 Scanner ip = new Scanner(System.in);
	  System.out.print("Enter your Year of Birth = ");
	  
	  // cach 2 : xu ly excep voi try catch
	  // dat doan ma co kha nang xay ra ngoai le vao khoi try(thu)
	  // neu doan ma trong khoi try bi exception
	    // --> nat exception do trong khoi catch
	    // --> code se nhay xuong khoi catch xong tiep tuc chuong trinh
	  
	  // neu doan ma trong khoi try khong bi exception
	  // --> code se khong nhay vao khoi catch, chi tiep tuc chuong trinh
	  
	  
	  // luu y : catch dung exception bi quang ra, hoac la exeption cha cua no
	  
	  /**
	   *  quy trình khi bị exception
	   *  1. dòng code bị exception(vs NumberFormatException)
	   *  --> Java sẽ tạo ra 1 đối tượng ( new NumberFormatException(default mesage)
	   *  2. nếu bắt lỗi với catch
	   *  --> java sẽ ẩn đối tượng ở bước 1 cho biến trong khối catch
	   *  
	   */
	  int yearOfBirth = 0;
	  while(true) {
	  try {
		yearOfBirth = Integer.parseInt(ip.nextLine());
	  }catch(NumberFormatException nfe) {
		  // quang thong tin loi co ban system
		  nfe.printStackTrace();
		  System.out.print("Please enter a valid number = ");
	
	  }
	  
     
	  System.out.print("Arg -->" +(Year.now().getValue()- yearOfBirth+ 1));
	 ip.close();
}
}
}