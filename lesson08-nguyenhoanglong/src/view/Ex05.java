package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter S1:");
		s1 = sc.nextLine();
		 System.out.println("Enter S2:");
		s2 = sc.nextLine();
 
		int maxLength = 0;
		int point = 0;
		for (int i = 0; i < s1.length(); i++) {
			int j = i +1;
			while(s2.contains(s1.substring(i, j))) {
				int length = j - i;

				if(length > maxLength) {
					maxLength = length;
					point = i;
				}
				
				if(j == s1.length()) {
					break;
				}
				j++;
			}
		}
		
		System.out.println("Output: " + s1.substring(point, point + maxLength));
	}

}
