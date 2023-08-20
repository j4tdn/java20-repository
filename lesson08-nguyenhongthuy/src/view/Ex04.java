package view;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 	Số nguyên tố tương đương
	Hai số tự nhiên được gọi là nguyên tố tương đương nếu chúng có chung các ước
	số nguyên tố.
	
	Ví dụ: Các số 75 và 15 là nguyên tố tương đương vì cùng có các ước nguyên tố là
	3 và 5.
	
	Yêu cầu: Cho trước hai số tự nhiên N, M. Hãy viết chương trình kiểm tra xem các
	số này có là nguyên tố tương đương với nhau hay không?
	
	Input: N,M ( 2 ≤ M ≤ N ≤ 300000000000000000).
	Output: Nếu chúng là nguyên tố tương đương ghi YES, ngược lại: ghi NO.
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		
		long m, n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter m: ");
			m = Long.parseLong(sc.nextLine());
		} while (m <= 2 && m >= 300000000000000000L);
		do {

			System.out.println("Enter n: ");
			n = Long.parseLong(sc.nextLine());
		} while (n <= 2 && n >= 300000000000000000L);
		sc.close();
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		System.out.println("getPrimeFactors(" + m + ") --> " + Arrays.toString(getPrimeFactors(m)));
		System.out.println("getPrimeFactors(" + n + ") --> " + Arrays.toString(getPrimeFactors(n)));
		
		if(areEquivalentPrimeFactorizations(m, n)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
	
	private static boolean areEquivalentPrimeFactorizations(long num1, long num2) {
		if(Arrays.equals(getPrimeFactors(num1), getPrimeFactors(num2))) {
			return true;
		}
		return false;
	}
	
	//lấy danh sách cấc ước số nguyên tố
	private static int[] getPrimeFactors(long num) {
		int[] result = new int[(int) Math.sqrt(num)];
		long running = 0;
		for(int i = 2; i <= num; i++) {
			if(num % i == 0 && isPrime(i) == true) {
				result[(int) running++] = i;
			}
		}
		return Arrays.copyOfRange(result, 0, (int) running);
	}
	
	//kiểm tra số nguyên tố 
	private static boolean isPrime(long num) {
		for(long i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
