package lib.amath;

import static java.lang.Math.*;

public class MathUtilDemo {

	public static void main(String[] args) {
		double v1 = 35.287d;
		double v2 = 28.787d;
		
		System.out.println("max===> " + max(v1, v2));
		System.out.println("MIN===> " + min(v1, v2));
		System.out.println("compare --> "+ Double.compare(v1, v2));
		
		System.out.println("round  " + round(v1));
		System.out.println("ceil(round up)  " + ceil(v1));
		System.out.println("floor(round down)  " + floor(v1));
	
		/*
		 rounding -->not support round with scale number of decimals
		 
		 * */
	}
}
