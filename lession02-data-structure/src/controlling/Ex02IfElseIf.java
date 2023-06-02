package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 Khi giáo viên nhập điểm trung bình [0, 10]
		 + nếu DTB [0, 5) --> Học lực yếu
		 + nếu DTB [5.0, 6.5) --> Học lực trung bình
		 + nếu DTB [6.5, 8.0) --> Học lực khá
		 + nếu DTB [8.0, 10) --> Học lực giỏi
		 
		 Làm tròn, rouding, sử dụng
		 1. DecimalFormat
		 2. BigDecimal, tương tự Integer, Long ...
		 	+ chuyển đổi từ double|float --> BigDecimal
		 	+ dùng hàm có sẵn trong class BigDecimal để làm tròn
		 	+ chuyển về lại double|float
		 
		 	// design pattern --> builder pattern
		 */
		Random rd = new Random();
		// commercial
		double avg = BigDecimal.valueOf(rd.nextDouble(10d))
							   .setScale(1, RoundingMode.HALF_UP)
							   .doubleValue();
		System.out.println("Điểm trung bình --> " + avg);
	
		if(avg < 5) {
			System.out.println("Học lực yếu");
		} else if (avg < 6.5){
			System.out.println("Học lực trung bình");
		} else if (avg < 8.0){
			System.out.println("Học lực khá");
		} else {
			System.out.println("Học lực giỏi");
		}
		
		// Cấu trúc điều kiện: if else if ?: switch case
		// Cấu trúc vòng lặp: 
	}
}
