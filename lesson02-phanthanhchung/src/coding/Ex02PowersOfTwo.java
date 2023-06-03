package coding;

import java.util.Scanner;

public class Ex02PowersOfTwo {
    public static void main(String[] args) {
        int number;
        int attempts;
        Scanner in = new Scanner(System.in);
        boolean choice;

        // Nhap vao 5 lan, neu da qua 5 lan ma nhap sai thi ket thuc chuong trinh
        for(attempts = 1; attempts <= 5; attempts++)
        {
            System.out.println("Please enter a positive integer: ");
            choice = in.hasNextInt();
            if(!choice){
                System.out.printf("Invalid input. Please Try Again. (%d attempt(s) left)", 5 - attempts);
                System.out.println();
                in.nextLine();
            }
            else{
                number = in.nextInt();
                if(number <= 0 ) {
                    System.out.printf("Invalid input. Please Try Again. (%d attempt(s) left)", 5 - attempts);
                    System.out.println();
                    in.nextLine();
                }
                else {
                    System.out.println(checkPowersOfTwo(number));
                    break;
                }
            }

        }
    }

    static boolean checkPowersOfTwo(int n){
        while(n != 1){
            if(n % 2 == 1)
                return false;
            n /= 2 ;
        }
        return true;
    }
}