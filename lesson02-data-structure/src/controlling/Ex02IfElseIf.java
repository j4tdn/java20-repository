package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 * Khi giáo viên nhập điểm trung bình [0, 10] Nếu DTB [0, 5.0) --> Học lực yếu
		 * Nếu DTB [5.0, 6.5) --> Học lực TB Nếu DTB [6.5, 8) --> Học lực khá Nếu DTB
		 * [8, 10] --> Học lực giỏi
		 */

		/*
		 * Làm tròn, rounding: 
		 * DecimalFormat, 
		 * BigDecimal:
		 * 		_ Chuyển đổi từ double/float -> BigDecimal
		 * 		_ Dùng hàm có sẵn trong class BigDecimal để làm tròn
		 * 		_ Chuyển về lại double/float
		 */

		Random rd = new Random();
		double avg = rd.nextDouble(10d);
		BigDecimal avgBd = BigDecimal.valueOf(avg);
		// commercial
		avgBd.setScale(2, RoundingMode.HALF_UP);
		avg = avgBd.doubleValue();
		
		System.out.println("Điểm trung bình --> " + avg);
	}
}
