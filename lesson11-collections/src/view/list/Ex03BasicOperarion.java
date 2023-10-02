package view.list;

import static util.CollectionUtils.generateStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex03BasicOperarion {
	public static <T> void main(String[] args) {
		//primitive type
		
		//object type --> single(Integer, String) - custom(Item, Student)
		//new ArrayList<String>() -> dynamic array supports add, remove, get, set
		List<String> sequences = new ArrayList<String>();
		sequences.add("sgk-12");
		sequences.add("sgk-46");
		sequences.add("sgk-15");
		sequences.add("stk-23");
		sequences.add("stk-43");
		sequences.add("sgk-175");
		/*
		System.out.println("size --> " + sequences.size());
		sequences.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		});
		*/
		//sequences.forEach(seq -> System.out.println(seq));
		generateStrings("sequences", sequences);
		
		//remove
		//-> Duyệt từng phần tử trong list, nếu phần tử nào 'equals' với phần tử cần remove 
		//-> Chỉ remove phần tử đầu tiên equals với phần tử cần remove
		
		//remove with condition
		//+	index
		//+ each
		
		//phân biệt for, foreach với iterator
		//	+ for each: truy cập bất kì phần tử nào đang for
		//	+ iterator: truy cập bất kì phần tử nào đang duyệt đến
		sequences.remove("sgk-46");
		sequences.removeIf(seq -> {
			return seq.startsWith("stk");
		});
		generateStrings("sequences", sequences);
		
		//get(i)
		//set(i, newValue)
		
		//contains (lưu ý)
		//--> duyệt từng phần tử trong list, nếu equals thì trả về true
		boolean hasSgk12 = sequences.contains("sgk-12");
		System.out.println("hasSgk12 --> " + hasSgk12);
		
		generateStrings("sequences", sequences);
		
		System.out.println("\n================constructor=================\n");
		//java.util.Array#ArrayList
		//unsupportedOperationException --> add, remove
		//support --> get, set
		List<Integer> numbers = Arrays.asList(5, 2, 3, 4, 5);
		//numbers.add(5);
		//numbers.remove(5);
		numbers.set(3, 99);
		
		System.out.println("numbers --> " + numbers.size());
		
		List<String> letters = List.of("a", "h", "g", "h");
		//ImmutableCollections --> immutable list
		//unsupportedOperationException --> add, remove list
		
	}
}
