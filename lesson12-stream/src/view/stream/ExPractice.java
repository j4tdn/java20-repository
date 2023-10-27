package view.stream;

import static utils.StreamUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import bean.Apple;
import bean.Dish;
import common.Category;
import model.DataModel;
public class ExPractice {
	
	public static void main(String[] args) {
		
		List<Dish> menuAllDishes = DataModel.mockDishes();
		generate("1. All dishes", menuAllDishes);
		
		// 1. Lấy ra những dish có calo > 500(lấy full thông tin) -> thử bằng 2 cách, stream và traditional
		// Traditional
		List<Dish> dishes500CaloriesPlus = getDishByCondition(menuAllDishes, dish -> dish.getCalories() > 500);
		generate("2. Dishes have calories > 500", dishes500CaloriesPlus);
		
		//Stream
		var listDishes500CaloPlus = menuAllDishes.stream()
													.filter(dish -> dish.getCalories() > 500)
													.collect(Collectors.toList());
		generate("2. Dishes have calories > 500 Stream", listDishes500CaloPlus);
		
		// 2. Lấy ra những dish là thức ăn chay(chỉ lấy tên) -> 2 cách
		List<Dish> VegetaDishes = getDishByCondition(menuAllDishes, dish -> dish.getCategory().equals(Category.VEGGIE));
		generate("3. Dishes are vegetable", VegetaDishes);
		
		var listVegetaDishes = menuAllDishes.stream()
												.filter(dish -> dish.getCategory().equals(Category.VEGGIE))
												.map(Dish::getName)
												.collect(Collectors.toList());
		generate("3. Dishes are vegetable stream", listVegetaDishes);
		
		
		
		// DAYYYYYYYYYYYYYY
		Map<String, Integer> weekdays = DataModel.mockWeekdays();
	
		var sorted =  weekdays.entrySet()
								.stream()
								.sorted(Comparator.comparing(Entry::getValue))
								.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1,v2) -> v1, LinkedHashMap::new));
		generate("1. Weekdays from 2 -> 6", sorted.entrySet());
		
		//Nhóm dish theo calo
		var test = menuAllDishes.stream()
						.collect(Collectors.groupingBy(dish -> dish.getCategory()));
		generate("100. Test", test.entrySet());
		
		List<String> letters = List.of("a","b","c","A","B","C","aa","bb","cc");
		var lettersProcess = letters.stream()
									.collect(Collectors.groupingBy(letter -> letter, Collectors.counting()))
									.entrySet()
									.stream()
									.filter(entry -> entry.getValue() == 1L)
									.map(entry -> entry.getKey())
									.collect(Collectors.joining(","));
		System.out.println(lettersProcess);
		
		var allMatch = letters.stream().allMatch(str -> str.equals("a"));
		System.out.println(allMatch);
	}
	
	public static List<Dish> getDishByCondition(List<Dish> menu, Predicate<Dish> predicate){
		List<Dish> dishes = new ArrayList<>();
		
		for(Dish dish : menu) {
			if(predicate.test(dish)) {
				dishes.add(dish);
			}
		}
		return dishes;
	}
	
}
