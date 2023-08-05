package lib.bformat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	
	public static void main(String[] args) {
		
		//big number --> format return wrong data
		
		double v1 = 4856784599201022.25646d;
		double v2 = 65728546.45241d;
		
		System.out.println("v1 --> " + v1);
		
		//option 1 --> decimal format
		//double --> format --> string
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		
		// with DecimalFormat: Max integer & decimal part --> 16 chars
		System.out.println("formatted v1 --> " + df.format(v1));
		System.out.println("formatted v2 --> " + df.format(v2));
	}
}
