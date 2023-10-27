package view.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import utils.StreamUtils;

public class Ex05FlatMap {
	public static void main(String[] args) {
		//Using list of cards
		List<List<String>> players = List.of(
				List.of("2 chuồn", "4 bích", "5 cơ"), // 1
				List.of("3 chuồn", "2 bích", "J cơ"), // 2
				List.of("4 chuồn", "6 bích", "3 cơ"), // 3
				List.of("5 chuồn", "3 bích", "9 cơ"), // 4
				List.of("6 chuồn", "9 bích", "2 cơ"), // 5
				List.of("7 chuồn", "K bích", "A cơ")  // 6
		);
		
		// Non-stream
		// Tìm quân bài 2 trong các người chơi
		for(int i = 0; i < players.size();i++) {
			for(int j = 0; j < players.get(i).size();j++) {
				if(players.get(i).get(j).contains("2")) {
					System.out.println("Player " + (i+1) + " has " + players.get(i).get(j));
				}
			}
		}
		
		 // Collection col -> col.stream() = Collection::stream
		
		//Stream<Collection<T>> --> flatMap(col -> col.stream)) --> return stream<T>
		//Stream and flatMap
		var remainingCards =  players.stream() //Stream<List<String>>
				//.map(list -> list.stream()) // Stream<Stream<String>>
				.flatMap(list -> list.stream()) //Stream<String>  -- Collection::stream
				.collect(Collectors.toSet());
		
		StreamUtils.generate("1. Remaining Cards", remainingCards);
		
		// using array
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8}
		};
		
		var streamToArray =  Arrays.stream(matrix) // Stream<int[]>
									.flatMapToInt(Arrays::stream) // IntStream -- a1D -> Arrays.stream(a1D)
									.toArray();
		Arrays.stream(streamToArray).forEach(num -> System.out.print(num + " "));
	}
}
