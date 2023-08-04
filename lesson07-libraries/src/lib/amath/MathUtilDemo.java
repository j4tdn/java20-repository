package lib.amath;
import static java.lang.Math.*;

public class MathUtilDemo {
	
	public static void main(String[] args) {
		double v1 = 35.287d;
		double v2 = 28.78202d;
		
		System.out.println("max --> " + max(v1, v2));
		System.out.println("min --> " + min(v1, v2));
		System.out.println("compare --> " + Double.compare(v1, v2));
	}

}
