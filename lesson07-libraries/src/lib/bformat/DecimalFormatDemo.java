package lib.bformat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		
		double v1 = 45678900121341.2923123d;
		System.out.println("v1" + v1);
		
		//option 1: decimal format
		//double.format --> string
		
		DecimalFormat df = new DecimalFormat("#,###.###");
		
		//with DecimalFormat: Max Integer & decimal part  --> 16 chars
		System.out.println("formatted: " + df.format(v1));
	}
}
