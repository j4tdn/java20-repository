package view.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import utils.StreamUtils;

public class Ex05MapFlatMap {

	public static void main(String[] args) {
		
		//using list<Integer>
		List<List<String>> players = List.of(
					List.of("2 chuon, 3 bich, 5 co"),//player 1
					List.of("4 chuon, 7 ro, 8 bich"),//player 2
					List.of("3 ro, 2 co, 10 bich")//player 3
				);
		// tim nhung quan 2 
		//List<List<String>> --> covert list<String>
		var	remainingCards =players.stream()
			   .flatMap(Collection::stream)//stream<String>
			   .filter(card -> card.startsWith("2"))
			   .collect(Collectors.toSet());
		StreamUtils.generate("1. Remaining Card", remainingCards);
		
		//using array
		int[][] matrix = {{1,2,3},{3,2,4}, {4,6,5}};
		Arrays.stream(matrix)
			  .flatMapToInt(ele-> Arrays.stream(ele))
			  .forEach(element-> System.out.print(" " + element));
	}
}
