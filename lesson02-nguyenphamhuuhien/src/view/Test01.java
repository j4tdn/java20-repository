package view;

import java.util.Scanner;

public class Test01 {
    public static boolean checkMultiOfTwo(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check=0;//Kiểm tra số lần nhập
        int n=0;

        while(check<5){
            System.out.print("Nhập 1 số nguyên dương: ");
            try{
                n=Integer.parseInt(sc.nextLine());
                if(n<=0){
                    System.out.println("Đây không phải là số nguyên dương, vui lòng nhập lại!");
                    check++;
                    continue;
                }

                break;
            }catch (NumberFormatException e){
                System.out.println("Đây không phải là số nguyên dương, vui lòng nhập lại!");
                check++;
            }
        }
        System.out.println("Kết quả: "+checkMultiOfTwo(n));
    }
}
