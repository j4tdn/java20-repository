package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 * khi giáo viên nhập điểm trung bình [0,10]
		 * nếu đtb [0,5) --> yếu
		 * nếu đtb [5, 6.5) --> trung bình
		 * nếu đtb [6.5 , 8.0) --> khá
		 * ....
		 * 
		 * làm tròn, rouding, sử dụng
			1.DecimalFormat
			2.BigDecimal(double|float), tương tự integer(value), long...
			+chuyển đồi từ double|float --> bigDecimal
			+Dùng hàm có sẵn trong class BigDecimal để làm tròn
			+chuyển về lại double|float
		 */
		Random rd = new Random();
		double avg = BigDecimal.valueOf(rd.nextDouble(10d)).setScale(1, RoundingMode.HALF_UP).doubleValue();
		
		System.out.println("Điểm trung bình --> " + avg);
		if (avg < 5) {
			System.out.println("Yeu");
		}else if (avg <6.5) {
			System.out.println("trungbinh");
		}else if (avg < 8.0) {
			System.out.println("kha");
		}else {
			System.out.println("gioi");
		}
	}

}
