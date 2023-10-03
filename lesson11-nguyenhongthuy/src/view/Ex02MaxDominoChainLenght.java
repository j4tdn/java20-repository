package view;

import java.util.Arrays;

import utils.FileUtils;
import utils.CollectionUtils;

public class Ex02MaxDominoChainLenght {
	public static void main(String[] args) {
		
		int a = getResult("test02-domino.txt");
		System.out.println(a);
	}

	private static int getResult(String path) {
		
		var list = FileUtils.readLines(path);

		int n = Integer.parseInt(list.get(0));
		int[] height = CollectionUtils.convertToArray(list.get(1));	//lấy mảng height là dòng thứ 2
		int[] pos = CollectionUtils.convertToArray(list.get(2));	//lấy mảng pos là dòng thứ 3
		int[] arrCount = new int[n];				//mảng lưu số domino ngã theo chuỗi -> lấy max
		int running = 0;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for(int j = i; j < n - 1; j++) {
				int distance = pos[j+1] - pos[j];
				if (height[i] >= distance) {		
					count++;
				}else {
					break;
				}
			}
			arrCount[running++] = count;
		}
		Arrays.sort(arrCount);
		return arrCount[n - 1];
	}

}
