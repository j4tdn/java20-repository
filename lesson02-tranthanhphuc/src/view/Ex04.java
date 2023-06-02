package view;

import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(11) + 10;
        int b = random.nextInt(11) + 10;
        int c = random.nextInt(11) + 10;
        int d = random.nextInt(11) + 10;

        int tongGiaiThua = tongGiaiThua(a, b, c, d);
        System.out.println("A: "+a +" B: "+b+" C: "+c+" D: "+d);
        System.out.println("Tong giai thua: " + tongGiaiThua);
    }
	private static int giaiThua(int N) {
        int giaiThua = 1;
        if (N < 0) {
            System.out.println("Nhap lai:");
        } else if (N == 0) {
            giaiThua = 1;
        } else {
            for (int i = 1; i <= N; i++) {
                giaiThua *= i;
            }
        }
        return giaiThua;
    }
	private static int tongGiaiThua(int a, int b, int c, int d) {
        int tongGiaiThua = giaiThua(a) + giaiThua(b) + giaiThua(c) + giaiThua(d);
        return tongGiaiThua;
    }
}
