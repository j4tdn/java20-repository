package view.stream;

import java.util.List;
import java.util.stream.Collectors;

import bean.Pair;
import static utils.StreamUtils.*;

public class Ex03IntermediateTerminalOperation {
	public static void main(String[] args) {
		var sequences = List.of("aaaa", "b", "2", "c", "d", "e", "1");
		var pairs = sequences.stream()
					.filter(seq -> {
						System.out.println("FILTER: " + seq);
						return seq.matches("[a-z]+");
					}) //Stream<String>
					.map(seq -> new Pair<>(seq, seq.length())) //Stream<Pair>
					.limit(4) //Stream<Pair>
					.collect(Collectors.toList()); //List<Pair>
		generate("1.Pairs", pairs);
	}
}
