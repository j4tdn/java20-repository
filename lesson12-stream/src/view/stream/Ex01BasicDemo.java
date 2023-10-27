package view.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.print.attribute.standard.Sides;

import bean.Dish;
import common.Category;
import model.DataModel;

import static utils.StreamUtils.*;
public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		var menu = DataModel.mockDishes();
	
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
	 	    	collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapFactory))
	 	    	toArray(IntFunction<A[]> supplier)
	 */
		
		
		// 1. Get dishes which have calories > 250
		
		// non-stream
		List<Dish> dishesCaloMoreThan250 = getData(menu, d -> d.getCalories() > 250);
		generate("1. Get dishes which have calories > 250(non-stream)", dishesCaloMoreThan250);
		
		// stream
		var dishes = menu.stream() //Stream dish
			.filter(d -> d.getCalories() > 250) //Stream dish
			.collect(Collectors.toList());
		generate("1. Get dishes which have calories > 250(stream)", dishes);
		
		// 2. 
		List<Integer> listInt = menu.stream()		// List<Dishes>
									.map(d -> 5)	// List<Integer>
									.toList();		
		generate("", listInt);
		
		// 3. Vegetarian
		@SuppressWarnings("unused")
		var veggieDishes = menu.stream()
								.filter(d -> d.getCategory().equals(Category.VEGGIE))
								.map(Dish::getName)
								.toArray(new IntFunction<String[]>() {
									public String[] apply(int size) {
										return new String[size];
									};
								});
		
		var veggieDishes1 = menu.stream()
				.filter(d -> d.getCategory().equals(Category.VEGGIE))
				.map(Dish::getName)
				.toArray(String[]::new);
		
		generate("3. Get name of Vegiee Dishes", veggieDishes1);
	
		var weekdays = DataModel.mockWeekdays();
		
		// non-stream: Map<K ,V> -> Set<K, V> -> List<Entry<K,V>> -> SORT -> Convert LinkHashMap
		//     stream: Map<K ,V> -> Set<K, V> -> Stream<Entry<K,V>> -> SORT -> Convert LinkHashMap
		
		// stream<t> -> collect(Collectors.toList()) -> list<t>
		// stream<t> -> collect(Collectors.toMap(keyMapper, valueMapper))  -> map<k,v> : hashmap
		// stream<t> -> collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, mapFactory))  -> map<k,v> : hashmap
		
		// item1, store1
		// item2, store1
		// item3, store3
		
		var filterWeekdays = weekdays.entrySet() //Set<Entry<K,V>>
				.stream()	//Stream<Entry<K, V>>
				.sorted(Comparator.comparing(Entry::getValue)) // Entry.ComparingValue() -> Stream<Entry<K,V>> (sorted)
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1,v2) -> v1, () -> new LinkedHashMap<>())); // HashMap
		generate("Map demo", filterWeekdays.entrySet());
		
	}
	
	// Lúc get cái này, lúc get cái kia -> input là dish, condition là boolean -> Strategy Predicate
	private static List<Dish> getData(List<Dish> menu, Predicate<Dish> predicate){
		List<Dish> DishesCaloMoreThan250 = new ArrayList<>();
		for(Dish dish : menu) {
			if(predicate.test(dish)) {
				DishesCaloMoreThan250.add(dish);
			}
		}
		return DishesCaloMoreThan250;
	}
}
