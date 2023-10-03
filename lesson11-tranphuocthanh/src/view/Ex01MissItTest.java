package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import utils.FileUtils;

public class Ex01MissItTest {

	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test01-missit.txt");
		
		
		
		System.out.println(getWinner(lines));
	}
	
	private static int getWinner(List<String> lines) {
		
		Map<Integer, Integer> store = new HashMap<>();
		Map<Integer, Integer> pointMatch = new HashMap<>();
		pointMatch.put(1, 3);
		pointMatch.put(2, 2);
		pointMatch.put(3, 1);
		
		for (int i = 1; i < lines.size(); i++) {
			String[] tokens = lines.get(i).replace(" ", "").split("");
			int chosen = Integer.parseInt(tokens[0]);
			for (int j = 1; j <= chosen; j++) {
				Integer point = Integer.parseInt(tokens[j]);
				if (pointMatch.containsKey(tokens[j])) {
					store.put(point, 4 + pointMatch.get(tokens[j]) - j);
				} else {
					store.put(point, 4 - j);
				}
			}
		}
		
		Map.Entry<Integer, Integer> maxEntry = null;
		for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
				maxEntry = entry;
			}
		}
		
		return maxEntry.getKey();
	}
}
