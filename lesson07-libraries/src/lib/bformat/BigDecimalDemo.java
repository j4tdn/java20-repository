package lib.bformat;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * public class BigDecimal {
 * 		private double value;
 * }
 */
public class BigDecimalDemo {
	public static void main(String[] args) {
		
		//builder pattern with style same as UserHigherAdv
		BigDecimal bd0 = new BigDecimal(17.23); // won't use
		BigDecimal bd1 = bd(23.4312);
		BigDecimal bd2 = new BigDecimal("19.25");
		
		BigDecimal bd3 = bd(65.235)
				.multiply(bd(22))
				.setScale(2, RoundingMode.HALF_UP);
		
		bd3.add(bd(500.76));
		
		System.out.println(bd0);
		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd3);
		
	}
	
	private static BigDecimal bd(double dvalue) {
		return BigDecimal.valueOf(dvalue);
	}
}
