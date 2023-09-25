package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {
	public static void main(String[] args) {
		// khai báo: mãng là kiểu đối tượng
		// từng phần tử là: 
		
		// nguyên thủy 
		int[] numbers = new int[3];
		char[] letters = {'a','b', 'c'};
		modify(letters);
		
		System.out.println("number: " + Arrays.toString(numbers));
		System.out.println("letter: " + Arrays.toString(letters));
		
		
		// đối tượng
		Integer[] ids = new Integer[5];
		String[] words = {"test", "hello", "welcome"};
		
		System.out.println("ids: " + Arrays.toString(ids));
		System.out.println("words: " + Arrays.toString(words));
	}
	private static void modify(char[] letters) {
		letters[1] = 'z';
	}
	
	
}
