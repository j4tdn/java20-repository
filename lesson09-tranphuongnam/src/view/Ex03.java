package view;

public class Ex03 {
	public static void main(String[] args) {
		String s1 = "Welcome     to    JAVA20            class    Quyen       Phan";
		String revertedString = revert(s1);
		System.out.println("String before reverse --> " + s1);
		System.out.println("String after reverse --> " + revertedString);
	}
	
	public static String revert(String s) {
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        
        String result = "";
        String[] tokens = s.split(" ");
    
        for(String token : tokens) {
        	String reverseToken = "";
        	for(int i = token.length() - 1; i >= 0;i--) {
        		reverseToken += token.charAt(i);
        	}
        	result += reverseToken + " ";
        }
        return result.trim();
	}
	
	
}
