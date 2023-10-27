package view.stream;

import java.util.List;

import bean.Pair;
import utils.StreamUtils;

public class Ex03Itermediate_TerminalOperation {

	public static void main(String[] args) {
		
		var sequences = List.of("aa", "b","3","4","2", "dc", "d", "ft");
		
		var pairs = sequences.stream()
				 .filter(seq -> seq.matches("[a-z]+"))
				 .map(seq-> new Pair<>(seq, seq.length()))
				 .limit(4)
				 .toList();
		StreamUtils.generate("1. pair", pairs);
	}
}
