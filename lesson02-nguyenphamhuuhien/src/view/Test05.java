package view;

import java.util.Scanner;

public class Test05 {
	public static boolean pali(int n){
        int right=0;
        while(n>right){
            int digit=n%10;
            right=right*10+digit;
            n/=10;
            if(n==right || n/10==right){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check=0;
        int n=0;
        while(check<5){
            System.out.print("Nhập số nguyên dương n: ");
            try{
                n=Integer.parseInt(sc.nextLine());
                if(n<0){
                    System.out.println("Không phải là số nguyên");
                    check++;
                    continue;
                }
                break;
            }catch(Exception e){
                System.out.println("Không phải là số nguyên");
                check++;
            }
        }
        System.out.print("Kết quả: "+pali(n));
    
    }

}
