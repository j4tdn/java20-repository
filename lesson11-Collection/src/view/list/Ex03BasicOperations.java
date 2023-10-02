package view.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static utils.CollectionUtils.*;

public class Ex03BasicOperations {

	public static void main(String[] args) {

		// primitive type
		// object type --> single(Integer, String) - custom(Item, Student)

		// new ArrayList<>() --> dynamic array supports add, remove, get, set
		// java.util.ArrayList
		List<String> sequences = new ArrayList<>();

		// add
		sequences.add("sgk-12");
		sequences.add("sgk-46");
		sequences.add("sgk-829");
		sequences.add("stk-88");
		sequences.add("stk-99");
		sequences.add("sgk-175");
		sequences.add("sgk-829");

		// remove(lưu ý)
		// --> Duyệt từng phần tử trong list, nếu phần tử nào 'equals'
		// với phần tử cần remove --> remove
		// --> chỉ remove phần tử đầu tiên equals với phần tử cần xóa
		sequences.remove("sgk-829");

		// remove with condition
		// + index: ignore
		// + each : ConcurrentModificationException(fail first)

		// phân biệt for each với iterator
		// + for each: truy cập bất kỳ phần tử nào đang for
		// + iterator: truy cập phần tử khi iterator đang duyệt đến(tuần tự)

		sequences.removeIf(seq -> {
			return seq.startsWith("stk");
		});

		// get(i)
		// set(i, newValue)

		// contains(lưu ý)
		// --> Duyệt từng phần tử trong list, nếu phần tử nào 'equals'
		// với phần tử đang kiểm tra --> true
		boolean hasSgk12 = sequences.contains("sgk-12");

		System.out.println("hasSgk12 --> " + hasSgk12);

		generateStrings("sequences", sequences);

		System.out.println("\n================= constructor ===================\n");

		// java.util.Arrays#ArrayList(fixed size(length))
		// UnsupportedOperationException --> add, remove
		// support --> get, set
		List<Integer> numbers = Arrays.asList(5, 2, 4, 5, 2, 2);
		// numbers.add(27);
		// numbers.remove(5);
		numbers.set(0, 99);
		
		System.out.println("numbers --> " + numbers.size());
		
		// ImmutableCollections --> immutable list
		// UnsupportedOperationException --> add, remove, set
		List<String> letters = List.of("a", "b", "c", "d");
		// letters.add("zzz");
		letters.set(1, "t");
		
		System.out.println("letters --> " + letters.size());
	}
		
		
		
	}

