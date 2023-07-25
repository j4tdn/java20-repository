import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		
		int a;
		double b;
		double x;
		
		while (true) {
			try {
				System.out.print("a = ");
				a = Integer.parseInt(ip.nextLine());
				
				System.out.print("b = ");
				b = Integer.parseInt(ip.nextLine());
				
				System.out.println(a + "X + " + b + " = 0");
				
				try {
					if (a != 0) {
						if (b == 0)
							System.out.println("X = 0");
						else {
							x = -b / a;
							System.out.println("X = " + x);
						}
					}
					else {
						if (b == 0)
							System.out.println("Phương trình có VSN");
						else
							x = -(int)b / a;
					}
				} catch (ArithmeticException e) {
					System.out.println("Phương trình vô nghiệm");
				}
				
				break;
			} catch (NumberFormatException e) {
				System.out.println("Hệ số không hợp lệ");
			}
		}
		
		ip.close();
		
	}
	
}