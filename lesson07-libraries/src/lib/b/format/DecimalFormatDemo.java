package lib.b.format;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	
	public static void main(String[] args) {
		
		//big number --> format return wrong data
		double v1 = 45795895232213212.21393123d;
		double v2 = 451212.21393123d;
		
		System.out.println("v1 --> " + v1); // Số quá lớn -> sai dữ liệu
		System.out.println("v2 --> " + v2);
	
		// option 1 --> decimal format
		// double --> format --> String
		
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		
		//with DecimalFormat: Max integer & decimal part --> 16 chars
		
		System.out.println("Formatted v1 --> " + df.format(v1));
		System.out.println("Formatted v2 --> " + df.format(v2));
	}
	
}
