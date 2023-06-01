package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {
	public static void main(String[] args) {
		Random rd = new Random();
		double avg = rd.nextDouble(10d);
		BigDecimal avgBD = BigDecimal.valueOf(avg);
		//commercial
		avgBD = avgBD.setScale(1, RoundingMode.HALF_UP);
		avg = avgBD.doubleValue();
		System.out.println("Điểm trung bình: --> " +avg);	
		//System.out.printf();//in ra format nào đó
		
		//làm tròn ,rounding
		//1. DecimalFormat
		//2. BigDecimal
			/*
			 	+Chuyển đổi từ double| float --> BigDecimal
			 	+ dùng hàm có sẵn trong Class BigDecimal để làm tròn
			 	+ chuyển về lại double| float
			 */
		
		
		 double avg2 = rd.nextDouble(10d);
		BigDecimal.valueOf(rd.nextDouble(10d))
				.setScale(1, RoundingMode.HALF_UP)
				.doubleValue();					
		//commercial
		//System.out.println("Điểm trung bình: --> " +avg2);		
		 
		
		if(avg <5 )
		{
			System.out.println("Học lực Yếu");
			
		}else if( avg <6.5)
			
		{
			System.out.println("Học lực Trung bình");
		}
		else if(avg <8.0)
		{
			System.out.println("Học lực khá");
		}
		else 
		{
			System.out.println("Học lục Giỏi");
		}
	}
}
