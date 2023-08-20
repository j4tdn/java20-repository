package view;

import java.util.Scanner;

public class Test07 {

    public static int doDaiDayCon(String s){
        int count=1;
        int max=0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count+=1;
                max = Math.max(max, count);
            }else{
                count=1;
            }
        }
        return max;
    }

    private static int doDaiNganDayCon(String s) {
        int min=1;
        int count=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count+=1;
            }else{
                count-=1;
                min = Math.min(min, count);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("max: " + doDaiDayCon(s));
        System.out.println("min: " + doDaiNganDayCon(s));
    }
}
