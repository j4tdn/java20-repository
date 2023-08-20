package view;

import java.util.Scanner;

public class Test04 {

    public static boolean kiemTraSNT(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean soNguyenToTuongDuong(int n, int m){
        for(int i=2; i<n; i++){
            if(n%i==0 && m%i==0){
                if(kiemTraSNT(i)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(soNguyenToTuongDuong(n, m)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    
    }
}
