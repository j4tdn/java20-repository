package lesson02;

import java.util.Scanner;

public class Ex02PowerOf2 {
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

	            boolean isPower = checkPower(number);
	            System.out.println(number + " --> " + isPower);
	            return;
	        }

	        System.out.println("Nhập sai 5 lần. Kết thúc");
		}
	 private static boolean checkPower(int N) {
      if (N <= 0) {
          return false;
      }

      while (N > 1) {
          if (N % 2 != 0) {
              return false;
          }
          N = N / 2;
      }
      return true;
  }
}

