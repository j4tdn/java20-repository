package view.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	
	public static void main(String[] args) {
		// Before JDK 1.5
		//Raw type --> Sử dụng Class/Interface với Generic type mà mình không truyền KDL cho generic type
		//         --> mặc định Generic Type đó là Object
		// Dễ xảy ra lỗi casting lúc runtime
		List list = new ArrayList();
		list.add(5);
		list.add("Hello");
		list.add(BigDecimal.TEN);
		
		// From JDK 1.5
		List<Integer> digits = new ArrayList<Integer>();
		
		// From JDK 1.7
		//Use this
		List<Integer> numbers = new ArrayList<>();
		
		//Not preferred
		ArrayList<Integer> alist = new ArrayList<>();
		
	}
	
	
}
