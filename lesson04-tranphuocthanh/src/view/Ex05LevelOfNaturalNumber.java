package view;

import java.util.Arrays;

import javax.naming.ldap.SortControl;
import javax.naming.ldap.SortKey;

public class Ex05LevelOfNaturalNumber {
	public static void main(String[] args) {
		Integer[] a = { 8, 5, 9, 20 };

		
		countDivisors(a);
	}

	private static void countDivisors(Integer[] a) {
		int[] storage = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= Math.sqrt((double) a[i]); j++) {
				if (a[i] % j == 0)
					count += 2;
			}
			if (Math.sqrt((double) a[i]) * Math.sqrt((double) a[i]) == a[i]) {
				count--;
			}
			storage[i] = count;
		}
		Arrays.sort(storage);
		for (int i = 0; i< storage.length; i++) {
			System.out.println(a[i].intValue());
		}
	}
	
}
