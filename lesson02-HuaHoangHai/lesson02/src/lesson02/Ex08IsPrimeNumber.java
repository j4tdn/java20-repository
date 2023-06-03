package lesson02;

import java.util.Scanner;

public class Ex08IsPrimeNumber {
	public static void main(String[] args) {
		
		 Scanner ip = new Scanner(System.in);
	        String numberAsText = "";
	        int count = 0;
	        int number = 0;

	        while (count < 5) {
	            System.out.print("Nhập vào N: ");
	            numberAsText = ip.nextLine();

	            if (!numberAsText.matches("-?\\d+")) {
	                System.out.println("Nhập sai vui lòng nhập lại.");
	                count++;
	                continue;
	            }

	            number = Integer.parseInt(numberAsText);

	            if (number <= 0) {
	                System.out.println("Số N phải là số nguyên dương.");
	                count++;
	                continue;
	            }
	            boolean isPrime = checkPrimeNumber(number);
	            System.out.println(number + " -->" + isPrime);
	            return;
	        }

	        System.out.println("Nhập sai 5 lần. Kết thúc");
	}
	 public static boolean checkPrimeNumber(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
}
