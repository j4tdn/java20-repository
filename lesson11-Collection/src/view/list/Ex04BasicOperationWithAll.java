package view.list;

import java.util.ArrayList;
import java.util.List;

import utils.CollectionUtils;

public class Ex04BasicOperationWithAll {
public static void main(String[] args) {
		
		// Từ Java10 --> var
		// Thay vì khai báo KDL cho biến thì mình sẽ dùng từ khóa var
		// để thay thể cho KDL khai báo
		
		// Java: static type
		// var --> block scope
		
		// JavaScript: dynamic type
		// var --> function scope
		
		var listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		var listB = new ArrayList<>(List.of(4, 5, 6, 7, 8));
		
		var list1 = new ArrayList<>(listA);
		list1.addAll(listB);
		CollectionUtils.generateInts("list1 add all", list1); // phép hợp
		
		var list2 = new ArrayList<>(listA);
		list2.removeAll(listB);
		CollectionUtils.generateInts("list2 remove all", list2); // phép hiệu
		
		var list3 = new ArrayList<>(listA);
		list3.retainAll(listB);
		CollectionUtils.generateInts("list3 retain all", list3); // phép giao
		
	}
	
	
}
