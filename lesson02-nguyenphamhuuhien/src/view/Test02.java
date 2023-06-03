package view;

import java.util.Scanner;

public class Test02 {
    public static boolean checkPowOfTwo(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int check=0;
        while(check<5){
            try {
                System.out.print("Nhập 1 số nguyên dương: ");
                n=Integer.parseInt(sc.nextLine());
                if(n<0){
                    System.out.println("Không phải số nguyên dương, vui lòng nhập lại!");
                    check++;
                    continue;
                }
                break;
            }catch (Exception e){
                System.out.println("Không phải số nguyên dương, vui lòng nhập lại!");
                check++;
            }
        }
        System.out.print("Kết quả: "+checkPowOfTwo(n));
    }
}

