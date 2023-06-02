import java.util.Scanner;

public class Ex07ConvertBase10ToBase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = "";

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binaryNumber = remainder + binaryNumber;
            decimalNumber = decimalNumber / 2;
        }

        System.out.println("So nhi phan tuong ung la: " + binaryNumber);
    }
}