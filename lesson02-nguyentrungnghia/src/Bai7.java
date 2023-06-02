import java.util.Scanner;

public class Bai7 {
	private static void decimalToBinary(int decimal) {
		int[] binary = new int[40];
		int index = 0;
		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal /= 2;
		}
		for (int i = index - 1; i >= 0; i--)
			System.out.print(binary[i]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Nhập số nguyên không âm: ");
		int decimal = sc.nextInt();
		System.out.print(decimal + " chuyển sang hệ nhị phân là: ");
		decimalToBinary(decimal);
	}
}
