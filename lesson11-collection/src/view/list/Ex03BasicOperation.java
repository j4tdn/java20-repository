package view.list;

import static utils.CollectionUtils.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * 
 * Tất cả những KDL đối tượng mà chúng ta tạo ra đều kế thừa từ class Object, Mà trong Object sẽ có hàm equals
	-	Lúc compile CT luôn gọi hàm equals của Object
	-	Lúc runtime nếu có override -> Chạy hàm Override nếu không -> Chạy hàm equals của Object
	-	Để tạo đối tượng thường sử dụng toán tử new -> luôn tạo ra địa chỉ ô nhớ mới
	-	Dẫn tới equals luôn false
	-	Vì thế chúng ta nên override hàm equals

 */
public class Ex03BasicOperation {
	public static void main(String[] args) {
		// Primitive type

		// Object type --> single(Integer, String) - custom(Item, Student)
		// add
		List<String> sequences = new ArrayList<>(); // dynamic array supports add, remove, get, set
		sequences.add("sgk-12");
		sequences.add("stk-15");
		sequences.add("stk-15");
		sequences.add("stk-15");
		sequences.add("stk-15");
		sequences.add("stk-15");
		System.out.println("size --> " + sequences.size());

		// remove -> Duyệt từng phần tử trong list, nếu phần tử nào equals với phần tử
		// cần remove -> remove
		// -> Chỉ remove phần tử đầu tiên equals với phần tử cần xóa

		sequences.remove("sgk-829");

//		Không thể xóa phần tử bằng forEach 		
//		for(String seString : sequences) {
//			if(seString.equals("stk-15")) {
//				sequences.remove(seString);
//			}
//		}

		// remove with condition
		// + index: ignore
		// + each : ConCurrentModificationException(fail first)

		// Phân biệt for each với iterator
		// + forEach : truy cập bất kỳ phần tử nào đang for
		// + iterator: truy cập phần tử khi iterator đang duyệt tới(tuần tự)

		sequences.removeIf(seq -> seq.startsWith("stk")); // Đây chính là duyệt bằng Iterator

		// Get(i)
		// Set(i, newValue)

		// contains(lưu ý)
		// -> Duyệt từng phẩn tử trong list, nếu phần tử nào 'equals' với checking pivot
		// -> true
		boolean hasSgk12 = sequences.contains("sgk-12");

		System.out.println("hasSgk-12 --> " + hasSgk12);
		generate("sequences", sequences);

		System.out.println("\n=========== CONSTRUCTOR ============");

		// List này chính là java.util.Arrays#ArrayList
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 1, 4, 5, 6, 3, 3);
		// numbers.add(27);
		// numbers.remove(5);
		numbers.set(0, 99);
		System.out.println("numbers --> " + numbers.size());

		// ImmutableCollections -> immutable list
		// UnsupportedOperationException --> add, remove, set
		// List<String> letters = List.of("a","b","c","d","e","f"); --> Immutable can't
		// add, remove or set
		List<String> letters = new ArrayList<>(List.of("a", "b", "c", "d", "e", "f"));
		letters.size();
		letters.set(1, "zzz"); // Throw Exception

		System.out.println("letters --> " + letters.size());
	}

}
