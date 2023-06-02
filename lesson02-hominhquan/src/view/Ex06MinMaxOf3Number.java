package view;

import java.util.Scanner;

public class Ex06MinMaxOf3Number {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		int maxAttempts = 5;
        int attempts = 0;
        int a = 0;
        int b = 0;
        int c = 0;

        while (attempts < maxAttempts) {
        	System.out.print("nhap a: ");
			String input1 = ip.nextLine(); 
			System.out.print("nhap b: ");
			String input2 = ip.nextLine(); 
			System.out.print("nhap c: ");
			String input3 = ip.nextLine(); 

            try {
                a = Integer.parseInt(input1);
                b = Integer.parseInt(input2);
                c = Integer.parseInt(input3);
                int[] numbers = new int[] {a,b,c};
        		
        		System.out.println("so lon nhat la: " + MaxOfThreeNumber(numbers));
        		System.out.println("so nho nhat la: " + MinOfThreeNumber(numbers));
                break;
            } catch (NumberFormatException e) {
                System.out.println("nhap loi: vui long nhap lai.");
            }

            attempts++;
        }

        if (attempts == maxAttempts) {
            System.out.println("Đã vượt quá số lần nhập. Thoát chương trình.");
        }
			
	}

	private static int MaxOfThreeNumber(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;

	}
	private static int MinOfThreeNumber(int[] numbers) {
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		return min;

	}

}
