package view.stream;

import java.util.List;

import bean.Pair;

public class Ex03IntermediateTerminalOperations {

	public static void main(String[] args) {
		var sequences = List.of("a", "haf", "1", "op", "8", "dasfd", "daf");
		
		var pairs = sequences.stream()
				 .filter(seq -> {
					 System.out.println("test filter: " + seq);
					 return seq.matches("[a-z]+");
				 })
				 .map(seq -> new Pair<>(seq, seq.length())) // Stream<Pair>
				 .limit(4);
				 //.collect(Collectors.toList());
		System.out.println("done");
		//generate("1.Pairs", pairs);
	}

}
