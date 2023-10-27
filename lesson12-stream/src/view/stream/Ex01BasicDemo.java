package view.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Predicate;import java.util.function.ToIntBiFunction;
import java.util.stream.Collectors;

import bean.Dish;
import common.Category;
import model.DataModel;

import static utils.StreamUtils.*;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		
		/*
		 	Stream<T>
		  	+ Là 1 ctdl mới từ Java8, chứa nhiều hàm hỗ trợ theo kiểu strategy pattern
		 	+ Immutable class
		 	+ Traversable once
		 	
		 	Thường sẽ khởi tạo stream bằng cách convert
		 	+ Array
		 	+ Collection(List, Set, Map#entrySet)
		 	--> sang Stream<T>
		 	
		 	Stream sẽ:
		 	+ lưu trữ 1 tập hợp các phần tử
		 	+ gọi các hàm để xử lý: strateger, builder pattern
		 	+ xử lý xong --> lưu trữ lại ở 1 csdl khác
		 	
		 	Các bước để thao tác với stream
		 	
		 	B1: Convert/Init data sang/cho Stream<T>
		 	    VD: Convert từ Collection<T> -> Stream<T> --> dùng hàm .stream()
		 	
		 	B2: Gọi các hàm xử lý có sẵn trong Stream
		 	    --> vẫn trả về KDL stream
		 	    --> Intermediate operations
		 	    VD: filter, map, sorted
		 	    
		 	B3: Sau khi xử lý xong
		 	    --> chuyển đổi stream sang 1 KDL khác để lưu trữ
		 	    --> Terminal operations
		 	    VD: collect(Collectors.toList())
		 	    	collect(Collectors.toSet())
		 	    	collect(Collectos.toCollection(Supplier<C> supplier))
		 	    	collect(Collectos.collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapFactory))
		 	    	toArray(IntFunction<A[]> supplier)
		 */
		
		var menu = DataModel.mockDishes();
		
		// non-stream
		var dishes = getData(menu, d -> d.getCalories() > 1000);
		generate("1. Get dishes which have calories > 250(non-stream)", dishes);
		
		// stream
		dishes = menu.stream()                   // Stream<Dish>: 12 dishes
			.filter(d -> d.getCalories() > 1000) // Stream<Dish>: 2 dishes
			.collect(Collectors.toList());       // List<Dish>
		generate("1. Get dishes which have calories > 250(stream)", dishes);
		
		var nameOfDishes = menu.stream()  // Stream<Dish>
			.map(Dish::getName)           // Stream<String>
			.collect(Collectors.toCollection(LinkedHashSet::new)); // Set<String>
		generate("2. Get name of dishes", nameOfDishes);
		
		// == *** equals
		// == *** equals trong Enum
		
		// text -> new String(text) *** String::new
		// size -> new String[size] *** String[]::new
		
		var veggieDishes = menu.stream() // Stream<Dish>
			.filter(d -> Category.VEGGIE.equals(d.getCategory())) // Stream<Dish>
			.map(Dish::getName) // Stream<String>
			.toArray(String[]::new);
			
		generate("3. Get name of veggie dishes", veggieDishes);
		
		var weekdays = DataModel.mockWeekdays();
		
		// non-stream: map<k, v> -> set<entry<k, v> -> list<entry<k, v>>   *** sort *** -> linkedhashmap<k, v>
		//     stream: map<k, v> -> set<entry<k, v> -> stream<entry<k, v>> *** sort *** -> linkedhashmap<k, v>
		
		// stream<t> -> collect(Collectors.toList()) -> list<t>
		// stream<t> -> collect(Collectors.toMap(keyMapper, valueMapper))  -> map<k,v> : hashmap
		// stream<t> -> collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapFactory))  -> map<k,v> : hashmap
		
		// item1, store1
		// item2, store1
		// item3, store3
		
		var sortedEntries = weekdays.entrySet() // set<entry<k, v>>
			.stream()       // stream<entry<k, v>>
			.sorted(Entry.comparingByValue(Comparator.reverseOrder())) // stream<entry<k, v>> (sorted)
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new)); // hashmap
		
		generate("3. Sorted Maps demo", sortedEntries.entrySet());
		
	}
	
	// dish.getCalories() > 250
	// dish.getId == 2
	
	private static List<Dish> getData(List<Dish> menu, Predicate<Dish> predicate) {
		List<Dish> result = new ArrayList<>();
		for (Dish dish: menu) {
			if (predicate.test(dish)) {
				result.add(dish);
			}
		}
		return result;
	}
	
}