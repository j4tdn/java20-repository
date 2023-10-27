package utils;

import java.math.BigDecimal;

public class NumberUtils {
	
	private NumberUtils() {

	}

	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}
	
	public static BigDecimal sumBd(double a, double b) {
		return new BigDecimal(String.valueOf(a + b));
	}
	
}