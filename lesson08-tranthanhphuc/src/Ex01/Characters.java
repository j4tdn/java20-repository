package Ex01;

import java.util.Scanner;

public class Characters {

 public static void main(String[] args) {
	 
     Scanner sc = new Scanner(System.in);

     System.out.println("Nhập vào một chuỗi kí tự bất kì:");
     String chuoi = sc.nextLine();

     System.out.println("Mỗi kí tự trên một dòng:");
     for (int i = 0; i < chuoi.length(); i++) {
         System.out.println(chuoi.charAt(i));
     }

     System.out.println("Mỗi từ trên một dòng:");
     String[] tu = chuoi.split(" "); // Tách chuỗi theo khoảng trắng
     for (String s : tu) {
         System.out.println(s);
     }

     System.out.println("Chuỗi đảo ngược theo kí tự:");
     String daoNguocKiTu = "";
     for (int i = chuoi.length() - 1; i >= 0; i--) {
         daoNguocKiTu += chuoi.charAt(i); // Nối kí tự từ cuối lên đầu
     }
     System.out.println(daoNguocKiTu);

     System.out.println("Chuỗi đảo ngược theo từ:");
     String daoNguocTu = "";
     for (int i = tu.length - 1; i >= 0; i--) {
         daoNguocTu += tu[i] + " "; 
     }
     System.out.println(daoNguocTu);
 	}
}
