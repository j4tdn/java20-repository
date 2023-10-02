package view.list;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static utils.CollectionUtils.*;

public class Ex03BasicOperations {
	public static void main(String[] args) {
		// primitive type
		// object type --> single(Integer, String) - custom(Item, Student)
		
		// new ArrayList<>() --> dynamic array supports add, remove, get, set
		
		List<String> sequences = new ArrayList<>();
		sequences.add("sgk-12");
		sequences.add("sgk-46");
		sequences.add("sgk-829");
		sequences.add("sgk-88");
		sequences.add("sgk-99");
		sequences.add("sgk-175");
		
		
		// remove ( lưu ý )
		// --> Duyệt từng phần tử trong list, nếu phần tử nào 'equals'
		//		với phần tử cần remove -->remove
		// --> chỉ remove phần tử đầu tiên equals với phần tử cần xoá
		sequences.remove("sgk-829");
		
		// remove with condition
		//	+ index: ignore
		//	+ each: ConcurrentModificationException ( fail first )
		
		// phân biệt for each với iterator
		//	+ for each: truy cập bất kỳ phần tử nào đang for
		//	+ iterator: truy cập phần tử khi iterator đang duyệt đến ( tuần tự )
		
		sequences.removeIf(seq -> {
			return seq.startsWith("stk");
		});
		
		// get(i)
		// set(i, newValue)
		
		// contains( lưu ý )
		// --> duyệt từng phần tử trong list, nếu phần tử nào 'equals'
		//		với phần tử đang kiểm tra --> true
		boolean hasSgk12 = sequences.contains("sgk-12");
		
		System.out.println("hasSgk12 --> " + hasSgk12);
		
		generate("sequences", sequences);
		
		System.out.println("\n=================== constructor ================\n");
		
		List<Integer> number = Arrays.asList(5, 2, 4, 5, 2, 2);
		// numbers.add(27);
		// numbers.remove(5);
		number.set(0, 99);
		
		System.out.println("numbers --> " + number.size());

		List<String> letters = List.of("a", "b", "c", "d");

	}

}
