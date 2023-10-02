package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex04BasicOperationWithAll {
	
	public static void main(String[] args) {
		
		// Từ java10 --> var
		// Thay vì khai báo KDL cho biến thì mình sẽ dùng từ khoá var
		// để thay thế cho KDL khai báo
		
		// JavaL static type
		// var --> block scope
		
		// JavaScriptL dynamic type
		// var --> function scope
		
		var listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		var listB = new ArrayList<>(List.of(4, 5, 6, 7, 8));
		
		var list1 = new ArrayList<>(listA);
		
		
	}
	
	static interface Fx {
		boolean test(int a);
	}

}
