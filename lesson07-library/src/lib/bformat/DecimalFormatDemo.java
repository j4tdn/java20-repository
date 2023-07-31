package lib.bformat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		
		double v1 = 45678993517921378.29292d;
		double v2 = 6567225689829.72836d;
		
		System.out.println("v1 --> " + v1);
		
		// option 1 --> decimal format
		// double --> format --> string
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		
		// with DecimalFormat: max integer & decimal part --> 16 chars
		
		System.out.println("formatted --> " + df.format(v1));
		System.out.println("formatted --> " + df.format(v2));
	}
}
