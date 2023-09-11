package lib.bformat;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * public class BigDecimal{
 * private double value;
 * }
 * */
public class BigDecimalDemo {

	public static void main(String[] args) {
		//builder pattern with style same as UserHigherAdv
		
		BigDecimal bd1 = BigDecimal.valueOf(272.3920);
		BigDecimal bd2 = new BigDecimal("272.3920");
		BigDecimal bd3 = bd(65.283)
						.multiply(bd(22))
						.setScale(2,RoundingMode.HALF_UP);
		bd3= bd3.add(bd(500.76));
		
		System.out.println("bd1 :" +bd1);
		System.out.println("bd2 :" +bd2);
		System.out.println("bd3 :" +bd3);
		
	}
	
	
	private static BigDecimal bd(double dValue) {
		return BigDecimal.valueOf(dValue);
	}
}
