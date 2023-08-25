import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
        String input = "xyz";
        List<String> permutations = findPermutations(input);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
	
    public static List<String> findPermutations(String input) {
        List<String> permutations = new ArrayList<>();

        if (input == null || input.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char firstChar = input.charAt(0);
        String remainingString = input.substring(1);
        List<String> words = findPermutations(remainingString);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String permutation = insertCharAt(word, firstChar, i);
                permutations.add(permutation);
            }
        }

        return permutations;
    }

    private static String insertCharAt(String word, char c, int position) {
        String start = word.substring(0, position);
        String end = word.substring(position);
        return start + c + end;
    }
}