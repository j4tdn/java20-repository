package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static utils.StreamUtils.*;

public class Ex05MapFlatMap {
	public static void main(String[] args) {
		// using list of cards
		List<List<String>> players = List.of(
				List.of("2 chuồn", "3 bích", "5 cơ"), // player1
				List.of("5 chuồn", "6 bích", "7 cơ"), // player2
				List.of("7 chuồn", "10 bích", "K cơ"), // player3
				List.of("8 chuồn", "J bích", "2 cơ") // player4
		);
		
		/*
		 
		 */
		
		var cards = players.stream() // Stream<List<String>>
			// .map(list -> list.stream()) // Stream<Stream<String>>
			.flatMap(list -> list.stream()) // Stream<String>
			.filter(card -> card.startsWith("2")) // Stream<String>
			.collect(Collectors.toSet()); // Set<String>
		
		generate("1. Cards", cards);
		
		// using array
		int[][] matrix = {{1,2}, {3,4,5}, {6,7}};
		
		int[] elements = Arrays.stream(matrix) // stream<int[]>
			.flatMapToInt(a1D -> Arrays.stream(a1D)) //stream
			.toArray();
		
		System.out.println("2. Matrix elements {");
		Arrays.stream(elements)
			.forEach(el -> System.out.print("  " + el));
		System.out.println("\n}");
	}
}
