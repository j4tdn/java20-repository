package coding;

import java.util.Scanner;

public class Ex08PrimeNumberCheck {
    public static void main(String[] args) {
        int number;
        int attempts;
        Scanner in = new Scanner(System.in);
        boolean choice;

        // Nhap vao 5 lan, neu da qua 5 lan ma nhap sai thi ket thuc chuong trinh
        for (attempts = 1; attempts <= 5; attempts++) {
            System.out.println("Please enter a positive integer to check if it's a prime: ");
            choice = in.hasNextInt();
            if (!choice) {
                System.out.printf("Invalid input. Please Try Again. (%d attempt(s) left)", 5 - attempts);
                System.out.println();
                in.nextLine();
            } else {
                number = in.nextInt();
                if (number <= 0) {
                    System.out.printf("Invalid input. Please Try Again. (%d attempt(s) left)", 5 - attempts);
                    System.out.println();
                    in.nextLine();
                } else {
                    System.out.println(checkPrime(number));
                    break;
                }
            }
        }
    }
    public static boolean checkPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number == 2) return true;
            else if (number % i == 0) return false;
        }
        return true;
    }
}
