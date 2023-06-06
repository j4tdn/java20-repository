package controlling;

import java.util.Scanner;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		int n =8;
		int i =1;
		while (i <= 8) {
			System.out.println(i + " ");
			i++;
		}
		
		System.out.println("\n==============\n");
		
		i = 1;
		while(true) {
			System.out.println(i + " ");
			i++;
			if (i == 8) {
				break;
			}
		}
		System.out.println("\n==============\n");
		i =1;
		do {
			System.out.println(i + " ");
			i++;
		}while(i<8);
		
		System.out.println("\n==============\n");
		Scanner ip = new Scanner(System.in);
		int number = Integer.parseInt(ip.nextLine());
		
		System.out.println("is prime: " +isPrime(number));
	}
	private static boolean isPrime(int number) {
		boolean isPrime =true;
		for (int i=2; i<= Math.sqrt(number); i++) {
			if (number % i ==0) {
			return true;
			}
		}
		return isPrime;
	}

}
