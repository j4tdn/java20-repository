/*
 * Viết chương trình tìm số nguyên tố thứ 200 trong hệ thống số tự nhiên.
 */

public class Ex09FindFrimeNumberNth {
	public static int findPrimeNumberNth(int n) {
		int count = 0;
		int primeNumber = 2;
		while(count < 200){
			if(Ex08IsPrimeNumber.isPrimeNumber(primeNumber))
				count++;
			primeNumber++;
		}
		return primeNumber - 1;
	}
	
	public static void main(String[] args) {
		System.out.println("So nguyen to thu 200 la: " + findPrimeNumberNth(200));
	}
}
