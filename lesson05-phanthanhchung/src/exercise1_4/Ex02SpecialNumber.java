package exercise1_4;

import java.util.Scanner;

public class Ex02SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Nhập một số nguyên để kiểm tra số đặc biệt: ");
        n = sc.nextInt();

        System.out.println(isSpecialNumber(n) ? "Đây là số đặc biệt " : " Đây không phải là số đặc biệt");
        sc.close();
    }

    public static boolean isSpecialNumber(int n){
        int i = 1;
        while(n > -1){
            n -= i;
            i++;

            if(n == 0){
                return true;
            }
        }
        return false;
    }
}
