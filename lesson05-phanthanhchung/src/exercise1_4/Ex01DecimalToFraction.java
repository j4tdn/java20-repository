package exercise1_4;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex01DecimalToFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = 0;
        System.out.println("Nhập một số thập phân");
        for(int i = 3; i >= 0; i--){
            if(!sc.hasNextDouble() && i != 0) {
                System.out.println("Nhập một số thập phân, còn" + i + " lượt:");
                sc.nextLine();
            } else if(!sc.hasNextDouble() && i == 0){
                System.out.println("Hết lượt, thoát chương trình");
            }
            else {
                n = sc.nextDouble();
                break;
            }
        }

        getMinFract(n);
        sc.close();
    }

    public static void getMinFract(double decimal){
        String doubleAsString = String.valueOf(decimal);
        int indexOfDecimal = doubleAsString.indexOf(".");
        int lengthOfDecimal = doubleAsString.length() - indexOfDecimal - 1;
        int integerPart = (int)(doubleAsString.substring(0, indexOfDecimal).length());
        int decimalPart = (int)(doubleAsString.substring(indexOfDecimal+1).length());

        int nominator = (int) (decimal * Math.pow(10, decimalPart));
        int denominator = (int)(Math.pow(10, decimalPart));

        int gcd = 0;
        for(int i = 1; i <= Math.min(nominator, denominator); i++){
            if (nominator % i == 0 && denominator % i == 0){
                gcd = i;
            }
        }

        nominator /= gcd;
        denominator /= gcd;

        System.out.println("Phân số tối giản của " + decimal + " là: " + nominator + "/" + denominator);
    }
}
