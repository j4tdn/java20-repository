package Ex01MissIT;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class Ex01MissIT {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Nhap 
		System.out.print("Nhap so luong ban giam khao: ");
		int N = sc.nextInt();
		int[][] scoreTable = new int [N][4];
		for (int i = 0; i < N; i++) {
			System.out.print("Nhap so luong thi sinh "
					+ "giam khao thu " + (i+1) + " chon: ");
			scoreTable[i][0] = sc.nextInt();
			for (int j = 1; j <= scoreTable[i][0]; j++) {
				System.out.print("Nhap id thi sinh duoc chon thu " + j + ": ");
				scoreTable[i][j] = sc.nextInt();
			}
		}
//		for (int i = 0; i < N; i++) {
//		for (int j = 0; j < 4; j++) {
//			System.out.print(scoreTable[i] [j] + " ");	
//		}
//		System.out.println();
//	}
		
		// Tinh
		HashMap<Integer, ScoreContestant> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < 4; j++) {
				if(scoreTable[i][j] == 0) {
					break;
				}
				if(map.containsKey(scoreTable[i][j]) == false) {
					ScoreContestant scContestant = new ScoreContestant();
					scContestant.setId(scoreTable[i][j]);
					map.put(scContestant.getId(), scContestant);
				}
				
				if(j == 1) {
					map.get(scoreTable[i][j]).plusScore(3);
				}
				if(j == 2) {
					map.get(scoreTable[i][j]).plusScore(2);
				}
				if(j == 3) {
					map.get(scoreTable[i][j]).plusScore(1);
				}
				map.get(scoreTable[i][j]).plusVote();	
			}	
		}
		
		// Sap xep
		Collection<ScoreContestant> values = map.values();
        ScoreContestant[] array = values.toArray(new ScoreContestant[values.size()]);
        Arrays.sort(array, 
				comparing(ScoreContestant::getScore, reverseOrder())
				.thenComparing(ScoreContestant::getnVote, reverseOrder()));
     
        // Lay
        System.out.print("Contestant win: ");
        for (int i = 0; i < array.length; i++) {
			if(array[i].getScore() == array[0].getScore() && array[i].getnVote() == array[0].getnVote()) {
				System.out.print(array[i].getId());
			};
			
		}
	}
}
