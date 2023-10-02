package lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemMain {
	public static void main(String[] args) {
		List<Item> items = DataModel.mockItems();
		List<String> strings = new ArrayList<>();
		
		CollectionUtils.generateT("Items", items);
		
		strings.add("world");
		strings.add("hello");
		strings.add("JAVA");
	
		CollectionUtils.generateT("String", strings);
		sortList(items);
		sortList(strings);
		
		CollectionUtils.generateT("Items after sorted", items);
		CollectionUtils.generateT("String after sorted", strings);
	}
	
	public static <T extends Comparable<T>> void sortList(List<T> lists) {
		Collections.sort(lists);
	}
	
}
