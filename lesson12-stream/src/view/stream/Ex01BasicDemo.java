package view.stream;

import static utils.StreamUtils.generate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;

public class Ex01BasicDemo {

	public static void main(String[] args) {

		/*
		 * Stream<T>: +là 1 ctdl mới từ java08, chứa nhiều hàm hỗ trợ theo kiểu strategy
		 * pattern 
		 * 			  + immutable class 
		 * 			  + Traversable once
		 * 
		 * Thường sẽ khởi tạo stream bằng cách convert + Array + Collections(List, Set,
		 * Map#entrySet) --> sang Stream<T>
		 * 
		 * Stream sẽ: + lưu trữ 1 tập hợp các phần tử 
		 * 			  + gọi các hàm xử lí: strategy, builder pattern 
		 * 			  + xử lí xog: lưu trữ lại ở 1 csdl khác
		 * 
		 * Các bước thao tác với Stream
		 * B1: convert/init sang Stream<T>
		 * B2: gọi các hàm xử lí 
		 * 	--> vẫn trả về KDL Stream
		 * 	--> Intermediate operations
		 * B3: sau khi xử lí xog
		 * 	--> chuyển sang KDL khác để lưu trữ
		 * 	--> Terminal operations
		 */

		var menu = DataModel.mockDishes();

		// 1.get dishes which have calories > 250

		// non-stream
		var dishes = getData(menu, dish -> dish.getCalories() > 1000);
		generate("1.get dishes which have calories > 1000(non-stream)", dishes);

		dishes = menu.stream() // Stream<Dish>
			.filter(d -> d.getCalories() > 1000)
			.collect(Collectors.toList());
		generate("1.get dishes which have calories > 1000(stream)", dishes);
		
		var nameOfDishes = menu.stream()
			  .map(Dish::getName) // Stream<String>
			  .collect(Collectors.toCollection(LinkedHashSet::new));
		generate("2.", nameOfDishes);
		
		// ==(ko throw Exception) vs equals trong Enum--> tương tự vì mỗi gtri của enum chỉ đc tạo ra 1 lần duy nhất
		
		var veggieDishes = menu.stream()
			.filter(d -> d.getCategory().equals(Category.VEGGIE))
			.map(Dish::getName)
			.toArray(String[]::new);
		
		generate("3.", veggieDishes);
		
		var weekdays = DataModel.mockWeekdays();
		
		// non-stream: map<k, v> -> set<entry<k, v>> -> list<entry<k, v>> -> sort -> linkedhashmap<k, v>
		// 	   stream: map<k, v> -> set<entry<k, v>> -> list<entry<k, v>> -> sort -> linkedhashmap<k, v>
		
		// stream<t> --> collect(Collectors.toList()) -> List<t>
		// stream<t> --> collect(Collectors.toMap(keyMapper, valueMapper)) -> map<k, v> : hashmap
		// stream<t> --> collect(Collectors.toMap(keyMapper, valueMapper), mergeFunction, mapFactory) -> List<t>
		
		// item1, storeid1
		// item2, storeid1
		
		var sortedEntries = weekdays.entrySet() // set<entry<k,v>>
				.stream()   // stream<entry<k, v>>
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new)); // hashmap
		
		generate("3.Sorted map demo: ", sortedEntries.entrySet());
				
		
		
	}
	
	private static List<Dish> getData(List<Dish> menu, Predicate<Dish> predicate){
		List<Dish> result = new ArrayList<>();
		for (Dish dish : menu) {
			if (predicate.test(dish)) {
				result.add(dish);
			}
		}
		return result;
	}

}
