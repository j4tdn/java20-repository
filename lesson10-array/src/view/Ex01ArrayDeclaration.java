// Strategy pattern
// 

package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {
	public static void main(String[] args) {
		//Biến mảng luôn là kiểu đối tượng
		//Khai báo từng phần tử 
		
		//Nguyên thủy
		int[] numbers = new int[3];
		char[] letters = {'a','b','c'};
		System.out.println("number --> " + Arrays.toString(numbers) + " --> " + numbers.getClass());
		System.out.println("letters --> " + Arrays.toString(letters)+ " --> " + letters.getClass());
		modify(letters);
		System.out.println();
		System.out.println("letters --> " + Arrays.toString(letters)+ " --> " + letters.getClass());
		
		//Đối tượng
		Integer[] ids = new Integer[5];
		String[] words = {"Java","text","good"};
		
		System.out.println("ids --> " + Arrays.toString(ids)+ " --> " + ids.getClass());
		System.out.println("words -->" + Arrays.toString(words)+ " --> " + words.getClass());
	}
	
	private static void modify(char[] letters) {
		letters[1] = 'z';
	}
}
