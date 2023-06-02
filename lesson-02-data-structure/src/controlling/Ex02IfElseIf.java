package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex02IfElseIf {

	public static void main(String[] args) {

		Random rd = new Random();
		//double avg = rd.nextDouble(10d);
		//commercial
		
		//design pattern --> builder pattern
		
		double avg = BigDecimal.valueOf(rd.nextDouble(10d))
				.setScale(1, RoundingMode.HALF_UP).doubleValue();
		
//		BigDecimal avgBD = BigDecimal.valueOf(avg);
//		avgBD = avgBD.setScale(1, RoundingMode.HALF_UP);

		System.out.println("Diem trung binh --> " + avg);
		
		if (avg < 5) {
			System.out.println("Hoc luc yeu");
		} else if (avg < 6.5) {
			System.out.println("Hoc luc trung binh");
		} else if ( avg < 8) {
			System.out.println("Hoc luc kha");
		} else {
			System.out.println("Hoc luc gioi");
		}

	}
}
