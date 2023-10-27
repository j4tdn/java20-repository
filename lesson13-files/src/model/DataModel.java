package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bean.Apple;

public class DataModel {
	private DataModel() {
		
	}
	
	public static List<Apple> mockApples() {
		return new ArrayList<>(
				List.of(
				new Apple(1, "Yellow", "Đà Nẵng", LocalDate.of(2022, 5, 5)),
				new Apple(2, "Red", "Đà Nẵng", LocalDate.of(2023, 5, 5)),
				new Apple(3, "Green", "Đà Lạt", LocalDate.of(2026, 6, 6)),
				new Apple(4, "Yellow", "Đà Nẵng", LocalDate.of(2022, 5, 5)),
				new Apple(5, "Red", "Đà Lạt", LocalDate.of(2026, 6, 6))
		));
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
