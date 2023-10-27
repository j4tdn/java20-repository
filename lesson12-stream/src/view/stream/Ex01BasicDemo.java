package view.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;
import utils.StreamUtils;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 
		 Stream: là 1 ctdl mới từ Java8, chứa nhiều hàm hỗ trợ theo kiểu strategy pattern 
		 + Immutable class
		 + Traversable once 
		 
		 
		 thường sẽ khởi tạo stream bằng cách convert
		 + Array
		 + Collection(List, Set, Map#entrySet)
		 -> sang Stream<T>
		 
		 	Stream sẽ: 
		 		+ lưu trữ tập hợp các phần tử
		 		+ gọi các hàm để xử lý: strategy, builder pattern 
		 		+ xử lý xong --> lưu trử lại ở 1 csdl khác 
		 */
		List<Dish> menu = DataModel.mockDish();
		// 1. get dishes which have calories > 250
		List<Dish> dishs = menu.stream()
			.filter(d -> d.getCalories() > 1000)
			.collect(Collectors.toList());
		StreamUtils.generate("1. get dishes which have calories > 1000", dishs);
			
		var nameOfDishes = menu.stream()
			.map(Dish::getName)
			.toList();
		StreamUtils.generate("2. get name of dishes", nameOfDishes);
		
		var nameOfCategory = menu.stream()
			.filter(d -> d.getCategory().equals(Category.VEGGIE))
			.map(Dish::getName)
			.toList();
		StreamUtils.generate("3. get name of Category", nameOfCategory);
		
		var weekDays = DataModel.mockWeekdays();
		var sortedEntries = weekDays.entrySet()
				.stream()
				.sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1,v2)-> v1, LinkedHashMap::new))	;//hashMap
		StreamUtils.generate("4. sorted entries", sortedEntries.entrySet());
		
	}
	
	
}
