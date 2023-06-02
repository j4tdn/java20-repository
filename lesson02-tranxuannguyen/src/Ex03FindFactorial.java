import java.util.Scanner;

public class Ex03FindFactorial {
	public static int findFactorial(int n) {
		int factorial = 1;
		while(n != 0) {
			factorial *= n;
			n--;
		}
		return factorial;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		System.out.println("N! = " +findFactorial(n));
	}

}
