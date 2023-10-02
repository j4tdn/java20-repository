package view.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
public static void main(String[] args) {
		
		// Before JDK 1.5
		// Raw type --> Sử dụng Class/Interface với Generic Type
		//              mà mình không truyền KDL cho generic type, mặc định generic type đó là Object
		// Dễ xảy ra lỗi casting(ép kiểu) lúc runtime
		List list = new ArrayList<>();
		list.add(5);
		list.add("hello"); // runtime
		list.add(BigDecimal.TEN);
		
		// Sử dụng generic type --> hỗ trợ bắt lỗi tại compile
		// From JDK 1.5
		List<Integer> digits = new ArrayList<Integer>();
		digits.add(5);
		// digits.add("bye"); compile error
		
		// From JDK 1.7
		// using this one
		List<Integer> numbers = new ArrayList<>();
		
		// not preferred
		ArrayList<Integer> aList = new ArrayList<>();
		
	}
}
