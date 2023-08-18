package view;

import bean.StringInfo;

public class Ex07LongestRepeatedCharacter {

	public static void main(String[] args) {
		String sequence = "aaabaaabbaaaaa";

		System.out.println(findLongestRepeatedCharacter(sequence));
		System.out.println(findShortestRepeatedCharacter(sequence));
	}

	private static StringInfo findShortestRepeatedCharacter(String sequence) {
		int minLength = sequence.length();
		String minString = "";
		int index = 0;
		int running = 1;
		for (int i = 1; i < sequence.length(); i++) {
			if (sequence.charAt(i - 1) == sequence.charAt(i)) {
				running++;
			} else {
				if (running < minLength) {
					minLength = running;
					index = i - minLength;
					minString = sequence.substring(index, index + minLength);
				}
				running = 1;
			}

		}

		return new StringInfo(minLength, minString, index);
	}

	private static StringInfo findLongestRepeatedCharacter(String sequence) {
		int maxLength = 1;
		String maxString = "";
		int index = 0;
		int running = 1;
		for (int i = 1; i < sequence.length(); i++) {
			if (sequence.charAt(i - 1) == sequence.charAt(i)) {
				running++;
				if (running > maxLength) {
					maxLength = running;
					index = i - maxLength + 1;
					maxString = sequence.substring(index, index + maxLength);
				}
			} else {
				running = 1;
			}

		}

		return new StringInfo(maxLength, maxString, index);
	}
}
