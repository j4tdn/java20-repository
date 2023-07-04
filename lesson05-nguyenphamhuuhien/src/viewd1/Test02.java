package viewd1;

import java.util.Scanner;

public class Test02 {
    public static boolean isSpecialNumber(int n){
        if(n==1){
            return true;
        }
        int sum=0;
        for(int i=1; i<n ; i++){
            sum+=i;
            if(sum==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isSpecialNumber(n)){
            System.out.println(n + " la so chinh phuong");
        }else{
            System.out.println(n + " khong phai la so chinh phuong");
        }
    }

}
