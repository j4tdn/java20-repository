package view.d1;

import java.math.BigDecimal;

public class Ex01 {
	public static void main(String[] args) {
		//so thap phan: float, double --> KNT
		
		
		/*
		 so thap phan: BigDecimal --> KDT
		 	+ double(thuộc tính)
		 + hỗ trợ các hàm tính taons + - / * rouding, setScale
		 + cho phép tối đa số chữ số thập phân: MathContext.DECIMAL32, 64, 128;
		 
		 để khởi tạo giá trị cho BigDecimal có 2 cách :
		 + BigDecimal.ValueOf(5.2);
		 + new BigDecimal("5.2");
		 
		 -new BigDecimal(5.2) -- nguy hiểm
		*/
		BigDecimal[] numbers = {bd(0.1), bd(0.2), bd(0.04), bd(0.75), bd(1.5)};
		String[] result = getMinFactional(numbers);
		for(String number: result) {
			System.out.println(number);
		}
	}
	
	private static String[] getMinFactional(BigDecimal[] numbers) {
		String[] result = new String[numbers.length];
			for(int i = 0; i < numbers.length; i++) {
				result[i] = getMinFactional(numbers[i]);
			}
		return result;
	}
	
	private static String getMinFactional(BigDecimal number) {
		String nbAsString = String.valueOf(number);
		int indexOfDot = nbAsString.indexOf('.');
		int decimalPartLength = nbAsString.substring(indexOfDot + 1).length();
		
		long denominator = bd(Math.pow(10, decimalPartLength)).setScale(0).longValue();
		long numerator = number.multiply(bd(denominator)).setScale(0).longValue();
		
		long gcd = gcd(numerator, denominator);
		
		return numerator/gcd + "/" + denominator/gcd;
	}
	
	private static long gcd(long a, long b) {
		while(a != b) {
			if(a > b) {
				a = a-b;
			}else {
				b = b-a;
			}
		}
		return a;
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
