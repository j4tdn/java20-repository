package exercises.exam;

import java.util.Scanner;

public class Ex02LargestNumbers {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Please enter n: ");
		int n = Integer.parseInt(sc.nextLine());
		String[] stringarray = new String[n];
		
		for(int i = 0; i < stringarray.length; i++) {
			System.out.print("Enter string number " + i + " :"); 
			stringarray[i] = sc.nextLine();
		}
		
		for(String s : getLargestNumbers(stringarray)) {
			System.out.print(s + ", ");
		}
	}

	private static String[] getLargestNumbers(String ... ss) {
		String[] largestNumbers = new String[ss.length];
		int largestNum = 0;
		
		String[] numbers;
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].isBlank() || ss[i].isEmpty()) {
				largestNumbers[i] = "0";
				continue;
			}
			largestNum = 0;
			numbers = ss[i].split("[a-z]+");
			for(String num : numbers) {
				if(!num.isEmpty() && Integer.parseInt(num) > largestNum)
					largestNum = Integer.parseInt(num);
			}
			largestNumbers[i] = String.valueOf(largestNum);
		}
		
		return largestNumbers;
	}
}
