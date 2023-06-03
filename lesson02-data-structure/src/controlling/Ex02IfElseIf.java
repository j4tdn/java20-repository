package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/**
		 * khi gv nhập điểm trung bình [0-10] 
		 * nếu DTB [0.0-5.0) --> yếu 
		 * nếu DTB [5-6.5)   --> tb 
		 * nếu DTB [6.5-8.0) --> khá 
		 * nếu DTB [8.0-10]  --> giỏi
		 * 
		 * làm tròn, rounding, sử dụng 
		 * 1. DecimalFormat 
		 * 2. BigDecimal(double|float),
		 * tương tự Integer(value), Long... 
		 * + chuyển đổi từ double|float --> BigDecimal
		 * + dùng hàm có sẵn trong class BigDecimal để làm tròn + chuyển về lại
		 * double|float
		 */

		Random rd = new Random();

		double avg = BigDecimal.valueOf(rd.nextDouble(10d)).setScale(1, RoundingMode.HALF_UP).doubleValue();
		System.out.println("điểm trung bình --> " + avg);
		
		if (avg < 5) {
			System.out.println("học lực yếu");
		} else if (avg < 6.5) {
			System.out.println("học lực trung bình");
		} else if (avg < 8) {
			System.out.println("học lực khá");
		} else System.out.println("học lực giỏi");
		
		String result = avg < 5 ? "học lực yếu"
								: avg < 6.5 ? "học lực trung bình"
								: avg < 8.0 ? "học lực khá"
								: "học lực giỏi";
		
		System.out.println("ternary operator: " + result);
	}
	
	// tổng kết: khi nào gặp biểu thức 1 hoặc nhiều điều kiện 
	// kiểm tra đúng sai --> if else .. else.. if
}
