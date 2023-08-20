package view;

import java.util.Scanner;

public class Test01 {

    public static String daoNguocTheoTu(String s){
        StringBuilder sb = new StringBuilder();
        return sb.append(s).reverse().toString();
    }

    public static String daoNguocTheoKyTu(String s){
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for(String s1 : str){
            sb.append(s1 + " ");
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu: ");
        String s = sc.nextLine();
        System.out.println("Nhap ky tu: ");
        String s1 = sc.nextLine();
        System.out.println("Chuoi dao nguoc theo tu: " + daoNguocTheoTu(s));
        System.out.print("Chuoi dao nguoc theo ky tu: " + daoNguocTheoKyTu(s1));
    }

}

