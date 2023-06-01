package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 * Khi giáo viên nhập điểm trung bình [0,10]
		 * [0,5) 	-> 	Học lực yếu
		 * [5,6.6) 	-> 	Học lực trung bình	
		 * [6.5,8) 	-> 	Học lực khá
		 * [8,10} 	-> 	Học lực giỏi
		 * 
		 * 	Làm tròn, rounding
		 *	1. DecimalFormat
		 *	2. BigDecimal(double|float) tương tự Integer(value), Long, Double
		 *	+ Chuyển đổi từ double | float --> BigDecimal
		 *	+ dùng hàm có sẵn trong class BigDecimal để làm tròn
		 *	+ chuyển bề lại double | float
		 */
		Random rd = new Random();
		double avg = rd.nextDouble(10d);
		BigDecimal avgBD = BigDecimal.valueOf(avg);
		avgBD = avgBD.setScale(1, RoundingMode.HALF_UP);
		avg = avgBD.doubleValue();
		
		double avgV = BigDecimal.valueOf(rd.nextDouble(10)).setScale(1, RoundingMode.HALF_UP).doubleValue();
		System.out.println("Điểm trung bình %.2lf --> " + avgV);
		
		if(avgV < 5) {
			System.out.println("Học lực yếu");
		} else if(/*avgV >= 5 &&  */ avgV < 6.5) {
			System.out.println("Học lực trung bình");
		} else if(avgV < 8) {
			System.out.println("Học lực khá");
		} else {
			System.out.println("Học lực giỏi");
		}
		
		//	Cấu trúc điều kiện: If / else if / else 
		//	Cấu trúc vòng lặp: for / while / dowhile
		//	Cấu trúc dữ liệu: mảng
	}
}
