package view;

public class Ex04Sum {
	public static void main(String[] args) {
		int[] n = {4, 2, 6, 6, 4, 15, 1};
		System.out.println("tong la = " + sum(n));
	}
	
	private static int sum(int[] n) {
		int maxValue = n[0];
		int minValue = n[0];
		int result = 0;
		int duplicate = n[0];
		for(int i = 0; i < n.length - 1 ; i++) {
			if(n[i] < minValue) {
				minValue = n[i];
			}
			if(n[i] > maxValue) {
				maxValue = n[i];
			}
			if(n[i] == duplicate) {
				duplicate = n[i];
			}
		}
		 for (int i = 0; i < n.length -1; i++) {
	            if (n[i] != minValue && n[i] != maxValue) {
	            	if(n[i] == duplicate) {
	            		continue;
	            	}
	            	result += n[i];
	            	
	            }
	        }
		 return result;
	}
}
