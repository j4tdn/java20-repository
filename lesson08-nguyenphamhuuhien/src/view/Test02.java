package view;

import java.util.Locale;
import java.util.Scanner;

public class Test02 {

    public static String vietHoaChuCaiDauTien(String s){
        StringBuilder sb = new StringBuilder();
        String[] split = s.split(" ");
        for(String s1 : split){
            if(s1.charAt(0)>='a' && s1.charAt(0)<='z'){
                sb.append(Character.toUpperCase(s1.charAt(0)));
            }else{
                sb.append(s1.charAt(0));
            }
            String sub = s1.substring(1);
            for(int i=0; i<sub.length(); i++){
                if(sub.charAt(i)>='A' && sub.charAt(i)<='Z'){
                    sb.append(Character.toLowerCase(sub.charAt(i)));
                }else{
                    sb.append(sub.charAt(i));
                }
            }
            sb.append(" ");
        }
        sb.setLength(sb.length()-1);

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Ket qua: " + vietHoaChuCaiDauTien(s));
    }

}
