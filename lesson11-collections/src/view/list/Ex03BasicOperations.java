package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static utils.CollectionUtils.*;

public class Ex03BasicOperations {
	
	public static void main(String[] args) {
		
		// Primitive Type
		
		// Object Type --> Single(Integer, String) or Custom(Item, Student)
		
		// new ArrayList<>() --> Dynamic array supports CRUD
		List<String> sequences = new ArrayList<>();
		
		// add
		sequences.add("sgk-12");
		sequences.add("sgk-46");
		sequences.add("sgk-829");
		sequences.add("stk-88");
		sequences.add("stk-99");
		sequences.add("sgk-175");
		sequences.add("sgk-829");
		
		//=========================================================================================//
		
		/*
		  remove(Object o)
	 		 Duyệt từng phần tử trong List, nếu phần tử nào equals với phần tử cần remove => remove
	 		 => Chỉ remove phần tử đầu tiên equals với phần tử cần xoá
	 	*/
		sequences.remove("sgk-829");
		
		/* 
		  Phân biệt foreach với iterator:
				+ foreach : truy cập bất kỳ phần tử nào đang for
				+ iterator: truy cập phần tử khi iterator đang duyệt đến (tuần tự)
		*/
		sequences.removeIf(seq -> seq.startsWith("stk"));
		
		//=========================================================================================//
		
		// get(int index)
		
		//=========================================================================================//
		
		// set(index, newValue)
		
		//=========================================================================================//
		
		boolean hasSgk12 = sequences.contains("sgk-12");
		System.out.println("hasSgk12 --> " + hasSgk12);
		
		generateStrings("sequences", sequences);
		
		System.out.println("\n========== CONSTRUCTOR ==========\n");
		
		List<Integer> numbers = Arrays.asList(5, 2, 4, 5, 2, 2);
		// numbers.add(2);
		// numbers.remove(2);
		// KHÔNG HỖ TRỢ add, remove
		numbers.set(0, 9);
		System.out.println(numbers.toString());
		
		//=========================================================================================//
		
		List<String> letters = List.of("a", "b", "c", "d");
		letters.add("zzz");
		
		/* 
		// java.util.Array#ArrayList (fixed size(length))
		
		System.out.println("numbers --> " + numbers.size());
		
		// ImmutableCollections --> immutable list
		// UnsupportedOperationException --> add, remove, set
		List<String> letters = List.of("a", "b", "c", "d");
		letters.add("zzz");
		
		System.out.println("letters --> " + letters.size()); */
	}

}
