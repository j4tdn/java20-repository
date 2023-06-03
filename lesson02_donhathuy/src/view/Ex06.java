package view;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("...Find max Min 3 number of [0,20)..");
		System.out.print("--Enter a: ");
		int a = enterNumber();
		System.out.print("--Enter b: ");
		int b = enterNumber();
		System.out.print("--Enter c: ");
		int c = enterNumber();
		int max2So = Integer.max(a, b);
		int max3So = Integer.max(max2So, c);
		int min2So = Integer.min(a, b);
		int min3So = Integer.min(min2So, c);
		System.out.println("Max: " + max3So + "\n"
							+ "Min: "+ min3So);
		
		
	}
	private static int enterNumber() {
		Scanner ip = new Scanner(System.in);
		int number =0;
		for (int count = 1; count <= 1000; count++) {
			try {
				number = ip.nextInt();
				if (number < 0 | number >= 20) {
					System.out.println("Erroring, enter again!");
				} else break;
			} catch (Exception e) {
				System.out.println("Erroring, enter again!");
				ip.nextLine();
			} 
		}
		return number ;
	}

}
