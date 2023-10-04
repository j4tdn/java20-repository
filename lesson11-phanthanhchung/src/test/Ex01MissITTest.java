package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import utils.FileUtils;

public class Ex01MissITTest{
	static class Contestant implements Comparable<Contestant>{
		private int ID;
		private int Firstplace;
		private int Secondplace;
		private int Score;
		
		public int getID() {
			return this.ID;
		}
		
		public int getFirstplace() {
			return this.Firstplace;
		}
		
		public int getSecondplace() {
			return this.Secondplace;
		}
		
		public int getScore() {
			return this.Score;
		}
		
		public Contestant(int ID) {
			this.ID = ID;
			this.Secondplace = 0;
			this.Firstplace = 0;
			this.Score = 0;
		}
		
		private void increment(int n) {
			if(n == 2) {
				this.Firstplace++;
				this.Score += 3;
			} else if(n == 3) {
				this.Secondplace++;
				this.Score += 2;
			} else if(n == 4) {
				this.Score++;
			}
		}
		
		@Override
		public int compareTo(Contestant other) {
			if(this.getFirstplace() != other.getFirstplace()) {
				return other.Firstplace - this.Firstplace;
			} else {
				return other.Secondplace - this.Secondplace;
			}
		}
		
		@Override
		public boolean equals(Object obj) {
			if(this == obj)
				return true;
			if(obj == null || getClass() != obj.getClass()) {
				return false;
			}
			Contestant other = (Contestant) obj;
			return (Firstplace == other.getFirstplace()) && (Secondplace == other.getSecondplace());
			
		}
	}
	
	public static void main(String[] args) {
		List<String> lines = FileUtils.readLines("test01-missit.txt");
		System.out.println("Input:");
		lines.forEach(line -> System.out.println(line));
		System.out.println("\nOutput:");
		showFirstRank(lines);
		
	}
	
	public static void showFirstRank(List<String> lines) {
		HashMap<Integer, Contestant> ranking = new HashMap<>();
		int judgesNum = Integer.parseInt(lines.get(0).trim());
		
		int[] numArray;
		
		for(int i = 1; i <= judgesNum; i++) {
			String lineN = lines.get(i).trim();
				numArray = Arrays.stream(lineN.trim().split(" ")).mapToInt(Integer::parseInt).toArray();
				for(int j = 1; j < numArray[0] + 1; j++) {
					int id = numArray[j];
					ranking.putIfAbsent(id, new Contestant(id));
					ranking.get(id).increment(4 - j);
				}
			}
		
		int maxScore = Collections.max(ranking.values(), Comparator
				.comparingInt(Contestant::getScore))
				.getScore();
		
		List<Contestant> maxScorers = ranking.values().stream()
	        .filter(c -> c.getScore() == maxScore)
	        .collect(Collectors.toList());
	    	    
	    Collections.sort(maxScorers);
	    
	    for(int i = 0; i < maxScorers.size(); i++) {
	    	if(i == 0)
	    		System.out.print(maxScorers.get(i).getID() + " ");
	    	else {
	    		if(maxScorers.get(i).equals(maxScorers.get(0)));
	    		System.out.print(maxScorers.get(i).getID() + " ");
	    	}
	    }
	}
}

