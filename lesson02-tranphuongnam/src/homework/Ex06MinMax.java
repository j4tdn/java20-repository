package homework;

import java.util.Scanner;

public class Ex06MinMax {
	public static void main(String[] args) {
		String aText,bText,cText = null;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter value of a: ");
			aText = sc.nextLine();
			System.out.print("Enter value of b: ");
			bText = sc.nextLine();
			System.out.print("Enter value of c: ");
			cText = sc.nextLine();
			if(!aText.matches("\\d+") || !bText.matches("\\d+")|| !cText.matches("\\d+")) {
				System.out.println("Invalid number of a, b or c, try again!");
			} else {
				int maxNumber = findMax(Integer.parseInt(aText), Integer.parseInt(bText), Integer.parseInt(cText));
				int minNumber = findMin(Integer.parseInt(aText), Integer.parseInt(bText), Integer.parseInt(cText));
				System.out.println("Số lớn nhất: " + maxNumber);
				System.out.println("Số nhỏ nhất: " + minNumber);
				
			}
		} while(!aText.matches("\\d+") || !bText.matches("\\d+")|| !cText.matches("\\d+"));
		
		sc.close();
		System.out.println("Exit");
	}
	
	private static int findMax(int a, int b, int c) {
		return findMax(findMax(a, b), c);
	}
	
	private static int findMax(int a, int b) {
		return a > b ? a : b;
	}
	
	private static int findMin(int a, int b, int c) {
		return findMin(findMin(a, b), c);
	}
	
	private static int findMin(int a, int b) {
		return a < b ? a : b;
	}
}
