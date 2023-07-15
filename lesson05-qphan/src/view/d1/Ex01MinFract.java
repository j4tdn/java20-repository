package view.d1;

import java.math.BigDecimal;
import java.math.MathContext;

public class Ex01MinFract {
	public static void main(String[] args) {
		// số thập phân: float, double --> KNT
		
		/*  
		 BigDecimal
		 	+ double(thuộc tính)
		  
		 số thập phân: BigDecimal --> KĐT
		 + hỗ trợ các hàm tính toán + - * / rounding(up/down/commercial), setScale
		 + cho phép tối đa số chữ số phần thập phân: MathContext.DECIMAL32_64_128
		 
		 để khởi tạo giá trị cho BigDecimal có 2 cáh
		 + BigDecimal.valueOf(5.2);
		 + new BigDecimal("5.2")
		 
		 - new BigDecimal(5.2) --> nguy hiểm
		*/
		
		BigDecimal[] numbers = {bd(0.1), bd(0.2), bd(0.04), bd(0.75), bd(1.5), bd(202.087)};
		String[] result = getMinFractional(numbers);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + " --> " + result[i]);
		}
	}
	
	private static String[] getMinFractional(BigDecimal[] numbers) {
		String[] result = new String[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			result[i] = getMinFractional(numbers[i]);
		}
		
		return result;
	}
	
	private static String getMinFractional(BigDecimal number) {
		// B1: Số thập phân --> phân số --> 202.087
		String nbAsString = String.valueOf(number); // "202.087"
		int indexOfDot = nbAsString.indexOf(".");
		int decimalPartLength = nbAsString.substring(indexOfDot + 1).length();
		
		long denominator = bd(Math.pow(10, decimalPartLength)).setScale(0).longValue();
		long numerator = number.multiply(bd(denominator)).setScale(0).longValue();
		
		// B2: Tìm UCLN của tử và mẫu
		long gcd = gcd(numerator, denominator);
		
		// B3: Lấy tử và mẫu chia cho UCLN --> phân số tối giản
		return numerator/gcd + "/" + denominator/gcd;
	}
	
	// greatest common divisor --> UCLN
	// a-->24, b-->32 ==> 8
	//     24       8
	//     16       8
	//     8        8
	
	// least common multiple --> BCNN
	// (a * b)/ucln(a,b)
	
	// 24 --> 2^3 * 3 
	// 32 --> 2^5
	// --> 2^5 * 3 = 96
	
	private static long gcd(long a, long b) {
		while(a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
