package lesson02;

public class Ex07RadixConversion {

	public static void main(String[] args) {
		System.out.println("Result : " + convertDecToBin(100));
		
	
	}
	public static String convertDecToBin(Integer input) {
		String n = input.toBinaryString(input);
		return n;
	}

}
