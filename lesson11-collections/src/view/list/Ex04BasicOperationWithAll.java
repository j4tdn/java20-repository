package view.list;

import java.util.ArrayList;
import java.util.List;

import util.CollectionUtils;

public class Ex04BasicOperationWithAll {
	public static void main(String[] args) {
		
		//Từ java10 --> var
		//Thay vì khai báo KDL cho biến thì mình sẽ dùng từ khóa var để thay thế cho KDL khai báo
		//java: static type
		//var --> function scope
		
		var listA = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		
		var listB = new ArrayList<>(List.of(4, 5, 6, 7, 8));
		
		//addAll
		var list1 = new ArrayList<>(listA);
		
		//remove
		list1.removeAll(listB);
		
		var list3 = new ArrayList<>(listA);
		list3.retainAll(listB);
		CollectionUtils.generateInts("list1 add all", list1);
		CollectionUtils.generateInts("list1 retain all", list3);
	}
}