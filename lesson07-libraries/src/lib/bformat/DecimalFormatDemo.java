package lib.bformat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	
	public static void main(String[] args) {
		
		// big number --> format return wrong data
		double v1 = 45634727899201022.29292d;
		double v2 = 656722568982.72836d;
		
		System.out.println("v1 --> " + v1); // 4.5634727899201024E16
		
		// option 1 --> decimal format
		// double --> format --> string
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		
		// with DecimalFormat: Max integer & decimal part --> 16 chars
		
		System.out.println("formatted v1 --> " + df.format(v1));
		System.out.println("formatted v2 --> " + df.format(v2));
		
	}
}