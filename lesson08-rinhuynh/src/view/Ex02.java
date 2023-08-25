package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		StringBuilder res = new StringBuilder();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter here: ");
		String input = in.nextLine();
		String[] arr = input.split(" ");
		for(String i:arr) {
			i = i.replaceAll("[^a-zA-Z]", "");
			String[] temp = i.toLowerCase().split("");
			temp[0] =  temp[0].toUpperCase();
			StringBuilder subRes = new StringBuilder();
			for(String j:temp) {
				subRes.append(j);
			}
			res.append(subRes + " ");

		}
		System.out.println(res);

		
	}
	
}