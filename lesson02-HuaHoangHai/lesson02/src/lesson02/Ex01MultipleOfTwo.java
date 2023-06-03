package lesson02;

import java.util.Scanner;

public class Ex01MultipleOfTwo {
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

            boolean isEven = (number % 2 == 0);
            System.out.println(number + " --> " + isEven);
            return;
        }

        System.out.println("Nhập sai 5 lần. Kết thúc");
    }
}

