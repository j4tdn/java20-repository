

import java.util.Random;
/*
 * Viết chương trình in ra 5 số nguyên ngẫu nhiên từ 20 đến 30  [20, 30]
 * Yêu cầu: 5 số ngẫu nhiên không được trùng nhau
 */
public class Ex10Print5RandomNumber {
	public static void main(String[] args) {
		Random rd = new Random();
		int a;
		int[] arrRand = new int[5];
		
		arrRand[0] = rd.nextInt(20, 31);
		
		for(int i = 1; i < 5; i++) {
			a = rd.nextInt(20, 31);
			int j = 0;
			while(j < i) {
				if(a != arrRand[j])
					j++;
				else {
					a = rd.nextInt(20, 31);
					j = 0;
				}
			}
			arrRand[i] = a;
		}
		
		for (int i : arrRand) {
			System.out.println(i);
		}
	}
}
