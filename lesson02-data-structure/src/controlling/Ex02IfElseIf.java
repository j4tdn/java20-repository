package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 * Khi giáo viên nhập điểm trung bình [0, 10] 
		 * 		+ Nếu DTB [0.0, 5.0) --> Học lực yếu
		 * 		+ Nếu DTB [5.0, 6.5) --> Học lực TB 
		 * 		+ Nếu DTB [6.5, 8.0) --> Học lực khá 
		 * 		+ Nếu DTB [8.0, 10)  --> Học lực giỏi 
		 */

		/*
		 * Làm tròn (Rounding): 
		 * 	1) DecimalFormat 
		 * 	2) BigDecimal:
		 * 		_ Chuyển đổi từ double/float -> BigDecimal
		 * 		_ Dùng hàm có sẵn trong class BigDecimal để làm tròn
		 * 		_ Chuyển về lại double/float
		 */

		Random rd = new Random();
		double avg = BigDecimal.valueOf(rd.nextDouble(10d)).setScale(1, RoundingMode.HALF_UP).doubleValue();
		System.out.println("Điểm trung bình --> " + avg);
		
		if (avg < 5)
			System.out.println("Học lực yếu");
		else if (avg < 6.5)
			System.out.println("Học lực trung bình");
		else if (avg < 8)
			System.out.println("Học lực khá");
		else 
			System.out.println("Học lực giỏi");
	}
}
