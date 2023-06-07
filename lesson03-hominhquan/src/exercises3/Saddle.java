package exercises3;

import java.util.Random;
import java.util.Scanner;

public class Saddle {
	private static Random rd = new Random();
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("nhap so hang m: ");
		int m = ip.nextInt();
		System.out.print("nhap so cot n: ");
		int n = ip.nextInt();
		
		int[][] maxtrix = new int[m][n];
		
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần tử A[" + i + "][" + j + "]:");
                maxtrix[i][j] = rd.nextInt(1, 100);
            }
        }
		for (int i = 0; i < maxtrix.length; i++) {
            for (int j = 0; j < maxtrix[i].length; j++) {
                System.out.print(maxtrix[i][j] + " ");
            }
            System.out.println();
        }
      
		 
		
		for(int i = 0; i< m; i++) {
			for(int j = 0; j < n; j++) {
				int element = maxtrix[i][j];
				boolean isSaddle = true;
				
				for(int k =0; k< m; k ++) {
					if(maxtrix[i][k] < element) {
						isSaddle = false;
						break;
					}
				}
				if(isSaddle) {
					for(int k =0; k< n; k++) {
						if(maxtrix[k][j] > element) {
							isSaddle = false;
							break;
						}
					}
				}
				if(isSaddle) {
					System.out.println("phan tu yen ngua la: " + element+ "tai vi tri("+i+", " + j+")");
				}
			}
		
		}
	}
	
	
	
}
