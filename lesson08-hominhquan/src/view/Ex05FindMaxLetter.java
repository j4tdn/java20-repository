package view;

public class Ex05FindMaxLetter {
	public static void main(String[] args) {
		String s = "aaabbbaaabbaaaaa";
		checkMax(s);
		checkMin(s);
	}
	
	private static void checkMax(String text) {
		int count = 0;
		int startIndex = 0;
		int index = 0;
		int longest = Integer.MIN_VALUE;
		for(int i = 1; i < text.length(); i++) {
			if(text.charAt(i-1) == text.charAt(i)) {
				count++;
				if(longest < count) {
					longest = count;
				}
			}else {
				count = 1;
				index = i;
			}
			startIndex = index;
		}
		System.out.println("do dai lon nhat trong day con la: " 
		+ longest + " " + text.substring(startIndex, (startIndex + longest)) + " " + startIndex);
	}
	private static void checkMin(String text) {
		int count = 0;
		int startIndex = 0;
		int index = 0;
		int shortest = Integer.MAX_VALUE;
		for(int i = 1; i < text.length(); i++) {
			if(text.charAt(i-1) != text.charAt(i)) {
				
				count++;
				if(shortest > count) {
					shortest = count;
					index = i;
				}
			
			}else {
				count = 1;
				
			}
			
		}
		startIndex = index;
		System.out.println("do dai nho nhat trong day con la: " 
		+ shortest + " " + text.substring(startIndex, (startIndex + shortest)) + " " + startIndex);
	}
}
