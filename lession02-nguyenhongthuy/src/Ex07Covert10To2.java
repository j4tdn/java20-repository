import java.util.Scanner;

public class Ex07Covert10To2 {
	public static String reverseString(String input) {
		String output = "";
		for(int i=input.length()-1; i>=0; i--) {
			output += input.charAt(i);
			
		}
		return output;
	}
	public static String convert10To2(int n) {
		String result = "";
		while(n != 0) {
			result += String.valueOf(n%2);
			n /= 2;
		}
		
		return reverseString(result);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		System.out.println("n --> " + n);
		System.out.println("result --> " + convert10To2(n));
	}
}
