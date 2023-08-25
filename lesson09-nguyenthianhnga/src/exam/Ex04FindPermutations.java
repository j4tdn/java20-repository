package exam;

import java.util.ArrayList;
import java.util.List;

public class Ex04FindPermutations {
	public static void main(String[] args) {
		String input = "xyz";
		List<String> permutations = find(input);
		System.out.println("---- Permutations " + input + ":");
		for (String permutation : permutations) {
			System.out.println("\t" + permutation);
		}
	}

	private static List<String> find(String input) {
		List<String> permutations = new ArrayList<String>();
		findPermutations("", input, permutations);
		return permutations;

	}

	private static void findPermutations(String prefix, String remaining, List<String> permutations) {
		int length = remaining.length();
		if (length == 0) {
			permutations.add(prefix);

		} else {
			for (int i = 0; i < length; i++) {
				String newP = prefix + remaining.charAt(i);
				String newR = remaining.substring(0, i) + remaining.substring(i + 1);
				findPermutations(newP, newR, permutations);
			}
		}
	}
}
