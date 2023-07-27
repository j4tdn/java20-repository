package Ex01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws RuntimeException {
        Scanner scanner = new Scanner(System.in);

        double a = 0, b = 0;

        while (true) {
            try {
                System.out.print("Nhập hệ số a: ");
                a = Double.parseDouble(scanner.nextLine());
                System.out.print("Nhập hệ số b: ");
                b = Double.parseDouble(scanner.nextLine());

                // Trường hợp a == 0 là phương trình bậc nhất, không có nghiệm x
                if (a == 0) {
                    throw new RuntimeException("Số a phải khác 0");
                }

                break; // Thoát khỏi vòng lặp nếu nhập thành công

            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }

        double x = -b / a;
        System.out.println("Kết quả x = " + x);

        scanner.close();
    }
}
