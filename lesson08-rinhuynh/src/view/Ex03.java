package view;

import java.text.Normalizer;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = sc.nextLine();

        String output = Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");

        System.out.println("Chuoi sau khi xoa dau: " + output);
	  }
}