package viewd1;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(getMinFract());
    }

    public static String getMinFract() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double number = 0.0;
        double decimalPart = 0.0;

        while (count < 3) {
            try {
                System.out.print("Nhập vào một số thực có phần thập phân khác 0: ");
                number = Double.parseDouble(scanner.nextLine());
                decimalPart = number - (int) number;
                if (decimalPart != 0) {
                    break;
                } else {
                    System.out.println("Phần thập phân bằng 0. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ. Vui lòng nhập lại.");
            }

            count++;
        }

        if (count == 3) {
            scanner.close();
            return "Bạn đã nhập sai số quá 3 lần. Kết thúc chương trình.";
        }

        int numerator = (int) (decimalPart * Math.pow(10, String.valueOf(decimalPart).length()));
        int denominator = (int) Math.pow(10, String.valueOf(decimalPart).length());
        int greatestCommonDivisor = gcd(numerator, denominator);
        numerator /= greatestCommonDivisor;
        denominator /= greatestCommonDivisor;

        scanner.close();

        return "Phân số tối giản của " + number + " là " + numerator + "/" + denominator + ".";
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
