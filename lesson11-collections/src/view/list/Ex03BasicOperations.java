package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.CollectionUtils;

public class Ex03BasicOperations {
		
	public static void main(String[] args) {
		
		// primitive type
		
		
		// Object type --> single (Integer, String) - custom (Item, Student) 
		
		// new ArrayList<>() --> dynamic array support crud
		List<String> sequences = new ArrayList<>();
		
		//add 
		sequences.add("sgk-12");
		sequences.add("sgk-46");
		sequences.add("sgk-46");
		sequences.add("sgk-21");
		sequences.add("stk-21");
		sequences.add("stk-99");
		// remove (lưu ý)
		// --> duyệt từng phần từ trong list, nếu phần tử nào 'equals'
		// với phần từ cần remove
		// --> chỉ remove phần từ đầu tiên equals với phần tử cần xóa
		// phân biệt for each với iterator 
		// + for each: truy cập phần từ nào đang for
		// + iterator : truyền cập phần từ khi iterator đang duyệt đến(tuần tự)
		
		// get 
		sequences.get(0);
		

		// contains
		// --> duyệt từng phần tử trong list, nếu phần từ nào 'equals'
		// với phần từ đang kiểm tra --> true
		boolean hasSgk12 = sequences.contains("sgk-12");
		System.out.println(hasSgk12);
		
		sequences.removeIf(seq -> seq.startsWith("stk"));
		CollectionUtils.generate("sequences", sequences);
		
		System.out.println("======constructor====\n");
		
		//Array #ArrayList not support CRUD
		List<Integer> numbers = Arrays.asList(1,4,6,2,6);
		numbers.set(0, 12);
		//List.of not Support CRUD --> immutable List
		List<String> letters = List.of("a", "b", "c", "D");
		letters.add("zzz");
		CollectionUtils.generate("sequences", letters);
		
	}
}
