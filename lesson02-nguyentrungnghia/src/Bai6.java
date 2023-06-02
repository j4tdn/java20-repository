import java.util.Scanner;

public class Bai6 {
	private static int max(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		else if (b >= a && b >= c)
			return b;
		else 
			return c;
	}
	
	private static int min(int a, int b, int c) {
		if (a <= b && a <= c)
			return a;
		else if (b <= a && b <= c)
			return b;
		else 
			return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			System.out.print("Nhập a: ");
			String numberA = sc.nextLine();
			
			System.out.print("Nhập b: ");
			String numberB = sc.nextLine();
			
			System.out.print("Nhập c: ");
			String numberC = sc.nextLine();
			
			if (!numberA.matches("\\d+") || !numberB.matches("\\d+") || !numberC.matches("\\d+")) 
				check = true;
			else {
				int a = Integer.parseInt(numberA);
				int b = Integer.parseInt(numberB);
				int c = Integer.parseInt(numberC);
				if ((a > 19 || a < 0) || (b > 19 || b < 0) || (c > 19 || c < 0))
					check = true;
				else {
					check = false;
					System.out.println("Max: " + max(a, b, c));
					System.out.println("Min: " + min(a, b, c));
				}
			}
		} while (check);
	}
}
