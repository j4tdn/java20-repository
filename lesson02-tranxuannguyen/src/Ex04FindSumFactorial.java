import java.util.Random;

public class Ex04FindSumFactorial {
	public static int findFactorial(int n) {
		int factorial = 1;
		while(n != 0) {
			factorial *= n;
			n--;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Random rd = new Random();
		long sumFactorial = 0l;
		for(int i = 1; i <= 4; i++) {
			int n = rd.nextInt(9,21);
			System.out.print(n + " ");
			sumFactorial += findFactorial(n);
		}
		System.out.println("\nsumFactorial = " + sumFactorial);
	}
}
