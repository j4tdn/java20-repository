package coding;

import java.util.Scanner;

public class Ex01MultiplicationOfTwo {
    public static void main(String[] args) {
        int number;
        int attempts;
        Scanner in = new Scanner(System.in);
        boolean choice;

        // Nhap vao 5 lan, neu da qua 5 lan ma nhap sai thi ket thuc chuong trinh
        for(attempts = 1; attempts <= 5; attempts++)
        {
            System.out.println("Please enter an integer number: ");
            choice = in.hasNextInt();
            if(!choice){
                if(attempts < 5) {
                    System.out.printf("Invalid input. Please Try Again. (%d attempt(s) left)", 5 - attempts);
                    System.out.println();
                    in.nextLine();
                } else {
                    System.out.println("Invalid input. Program terminated.");
                    break;
                }
            }
            else {
                number = in.nextInt();
                System.out.println(checkMultiplicationOfTwo(number));
                break;
            }
        }
    }

    static boolean checkMultiplicationOfTwo(int n){
        if(n % 2 == 0)
            return true;
        else
            return false;
    }
}