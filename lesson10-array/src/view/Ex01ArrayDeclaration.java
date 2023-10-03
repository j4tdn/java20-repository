package view;

import java.util.Arrays;

public class Ex01ArrayDeclaration {
	public static void main(String[] args) {
		// Biến mảng luôn là kiểu đối tượng
		// Khai báo từng phần tử là
		
		// Nguyên thủy
		int[] numbers = new int[3];        // {0, 0, 0}       --> length = 3
		char[] letters = {'a', 'b', 'c'};  // {'a', 'b', 'c'} --> length = 3
		
		modify(letters);
		
		System.out.println("numbers --> " + Arrays.toString(numbers) + " ---> " + numbers.getClass().getName());
		System.out.println("letters --> " + Arrays.toString(letters) + " ---> " + letters.getClass().getName());
		
		System.out.println();
		
		// Đối tượng 
		Integer[] ids = new Integer[5];                // {null, null, null, null, null} --> length = 5
		String[] words = {"text", "hello", "welcome"}; // {"text", "hello", "welcome"}   --> length = 3
		
		System.out.println("ids --> " + Arrays.toString(ids) + " ---> " + ids.getClass().getName());
		System.out.println("words --> " + Arrays.toString(words) + " ---> " + words.getClass().getName());
	}
	
	private static void modify(char[] letters) {
		letters[1] = 'z';
	}
}
