package Bai01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double decimalFraction;
        boolean validInput = false;

        do {
            System.out.print("Nhập số thực có phần thập phân khác 0: ");
            decimalFraction = scanner.nextDouble();
            if (decimalFraction != 0) {
                validInput = true;
            } else {
                System.out.println("Số không hợp lệ! Vui lòng nhập lại.");
            }
        } while (!validInput);

        String minFraction = getMinFract(decimalFraction);
        System.out.println("Phân số tối giản của số thập phân " + decimalFraction + " là: " + minFraction);
    }

    public static String getMinFract(double decimalFraction) {
        int denominator = 1;
        int numerator = (int) (decimalFraction * Math.pow(10, getDecimalPlaces(decimalFraction)));

        int gcd = findGCD(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;

        String fraction = numerator + "/" + denominator;

        return fraction;
    }

    public static int getDecimalPlaces(double number) {
        String numberString = Double.toString(Math.abs(number));
        int decimalIndex = numberString.indexOf('.');
        if (decimalIndex < 0) {
            return 0;
        }
        return numberString.length() - decimalIndex - 1;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
