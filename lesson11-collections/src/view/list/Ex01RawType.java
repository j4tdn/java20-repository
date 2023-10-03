package view.list;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	
	public static void main(String[] args) {
		
		// Before JDK 1.5
		
		// Raw type: Sd Class/Interface với Generic Type mà mình không truyền KDL cho Generic Type,
		//			 mặc định Generic Type đó là Object
		// 			 => Dễ xảy ra lỗi casting lúc Runtime
		
		List list = new ArrayList();
		list.add(5);
		list.add("hello");
		list.add(BigDecimal.TEN);
		
		System.out.println("========================================================================");
		
		// Sd Generic Type => Hỗ trợ bắt lỗi tại Compile
		// From JDK 1.5
		
		List<Integer> digits = new ArrayList<Integer>();
		digits.add(5);
		
		System.out.println("========================================================================");
		
		// From JDK 1.7
		
		List<Integer> numbers = new ArrayList<>(); // Sẽ dùng cách khai báo này
		
	}

}
