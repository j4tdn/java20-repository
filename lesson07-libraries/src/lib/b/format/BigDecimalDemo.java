package lib.b.format;

import java.math.BigDecimal;

/**
 * public class BigDecimal{
 * 		private double value;
 * }
 *
 */
public class BigDecimalDemo {
	
	public static void main(String[] args) {
		
		// builder pattern with style same as UserHigherAdv
		BigDecimal bd1 = new BigDecimal("2.06");
		BigDecimal bd2 = new BigDecimal(2.06);
		BigDecimal bd3 = BigDecimal.valueOf(222.2222);
	}
}
