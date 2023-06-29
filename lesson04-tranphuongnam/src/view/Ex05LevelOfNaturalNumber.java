package view;

import java.util.Scanner;

public class Ex05LevelOfNaturalNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số n: ");
		int n = scanner.nextInt();
		System.out.println("Level của số " + n + " là: " + findLevel(n));
	}

	private static int findLevel(int number) {
		int count = 0;
		int sqrt = (int) Math.sqrt(number);
		System.out.println(sqrt);
		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				count += 2;
			}
		}
		
		//Count chính là số lượng ước < căn của số đó
		//Nếu là số chính phương thì trừ đi 1
		//Ví dụ 8 -> căn 8 là 2,33333 nghiệm: 1 2 4 8 = count * 2
		//		9 -> căn 9 là 	3 	  nghiệm: 1 3 9   = count * 2 - 1
		if(sqrt * sqrt == number) {
			count--;
		}
		return count;
	}
}
