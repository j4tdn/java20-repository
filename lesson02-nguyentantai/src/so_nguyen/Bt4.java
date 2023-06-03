package so_nguyen;

import java.util.Random;
import java.util.Scanner;

public class Bt4 {
	public static void main(String[] args) {
		Random rd = new Random();
		int a = rd.nextInt(11) + 10;
		int b = rd.nextInt(11) + 10;
		int c = rd.nextInt(11) + 10;
		int d = rd.nextInt(11) + 10;
		
		int S = a + b + c + d;
		System.out.println("S = " +a+ " + " +b+ " + " +c+ " + " +d+ " = " + S );
	}
}
