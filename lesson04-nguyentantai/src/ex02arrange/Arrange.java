package ex02arrange;

import java.util.List;
import java.util.ArrayList;

public class Arrange {
	public static void main(String[] args) {
		int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};
		List<Integer> divisibleBy7 = new ArrayList<>();
		List<Integer> divisibleBy5 = new ArrayList<>();
		List<Integer> otherNumbers = new ArrayList<>();
		
		// Gom tất cả các số chia hết cho 7, gom tất cả các số chia hết cho 5. Gom tất cả các số vừa chia hết cho 5 vừa chia hết cho 7 và các số còn lại.
		for (int number : numbers) {
			if(number % 7 == 0 && number % 5 == 0) {
				otherNumbers.add(number);
			}else if(number % 7 == 0) {
				divisibleBy7.add(number);
			}else if(number % 5 == 0){
				divisibleBy5.add(number);
			}else otherNumbers.add(number);
		}
		
		// Output
		System.out.print("Output: ");
		for (int number : divisibleBy7) {
			System.out.print(number + ", ");
		}
		for (int number : otherNumbers) {
			System.out.print(number + ", ");
		}
		for (int number : divisibleBy5) {
			System.out.print(number + ", ");
		}
	}
}
