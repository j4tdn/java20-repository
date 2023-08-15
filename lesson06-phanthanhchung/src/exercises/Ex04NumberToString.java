package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class Ex04NumberToString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Enter a number n: ");
                int n = sc.nextInt();
                System.out.println(numConvert(n));
                sc.nextLine();
                if(n == 0) break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        System.out.println(">--Program finished --<");
    }

    public static String numConvert(int number) throws Exception{
        HashMap<Integer, String> conversion = new HashMap<>();

        int tempnum = number;
        int digits = 0;

        conversion.put(0,"Không");
        conversion.put(1,"Một");
        conversion.put(2, "Hai");
        conversion.put(3, "Ba");
        conversion.put(4, "Bốn");
        conversion.put(5, "Năm");
        conversion.put(6, "Sáu");
        conversion.put(7, "Bảy");
        conversion.put(8, "Tám");
        conversion.put(9, "Chín");

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        if(number == 0){
            digits = 1;
        } else {
            while (true) {

                tempnum /= 10;
                if (tempnum > 0) digits++;
                else if (tempnum == 0) {
                    digits++;
                    break;
                }
            }
        }

        int[] arr = new int[digits];

        String line = String.valueOf(number);
        if(number != 0)
            line = line.replaceFirst("^0+", "");

        for(int i = 0; i < digits; i++) {
            arr[i] = Integer.parseInt(String.valueOf(line.charAt(i)));
        }

        if(digits == 3) {
            sb.append(conversion.get(arr[0]));
            sb.append(" trăm ");
            sb2.append(conversion.get(arr[0]));
            sb2.append(" trăm ");
            if(line.charAt(1) == '1'){
                sb.append("mười ");
                if(line.charAt(2) == '1')
                    sb.append("một");
                if(line.charAt(2) == '5')
                    sb.append("lăm");
                if(line.charAt(2) == '0')
                    sb.append(".");
                else
                    sb.append(conversion.get(arr[2]).toLowerCase());
            }
            else if(line.charAt(1) == '0') {
                if(line.charAt(2) == '0')
                    sb.append(".");
                else {
                    sb.append("linh || lẻ ");
                    sb.append(conversion.get(arr[2]).toLowerCase());
                }
            }
            else{
                sb2.append(conversion.get(arr[1]).toLowerCase()).append(" ");
                sb.append(conversion.get(arr[1]).toLowerCase()).append(" ");
                sb.append("mươi ");
                if(line.charAt(2) == '5')
                    sb.append("lăm");
                else if (line.charAt(2) == '0')
                    sb.append(".");
                else if (line.charAt(2) == '1') {
                    sb2.append("mốt");
                    sb.append("mốt");
                } else {
                    sb2.append(conversion.get(arr[2]).toLowerCase());
                    sb.append(conversion.get(arr[2]).toLowerCase());
                }
                if(line.charAt(2) != '0')
                    sb.append(" || ").append(sb2);
            }
        } else if (digits == 2) {
            if(line.charAt(0) == '1'){
                sb.append("Mười ");
                if(line.charAt(1) == '5'){
                    sb.append("lăm");
                } else if(line.charAt(1) == '0'){
                    sb.append(".");
                } else
                    sb.append(conversion.get(arr[1]).toLowerCase());
            } else{
                sb.append(conversion.get(arr[0]).toLowerCase()).append(" ");
                sb.append("mươi ");
                if(line.charAt(1) == '5')
                    sb.append("lăm");
                else if (line.charAt(1) == '0')
                    sb.append(".");
                else if (line.charAt(1) == '1') {
                    sb.append("mốt");
                } else {
                    sb.append(conversion.get(arr[1]).toLowerCase());
                }
            }
        } else if (digits == 1) {
            sb.append(conversion.get(arr[0]));
            sb.append(".");
        } else {
            throw new Exception("Number must have [1-3] digits");
        }

        return sb.toString();
    }
}