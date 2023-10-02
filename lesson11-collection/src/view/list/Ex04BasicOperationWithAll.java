package view.list;

import java.util.ArrayList;
import java.util.List;

import utils.CollectionUtils;

public class Ex04BasicOperationWithAll {
	public static void main(String[] args) {
		
		// List<Integer> listA = new ArrayList<>(List.of(1,2,4));
		// List<Integer> listB = new ArrayList<>(List.of(1,2,3));
		
		// Từ Java10 --> var
		// Thay vì khai báo KDL cho biến thì mình sẽ dùng từ khóa var
		// Để thay thế cho KDL khai báo
		
		// Java: static type
		// var -> block scope {}
		
		// JS  : dynamic type 
		// var --> function scope
		
		var listA = new ArrayList<>(List.of(1,2,4,5,6,7,8,9));
		var listB = new ArrayList<>(List.of(1,2,3,10,11,12));
		

		
		// addAll
		var list1 = new ArrayList<>(listA);
		list1.addAll(listB);
		
		// RemoveAll 
		var list2 = new ArrayList<>(listA);
		list2.removeAll(listB);
		
		// RetainAll
		var list3 = new ArrayList<>(listA);
		list3.retainAll(listB);
		
		CollectionUtils.generateInt("List1 add all --> ", list1); // Phép hợp
		CollectionUtils.generateInt("List2 remove all --> ", list2); // Phép hiệu
		CollectionUtils.generateInt("List3 retain all --> ", list3); //Phép giao
	}
}
