package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		//before JDK 1.5
		//rawtype: mình ko truyền KDL cho generic type
//		List list = new ArrayList<>();
//		list.add(5);
//		list.add("as");

		// sử dụng generic type: hỗ trợ bắt lỗi ở compile 
		//from JDK 1.5
		List<Integer> digits = new ArrayList<Integer>();
		digits.add(2);
		//from JDK 1.7
		//using this one
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
	}
}
