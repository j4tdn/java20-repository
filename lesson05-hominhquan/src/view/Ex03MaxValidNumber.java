package view;

public class Ex03MaxValidNumber {
	public static void main(String[] args) {
		String n = "12abu02muzk586cyx";
		System.out.println("maxNumber = " + MaxValidNumber(n));
	}
	
	private static int MaxValidNumber(String n) {
		int maxNumber = 0;
		String[] numbers = n.split("[^\\d]+");//tách chuỗi thành các phần tử con số
		
		for(String number: numbers) {
			if(number.matches("\\d+")) {
				int current = Integer.parseInt(number);
				if(current > maxNumber) {
					maxNumber = current;
				}
			}
		}
		return maxNumber;
	}
}
