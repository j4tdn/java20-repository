package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Nhap a: ");
                double a = sc.nextDouble();
                System.out.print("Nhap b: ");
                double b= sc.nextDouble();
                if(a==0){
                    System.out.println("phuong trinh vo nghiem");
                }else{
                    double x=-b/a;
                    System.out.println("Nghiem x = " + x);
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Loi: Hay nhap so thuc");
                sc.nextLine();
            }
        }

    }
    
}
