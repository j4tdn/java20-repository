package view;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

    public static String[] getLargestNumbers(String ...ss){
        String[] str = new String[ss.length];

        for(int i=0; i<ss.length; i++){
            String[] split = ss[i].split("\\D+");
            int max = 0;
            for(String number : split){
                if(number.isEmpty()){
                    continue;
                }
                int num = Integer.parseInt(number);
                max = Math.max(max, num);
            }
            str[i] = String.valueOf(max);
        }
        Arrays.sort(str);
        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] string = new String[n];
        for (int i = 0; i < n; i++) {
            string[i] = scanner.nextLine();
        }

        String[] results = getLargestNumbers(string);
        for (String result : results) {
            System.out.println(result);
        }
    
    }
}