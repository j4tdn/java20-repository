package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.FileUtils;

public class Ex01MissItTest {
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test01missit.txt");

		int loop = Integer.parseInt(lines.get(0));

		Map<Integer, Integer> mapScore = new HashMap<>(); //Map này lưu điểm
		Map<Integer, Integer> map1stPlaces = new HashMap<>(); // Map này lưu số lần thí sinh đứng đầu
		Map<Integer, Integer> map2ndPlaces = new HashMap<>();// Map này lưu số lần thí sinh đứng nhì
		for (int i = 1; i <= loop; i++) {
			String[] parts = lines.get(i).split(" ");
			for (int j = 1; j <= Integer.parseInt(parts[0]); j++) {
				Integer contestantId = Integer.parseInt(parts[j]);
				if (mapScore.containsKey(contestantId)) {
					mapScore.put(contestantId, mapScore.get(contestantId) + 4 - j); // Nếu đã đc chấm điểm thì + thêm điểm của GK khác
				} else {
					mapScore.put(contestantId, 4 - j); // Chưa đc chấm thì cứ vị trí 1 được 3, 2 được 2, 3 được 1 điểm
				}

				// Số lần thí sinh xuất hiện ở vị trí 1
				if (j == 1) {
					map1stPlaces.put(contestantId, map1stPlaces.getOrDefault(contestantId, 0) + 1);
				}
				
				// Số lần hí sinh xuất hiện ở vị trí 2
				if (j == 2) {
					map2ndPlaces.put(contestantId, map2ndPlaces.getOrDefault(contestantId, 0) + 1);
				}
			}
		}

		// Số điểm lớn nhất của các thí sinh
		int maxScore = -1;
		List<Integer> tempChampions = new ArrayList<>();
		for (var entry : mapScore.entrySet()) {
			int key = entry.getKey();
			int score = 0;
			for (var subEntry : mapScore.entrySet()) {
				if (subEntry.getKey() == key) {
					score += subEntry.getValue();
				}
			}
			if (score >= maxScore) {
				maxScore = score;
			}
		}

		//Thí sinh nào có số điểm bằng số điểm max -> ứng cử viên vô địch
		for (var entry : mapScore.entrySet()) {
			if (entry.getValue() == maxScore) {
				tempChampions.add(entry.getKey());
			}
		}

		// 1 thí sinh sẽ win luôn, hơn 1 thì xét tiếp
		if (tempChampions.size() == 1) {
			System.out.println(tempChampions.get(0)); // Champion of MISS IT TÉT
		} else {
			int maxFirstPlaceVotes = -1; // Số lần đứng đầu nhiều nhất trong danh sách ứng cử viên vô địhc
			int maxSecondPlaceVotes = -1;// Số lần đứng nhì nhiều nhất ...
			
			// Duyệt qua các ứng cử viên vô địch để tìm số lần đứng nhất và nhì nhiều nhất của các ứng cử viên vô địch
			for (int candidateId : tempChampions) {
			
				int cur1st = map1stPlaces.getOrDefault(candidateId, 0);
	
				int cur2st = map2ndPlaces.getOrDefault(candidateId, 0);
								
				if (cur1st > maxFirstPlaceVotes) {
					maxFirstPlaceVotes = cur1st;
				}
				
				if(cur2st > maxSecondPlaceVotes) {
					maxSecondPlaceVotes = cur2st;
				}
			}

			// Duyệt qua các ứng cử vô địch 1 lần nữa và tìm
			// Nếu trùng số lần đứng nhất -> kiểm tra số lần đứng nhì, nếu trùng tiếp thì cả 2 vô địch
			for (int candidateId : tempChampions) {
				if (map1stPlaces.getOrDefault(candidateId, 0) == maxFirstPlaceVotes) {
					if(map2ndPlaces.getOrDefault(candidateId, 0) == maxSecondPlaceVotes) {
						System.out.print(candidateId + " ");
					}
				}
			}
		}
	}
}
