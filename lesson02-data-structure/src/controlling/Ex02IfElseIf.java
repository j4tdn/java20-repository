package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		/*
		 * Khi giáo viên nhập điểm trung bình [0,10]
		 * nếu DTB [0,5)--> Yếu
		 * nếu DTB [5,6.5)--> TB
		 * nếu DTB [6.5,8)--> Khá
		 * nếu DTB [8,10)--> Giỏi
		 * //làm tròn , rounding, sử dụng
		//1.DecimalFomat
		//2.BigDecimal(double|float) , tương tự Integer ,Long ...
		 * + Chuyển đổi double|float--> BigDecimal
		 * + dùng hà có sẵn trong class BigDecimal để làm tròn
		 * +chuyển về lại double|float
		 * 
		 *desgin pattern --> buider pattern
		 * */
		Random rd = new Random();
		
		//double avg = rd.nextDouble(10d);
		
		//BigDecimal avgBD= BigDecimal.valueOf(avg);
		//avgBD = avgBD.setScale(1,RoundingMode.HALF_UP);
		//avg = avgBD.doubleValue();
		double avg = BigDecimal.valueOf(rd.nextDouble(10d))
							   .setScale(1,RoundingMode.HALF_UP)
							   .doubleValue();
		
		System.out.println("Diem trung binh -->" + avg);
		
		if (avg < 5.0) {
			System.out.println("Hoc luc yeu");
		}
		else if(avg <6.5) {
			System.out.println("Hoc luc TB");
		}
		else if (avg<8.0) {
			System.out.println("Hoc luc kha");
		}
		
		else {
			System.out.println("Hoc luc gioi");
		}
		//Cấu trúc điều kiện : if else if ?: switch case
		//Cấu trúc vòng lặp : for,while,dowhile
		//Cấu trúc dữ liệu : mảng
		String result =avg < 5 ? "Hoc luc yeu":
						avg <6.5? "Hoc luc TB":
						avg<8.0 ? "Hoc luc kha":
								  "Hoc luc gioi";
		System.out.println("Ket quua la: "+ result);
	}
}
