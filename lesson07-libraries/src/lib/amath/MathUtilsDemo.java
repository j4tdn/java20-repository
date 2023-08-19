package lib.amath;

import static java.lang.Math .*;
public class MathUtilsDemo {
	public static void main(String[] args) {
		
		Double v1 = 35.287d;
		Double v2 = 28.7308d;
		
		System.out.println(max(v1, v2));
		System.out.println(min(v1, v2));
		
		System.out.println("compare: " + Double.compare(v1, v2));
		
		System.out.println("v1: " + v1);
		System.out.println("round: " + round(v1));
		System.out.println("seil (round of:  )" + ceil(v1));
		System.out.println("floor (round down: )" + floor(v1));
	
		//rouding: not support round with scale number of decimals
		
		//       : DecimalFormat --> String: format(double)
		//       : BigDeciaml --> value
	}
}
