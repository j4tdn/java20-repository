package view;

import java.util.Scanner;

public class Ex06 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int a, b, c;
	        do {
	        	System.out.print("Nhap so nguyen a: ");
		        a = sc.nextInt();
		        System.out.print("Nhap so nguyen b: ");
		        b = sc.nextInt();
		        System.out.print("Nhap so nguyen c: ");
		        c = sc.nextInt();
				if(a<=0||b<=0||c<=0 ) {
					System.out.println("Nhap lai");
					a++;
					b++;
					c++;
				}else {
					break;
				}
			}while(a>0||b>0||c>0);
	        int soLonNhat = timSoLonNhat(a, b, c);
	        int soNhoNhat = timSoNhoNhat(a, b, c);
	        System.out.println("So lon nhat la: " + soLonNhat);
	        System.out.println("So nho nhat la: " + soNhoNhat);
	    }
	 private static int timSoLonNhat(int a, int b, int c) {
	        int soLonNhat = a;
	        if (b > soLonNhat) {
	            soLonNhat = b;
	        }
	        if (c > soLonNhat) {
	            soLonNhat = c;
	        }
	        return soLonNhat;
	    }
	 public static int timSoNhoNhat(int a, int b, int c) {
	        int soNhoNhat = a;
	        if (b < soNhoNhat) {
	            soNhoNhat = b;
	        }
	        if (c < soNhoNhat) {
	            soNhoNhat = c;
	        }
	        return soNhoNhat;
	    }
}

