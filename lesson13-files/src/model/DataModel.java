package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import bean.Apple;

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

}
