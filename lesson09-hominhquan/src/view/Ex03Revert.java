package view;


public class Ex03Revert {
	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		String result = revert(input);
		
		String output = reverseAllWords(result);
		System.out.println(output);
	}
	
	private static String revert(String input) {
		return input.replaceAll("\\s+", " ");	
	}
	
	public static String reverseAllWords(String input) {
        String[] words = input.split("\\s+");
        
        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length / 2; j++) {
                char temp = chars[j];
                chars[j] = chars[chars.length - 1 - j];
                chars[chars.length - 1 - j] = temp;
            }
            words[i] = new String(chars);
        }

        return String.join(" ", words);
    }
}
