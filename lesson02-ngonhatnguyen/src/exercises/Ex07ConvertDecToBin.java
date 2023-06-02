package exercises;

import java.util.Scanner;

public class Ex07ConvertDecToBin {
	// Viết chương trình chuyển đổi cơ số một số tự nhiên ở hệ cơ số 10(thập phân) 
	// thành số ở hệ cơ số 2(nhị phân)
	public static String invertString(String origin) {
		String inv = "";
		for (int i=origin.length() - 1;i>=0;i--) {
			inv = inv + origin.charAt(i);
		}
		return inv;
	}
	
	public static String convertDecToBin(int n) {
		String bin = "";
		while (n != 0) {
			bin += String.valueOf(n % 2);
			n /= 2;
		}
		bin = invertString(bin);
		return bin;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập 1 số tự nhiên: ");
		int x = sc.nextInt();
		System.out.println("Chuyển đổi cơ số ở hệ cơ số 10 sang hệ cơ số 2:");
		System.out.println(x + " = " + convertDecToBin(x));
	}
}
