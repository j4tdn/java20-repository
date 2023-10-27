package view.stream;

import java.util.List;
import java.util.Optional;

public class Ex07Optional {
	public static void main(String[] args) {
		List<Integer> numbers =List.of(1,2,3,4,5,6);
		Optional<Integer> optMaxOdd = findMaxOddNumber(numbers);
		if(optMaxOdd.isPresent())
		{
			System.out.println("max odd number : "+optMaxOdd.get());
		}
		else {
			System.out.println("Not exits");
		}
		System.out.println("max odd number :"+findMaxOddNumber(numbers));
	}
	//inValue
	private static Optional<Integer> findMaxOddNumber(List<Integer> numbers)
	{
		Integer max = null;
		int running =0;
		for(Integer number: numbers)
		{
			if(running ==0 && number % 2!=0)
			{
				max =number;
				running++;
			}
			else {
				
			}
		}
		return Optional.ofNullable(max);
	}
}
