package lib.a.math;

import static java.lang.Math.*;

public class MathUtilDemo {

	public static void main(String[] args) {
		
		double v1 = 35.287d;
		double v2 = 28.78202d;
		
		System.out.println("Max --> " + Math.max(v1, v2));
		System.out.println("Min --> " + Math.min(v1, v2));
		System.out.println("Compare --> " + Double.compare(v1, v2));
		
		System.out.println("v1 --> " + v1);
		System.out.println("Round --> " + round(v1));
		System.out.println("Ceil(round up) --> " + ceil(v1));
		System.out.println("Floor(round down) --> " + floor(v1));
	
		//Rounding --> not support round with scale number of decimals
		//		   --> DecimalFormat --> String: format(double)
		//		   --> BigDecimal 	 --> value
	}

}
