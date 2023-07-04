package exercises1;
import java.util.Scanner;

public class IsPower {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter 2 numbers a,b: ");
		int a = ip.nextInt();
		int b = ip.nextInt();
		
		System.out.println(isPowerOf(a,b));
	}
	
	private static boolean isPowerOf(int a, int b) {
		if (a < b) {
			for (int i = 1; i < b; i++) {
				while (Math.pow(a, i) == b) {
					return true;
				}
			}
		} else {
			for (int i = 1; i < a; i++) {
				while (Math.pow(b, i) == a) {
					return true;
				}
			}
		}
		return false;
}
}
