package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIF {
     public static void main(String[] args) {
		/*
		 * khi giáo viên nhập điểm trung bình [0,10]
		 * + nếu ĐTB [0.0,5.0) --> HỌC LỰC YẾU
		 * + nếu ĐTB [5.0,6.5) --> HỌC LỰC TRUNG BÌNH
		 * + nếu ĐTB [6.5,8.0) --> HỌC LỰC KHÁ
		 * + nếu ĐTB [8.0,15) --> HỌC LỰC GIỎI
		 * 
		 * 
		 *  làm tròn, rounding
		 * 1. decimalFormat
    	   2. BigDecimal(dounle| float), tương tự Interger(value), Long ...
    	   + chuyển đổi từ dounle| float --> BigDecimal
    	   + dùng hàm có sẵn trong classs BigDecimal để làm tròn
    	   + chuyển về lại double|float
		 */
    	 Random rd = new Random();
    	 double avg = BigDecimal.valueOf(rd.nextDouble(10d)).setScale(1, RoundingMode.HALF_UP).doubleValue();
    	 
    	
    	 System.out.println("điểm trung bình --> " + avg);
    	 if (avg < 5) {
    		 System.out.println("học lực yếu");
    	 }else if (avg < 6.5){
    		 System.out.println("học lực trung bình");
    	 }else if (avg < 8.0) {
    		 System.out.println("học lực khá");
    	 }else {
    		 System.out.println("học lực giỏi");
    	 
    	 }
    	

     }
}
