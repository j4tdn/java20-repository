package view;

import java.util.Scanner;

public class Test03 {
	public static int fact(int n){
        int rs=1;
        if(n==0 || n==1){
            return rs;
        }
        for(int i=2; i<=n; i++){
            rs*=i;
        }
        return rs;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int n=sc.nextInt();
        System.out.print("Kết quả: "+fact(n));
    }

}
