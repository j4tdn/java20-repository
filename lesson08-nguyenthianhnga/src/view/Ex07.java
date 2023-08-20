package view;

public class Ex07 {
	public static void main(String[] args) {
		String s= "aaabaaabbaaaaa";
		int max = 1;
		int min =Integer.MAX_VALUE;
		int count =1;
		char prev = s.charAt(0);
		for(int i=1; i<s.length();i++)
		{
			char current =s.charAt(i);
			if(current ==prev)
			{
				count++;
				
			}else {
				max = Math.max(max, count);
				min = Math.min(min, count);
				count =1;
			}
			prev =current;
			
		}
		max = Math.max(max, count);
		min = Math.min(min, count);
		System.out.println("Max length: "+max);
		System.out.println("Min length: "+min);
		
	}
}
