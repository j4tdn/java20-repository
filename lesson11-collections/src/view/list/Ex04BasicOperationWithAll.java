package view.list;

import java.util.ArrayList;
import java.util.List;

import utils.CollectionUtils;

public class Ex04BasicOperationWithAll {
	public static void main(String[] args) {
		
		// từ JAVA10 -> var
		// thay vì khai báo KDL cho 1 biến thì dùng từ khóa var để thay thế cho KDL khi báo
		
		// JAVA: static TYPE
		// var --> blockScope
		// JAVASCRIPT: Dynamic type
		// var --> function scope
		List<Integer> listA = new ArrayList<>(List.of(1,2,4,5));
		
		List<Integer> listB = new ArrayList<>    (List.of(4,5,6,7,8));
		
		// addAll
		List<Integer> listAddAll = new ArrayList<>(listA);
		listAddAll.addAll(listB);
		
		List<Integer> list2 = new ArrayList<>(listA);
		list2.removeAll(listA);
		CollectionUtils.generateInt("list all", list2);
		
		CollectionUtils.generateInt("list2 all", listAddAll);
	}
}
