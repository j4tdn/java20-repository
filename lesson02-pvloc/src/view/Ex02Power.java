package view;

import utils.InputUtils;

public class Ex02Power {
	public static void main(String[] args) {
		int n = InputUtils.input("Enter N(N > 0)", 3,0);
		
		System.out.println("is power of 5 --> " + isPower(n));
	}
	
    private static boolean isPower(int n) {
    	while(n != 1) {
    		if(n% 2 !=0) {
    			return false;
    		}
    	
    	n /=2;
    	
	}
    return true;
}
}