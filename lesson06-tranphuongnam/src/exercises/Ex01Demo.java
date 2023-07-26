package exercises;

import java.util.Scanner;

public class Ex01Demo {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("ax + b = 0");
		boolean loop = false;// Nhập sai
		int a = 0; int b = 0;
		while(!loop) {
			try {
				a = manualInput("Enter a: ");
				if(a == 0) {
					throw new ArithmeticException();
				}
				loop = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		loop = false;
		while(!loop) {
			try {
				b = manualInput("Enter b: ");
				loop = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("X --> " + -b/a);
	}

	public static int manualInput(String text) {
		System.out.print(text);
		return Integer.parseInt(sc.nextLine());
	}
}
