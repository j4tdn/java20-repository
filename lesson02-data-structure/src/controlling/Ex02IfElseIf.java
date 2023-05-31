package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 Khi giáo viên nhập điểm trung bình [0, 10]
		  + nếu DTB [0, 5) --> Học lực yếu
		  + nếu DTB [5, 6.5) --> Học lực trung bình
		  + nếu DTB [6.5, 8.0) --> Học lực khá
		  + nếu DTB [8.0, 10) --> Học lực giỏi
		  
		 Làm tròn, rounding, sử dụng
		 1. DecimalFormat
		 2. BigDecimal(double float), tương tự Integer, Long ...
		 	+ chuyển đổi từ double|float sang --> BigDecimal
		 	+ dùng hàm có sẵn trong class BigDecimal để làm tròn
		 	+ chuyển về lại double|float
		 */
		Random rd = new Random();
//		double avg = rd.nextDouble() + rd.nextInt(10);
//		//commercial
//		BigDecimal avgBd = BigDecimal.valueOf(avg);
//		avgBd = avgBd.setScale(1, RoundingMode.HALF_UP);
//		avg = avgBd.doubleValue();
		
		double avg = BigDecimal.valueOf(rd.nextDouble() + rd.nextInt(10))
								.setScale(1, RoundingMode.HALF_UP)
								.doubleValue();
		//System.out.println("Điểm trung bình --> " + avg);
		System.out.println("Điểm trung bình --> " + avg);
		
		if (avg < 5) {
			System.out.println("Học lực yếu");
		} else if (avg < 6.5) {
			System.out.println("Học lực trung bình");
		} else if (avg < 8.0) {
			System.out.println("Học lực khá");
		} else {
			System.out.println("Học lực giỏi");
		}
	}
}
