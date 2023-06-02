import java.util.Scanner;

public class Ex06FindMinMaxOF3Number {
	public static int MaxOf3Number(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
	public static int MinOf3Number(int[] numbers) {
		int min = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (number < min) {
				min = number;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap a: ");
        int a = scanner.nextInt();

        while (a >= 20) {
            System.out.print("Nhap lai a");
            a = scanner.nextInt();
        }

        System.out.print("Nhap b: ");
        int b = scanner.nextInt();

        while (b >= 20) {
            System.out.print("Nhap lai b: ");
            b = scanner.nextInt();
        }

        System.out.print("Nhap c: ");
        int c = scanner.nextInt();

        while (c >= 20) {
            System.out.print("Nhap lai c: ");
            c = scanner.nextInt();
        }
        int[] numbers = new int[] {a,b,c};
		System.out.println("So lon nhat la: " +MaxOf3Number(numbers));
		System.out.println("So nho nhat la: " +MinOf3Number(numbers));
	}
}
