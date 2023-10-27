package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.Dish;
import common.Category;

public class DataModel {
	private DataModel() {
	}
	
	public static List<Apple> mockApples(){
		return List.of(
				new Apple(1, "Yellow", "Đà Nẵng", LocalDate.of(2022, 9, 25)),
				new Apple(2, "Red", "Đà Nẵng", LocalDate.of(2026, 5, 15)),
				new Apple(3, "Green", "Bà Nà Hills", LocalDate.of(2024, 5, 5)),
				new Apple(4, "Yellow", "Đà Thành", LocalDate.of(2022, 5, 5)),
				new Apple(5, "Red", "Đà Lạt", LocalDate.of(2021, 5, 5))
		);
	}
	
	public static List<Dish> mockDishes	() {
		return List.of(
			new Dish("D01", "Dish A1", 220, Category.FISH),	
			new Dish("D02", "Dish A2", 782, Category.MEAT),
			new Dish("D03", "Dish A3", 100, Category.VEGGIE),
			new Dish("D04", "Dish A4", 150, Category.EGG),
			new Dish("D05", "Dish B5", 220, Category.FISH),	
			new Dish("D06", "Dish B6", 782, Category.MEAT),
			new Dish("D07", "Dish C7", 111, Category.VEGGIE),
			new Dish("D08", "Dish C8", 1020, Category.EGG),
			new Dish("D09", "Dish D9", 220, Category.FISH),	
			new Dish("D10", "Dish D10", 777, Category.MEAT),
			new Dish("D11", "Dish E11", 111, Category.EGG),
			new Dish("D12", "Dish E12", 1500, Category.EGG)
		);
	}
	
	public static Map<String, Integer> mockWeekdays() {
		return Map.of(
				"Monday", 2, 
				"Friday", 6, 
				"Tuesday", 3,
				"Thursday", 5,
				"Wednesday", 4);
	}
}
