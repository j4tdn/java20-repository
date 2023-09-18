package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {

	public static void main(String[] args) {
		// before JDK 1.5
		// rawType --> sử dụng class / interface với generic type 
		// 			   mà mình không truyền KDL cho nó --> mặc định type đó là object
		// dễ xảy ra lỗi casting lúc runtime
		List list = new ArrayList<>();
		list.add(5);
		list.add("hello"); // runtime
		
		// from JDK 1.5
		// sử dụng generic type --> bắt lỗi compile
		List<Integer> digits = new ArrayList<Integer>(); 
		digits.add(5);
		// digits.add("a"); -> compile error
				
		// from JDK 1.7
		// using this one
		List<Integer> numbers = new ArrayList<>(); 
	}

}
