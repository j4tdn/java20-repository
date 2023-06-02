package view;

import java.util.Scanner;

public class Ex07RadixNumber10To2 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("nhap n =");
		int n = ip.nextInt();
		System.out.print("so o he co so 2 la: " + RadixNumber10To2(n));
	}
	private static String RadixNumber10To2(int number) {
		if(number == 0) {
			return "0";
		}
		StringBuilder binary = new StringBuilder();
        while (number > 0) {
            int remainder = number % 2;
            binary.insert(0, remainder);
            number /= 2;
        }
		return binary.toString();
	}
}
