package view;

import java.util.Scanner;

public class Test03 {

    public static String revert(String s){
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        for(String str: split){
            char[] c = str.toCharArray();
            for(int i=0; i<c.length; i++){
                sb.append(c[i]);
            }
            sb.append(" ");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        System.out.print("RS: " + revert(s));
    }

}