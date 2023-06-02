import java.util.Scanner;

public class Bai3 {
	private static int factorial(int a) {
		if (a == 1)
			return 1;
		else
			return a * factorial(a - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số nguyên dương: ");
		int f = sc.nextInt();
		System.out.println(f + "! = " + factorial(f));
	}
}
