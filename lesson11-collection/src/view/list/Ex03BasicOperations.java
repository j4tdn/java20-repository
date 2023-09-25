package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static utils.CollectionUtils.*;

public class Ex03BasicOperations {

	public static void main(String[] args) {
		// primitive
		// object --> single(Integer, String) - custom(Item, Student)
		
		// new ArrayList<>() --> dynamic array supports add, remove, get, set
		List<String> sequences = new ArrayList<>();
		
		// add
		sequences.add("sgk-12");
		sequences.add("sgk-46");
		sequences.add("sgk-829");
		sequences.add("stk-11");
		sequences.add("stk-10");
		sequences.add("sgk-46");

		
		// remove(lưu ý)
		// --> duyệt từng ptu trong list, nếu ptu nào 'equals' với ptu cần remove --> remove
		// chỉ remove ptu đầu tiên equals với ptu cần xóa
		sequences.remove("sgk-46");
		
		// remove  with condition
		// + index: ignore
		// + each: ConcurrentModificatonException (fail first)
		
		// phân biệt for each vs iterator
		// + for each: truy cập bki ptu nào lúc đang for
		// + iterator: truy cập ptu khi iterator đang duyệt đến (tuần tự)
		
		sequences.removeIf(seq -> seq.startsWith("stk"));
		
		// get, set
		
		// contains(lưu ý)
		// --> duyệt từng ptu trong list, nếu có 'equals' --> true
		boolean hasSgk12 =sequences.contains("sgk-12");
		System.out.println("hasSgk12: " + hasSgk12);
		
		generate("sequences: ", sequences);
		
		System.out.println("\n============ constructor ===========\n");
		
		// java.util.Arrays#ArrayList(fixed size)
		// UnsupportedOperationException --> add, remove
		// support --> set, get
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		// numbers.add(2);
		// numbers.remove(5);
		
		System.out.println("numbers " + numbers.size());

		// ImmutableCollections --> immutable list
		// UnsupportedOperationException --> add, remove, set
		// only support --> get
		List<String> letters = List.of("a", "v", "t");
		// letters.add("z");
		
	}

}
