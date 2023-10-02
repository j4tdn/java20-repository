package lib.bformat;

public class DecimalFormat {
	public static void main(String[] args) {
		double v1 = 3272368725552356.32468747d;
		double v2 = 234764284.262482d;
		
		System.out.println("v1 --> " + v1);
		
		//option 1 --> decimal format
		//double --> format --> string
		
		java.text.DecimalFormat df = new java.text.DecimalFormat("#,###.000");
		
		//with DecimalFormat: max integer & decimal part --> 16 chars
		
		
		System.out.println("formatted v1 --> " + df.format(v1));
		System.out.println("formatted v2 --> " + df.format(v2));
	}
}
