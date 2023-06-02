package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/* 
		 * khi giáo viên nhạp điểm trung bình [0, 10]
		 * + nếu DTB[0, 5.0]: Học lực Yếu
		 * + nếu DTB[5.0 6.5]: Học lực TB
		 * + nếu DTB[]: Học lực Yếu
		 * 2. BigDecimal
		 * chuyển từ double float--< bigdecimal
		 * +dùng hàm có sẵn
		 * 
		 */
		Random rd = new Random();
		double avg = BigDecimal.valueOf(rd.nextDouble(10d)).setScale(1, RoundingMode.HALF_UP).doubleValue();
		System.out.println("Điểm trung binh --> "+ avg);
		if (avg <5) {
			System.out.println("Học lực yếu");
		} else if (avg < 6.5) {
			System.out.println("Học lực TB");
		} else if (avg < 8) {
			System.out.println("Học lực khá");
		} else {
			System.out.println("Học lực giỏi");
		}
		
		//Làm tròn, roudding
		//1. DecimalFomat
		//2. BigDecimal, tương tự Integer(value), Long ...
		 
	}

}
