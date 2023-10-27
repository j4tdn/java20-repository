package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import bean.Apple;

public class DataModel {
	private DataModel() {
	}
	
	public static Map<String, Integer> mockWeekdays() {
		return Map.of(
				"Monday", 2, 
				"Friday", 6, 
				"Tuesday", 3,
				"Thursday", 5,
				"Wednesday", 4);
	}
	
	
	public static List<Apple> mockApple(){
		return new ArrayList<>(
				List.of(
						new Apple(1, "da nang", "Yellow", LocalDate.of(2022, 11, 10)),
						new Apple(2, "da nang", "red", LocalDate.of(2022, 12, 20)),
						new Apple(3, "da lat", "green", LocalDate.of(2024, 1, 10)),
						new Apple(4, "hue", "black", LocalDate.of(2024, 1, 24)),
						new Apple(5, "quang nam", "blue", LocalDate.of(2024, 3, 15))
			)
		);
	}
}
