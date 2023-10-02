package controlling;

import java.awt.geom.RoundRectangle2D;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 * Khi giáo viên nhập điểm trung bình [0, 10]
		 * Nếu dtb 	[0.0, 5.0) --> Học lực yếu
		 * 		 	[5.0, 6.5) --> Trung bình
		 * 			[6.5, 8.0) --> Khá
		 * 			[8.0, 10)  --> Giỏi
		 */
		Random rd = new Random();
		//Làm tròn, rounding
		//1. DecimalFormat
		//2. BigDecimal, tương tự Integer, Long, ...
		//		+Chuyển đổi từ float/ double sang BigDecimal
		//		+Chuyển về lại double/ float
		
		double avg = BigDecimal.valueOf(rd.nextDouble(10d))
								.setScale(1, RoundingMode.HALF_UP)
								.doubleValue();
		System.out.println("Diem trung binh: " + avg);
		
		if(avg < 5)
			System.out.println("Hoc luc yeu!");
		else if(avg < 6.5) 
				System.out.println("Hoc luc trung binh!");
			else if(avg < 8)
					System.out.println("Hoc luc kha!");
				else
					System.out.println("Hoc luc gioi!");
		
		//Hạn chế sử dụng toán tử 3 ngôi cồng kềnh
		String result = avg<5 ? "Hoc luc yeu"
							  : avg < 6.5 ? "Hoc luc trung binh"
							  : avg < 8 ? "Hoc luc kha"
							  : "Hoc luc gioi";
		System.out.println("ternary operator: " + result);
		
	}
}
