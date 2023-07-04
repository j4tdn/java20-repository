package viewd1;

import java.util.Scanner;

public class Test03 {
    public static int getMaxValidNumber(String s){
        String[] strSplit = s.split("\\D+"); //  \\D+ là tách các dòng chữ thành số
        int max = Integer.MIN_VALUE;
        for(String str:strSplit){
            if(!str.isEmpty()){ // trường hợp trong mảng có chuỗi rỗng ["", "892", "1234", "2"]
                int n = Integer.parseInt(str); // chuyển kiểu string sang số
                max = Math.max(n, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("So lon nhat trong chuoi la: " + getMaxValidNumber(s));
    }

}