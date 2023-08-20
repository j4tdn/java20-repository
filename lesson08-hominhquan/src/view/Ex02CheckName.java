package view;

public class Ex02CheckName {
	public static void main(String[] args) {
		String name = "aDam Le vAN john Son"; 
		String result = lowerCaseOfOne(name);
		System.out.println(result);
	}
	
	private static String lowerCaseOfOne(String name) {
		StringBuilder result = new StringBuilder();
		
		String[] words = name.split(" ");
        for (String word : words) {
        	 if (!word.isEmpty()) { 
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                result.append(firstChar).append(restOfWord).append(" ");
        }
       }
        return result.toString();
	}
}
