
public class Bai9 {
	private static boolean isPrime(int a) {
		if (a > 1) {
			for (int i = a - 1; i >= 2; i--) 
				if (a % i == 0)
					return false;
			return true;
		} else 
			return false;
	}
	
	public static void main(String[] args) {
		int number = 2;
		int count = 0;
		while (count < 200) {
			if (isPrime(number))
				count++;
			number += 1;
		}
		System.out.println("Số nguyên tố thứ 200 là: " + (number - 1));
	}
}
