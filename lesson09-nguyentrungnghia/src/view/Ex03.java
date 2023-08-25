package view;

public class Ex03 {

	public static void main(String[] args) {
		String sb = "  Welcome to JAVA10 class  ";
		System.out.println(format(sb));
	}

	private static StringBuilder format(String sb) {
		String s1 = sb.trim();
		
		String[] s2 = s1.split("\\s+");
		
		StringBuilder[] s3 = new StringBuilder[s2.length];
		
		for (int i = 0; i < s3.length; i++) 
			s3[i] = new StringBuilder(s2[i]).reverse();
		
		StringBuilder s4 = new StringBuilder();
		for (StringBuilder word : s3) 
			s4.append(word + " ");
		
		return s4;
	}

}
