package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 * khi giao vien nhap diem trung binh [0,10]
		 * neu DTB[0,5) --> hoc luc yeu
		 * neu DTB[5,6.5)--> Hoc luc TB
		 * neu DTB[6.5,8.0)-->hoc luc kha
		 * neu DTB[8,10)-->hoc luc gioi
		 */
		
		//làm tròn, rounding 
				//1.DecimalFormat
				
				//2.BigDecimal(Double|Float), tương tự Integer(value), long...
				//	+Chuyển đổi từ double | float --> BigDecimal
				//  + dùng hàm có sẵn trong class BiDecimal để làm tròn
				// + chuyển về lại double | float
		
 		Random rd = new Random();
		
		
		double avg = BigDecimal.valueOf(rd.nextDouble(10))
				.setScale(1, RoundingMode.HALF_UP)
				.doubleValue();
		
		System.out.println("Diem Trung Binh: " + avg);
		
		if(avg < 5) {
			System.out.println("Học lực yếu");
		}else if(avg < 6.5) {
			System.out.println("Học lực Trung Bình");
		}else if(avg < 8.0) {
			System.out.println("Học lực khá");
		}else {
			System.out.println("Học lực Giỏi");
		}
		String result = avg <5 ? "Học lực yếu" 
								: avg < 6.5 ? "Học lực Trung Bình"
								: avg < 8.0 ? "Học lực khá"
								:"Học lực Giỏi";
		System.out.println("result: " + result);
		
		
		
		// Cấu trúc điều kiện : if else if ?: switch case
		//cấu trúc vòng lặp: for, while, dowhile
		//cấu trúc dữ liệu : mảng
	}
}
