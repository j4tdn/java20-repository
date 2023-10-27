package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex06Matching {

	public static void main(String[] args) {
		
		var numbers = List.of(1, 2, 3, 4, 5,7, 5, 10 ,12, 4);
		var isDiviby10 = numbers.stream()
				.allMatch(nb -> nb % 10 == 0);
		System.out.println(isDiviby10);
		
		Optional<Integer> findfirs4 = numbers.stream()
				.filter(nb -> nb % 4 == 0)
				.findFirst();
		if(findfirs4.isPresent()) {
			System.out.println("find first divisible 4: " + findfirs4.get());
		}
	}
	
}

