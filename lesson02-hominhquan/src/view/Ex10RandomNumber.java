package view;

import java.util.Random;

public class Ex10RandomNumber {
	private static Random rd = new Random();
	private static String[] storage = new String[5];
	public static void main(String[] args) {
		int count = 0;
		do {
			String number = "" + rd.nextInt(20,31);
			if(isExitsts(storage, number, count)) {
				continue;
			}
			storage[count++] = number;
			System.out.println(number);
		}while(count < 5);
	}
	private static boolean isExitsts(String[] storage,String number, int count) {
		for(int i = 0; i< count; i++) {
			if(storage[i].equals(number)) {
				return true;
			}
		}
		return false;
	}
}
