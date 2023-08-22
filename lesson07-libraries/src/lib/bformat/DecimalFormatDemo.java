package lib.bformat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

	public static void main(String[] args) {
		
		// big number --> format return wrong data
		double v1 = 4567899201022.29292d;
		double v2 = 65672.72836d;
		
		System.out.println("v1 --> " + v1);
		
		// option 1 --> Decimal Format
		// double --> format --> string
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		
		// with DecimalFormat: Max integer & decimal part --> 16 
		
		System.out.println("formatted --> " + df.format(v1));
		System.out.println("formatted --> " + df.format(v2));
	}

}
