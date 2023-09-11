package lib.bformat;

import java.text.DecimalFormat;

public class DecimalFormatt {
	
	public static void main(String[] args) {
		double v1 = 4563468651465.29292d;
		//option 1 -->decimal format
		//double--> format --> String
		System.out.println("v1--> " + v1);
		
		DecimalFormat df = new DecimalFormat("#,###.000");
		//with DecimalFormat: Max integer -->16 ki tu
		System.out.println("formatted --> " + df.format(v1));
	}
}
