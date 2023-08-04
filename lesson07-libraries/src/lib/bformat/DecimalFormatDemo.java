package lib.bformat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	public static void main(String[] args) {
		double v1 = 4567909597450768.29292d;
		double v2 = 65672.786353d;
		System.out.println("v1 --> " + v1); // 4.5679095987589744E24
		
		//option 1 --> decimal format
		// double --> format --> String
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		
		// with DecimalFormat: Max integer & decimal part --> 16 chars
		
		System.out.println("formated --> " + df.format(v1));
		System.out.println("formated --> " + df.format(v2));
	}

}
