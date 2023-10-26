package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bean.Apple;

public class DataModels {

	private DataModels() {
	}
	
	public static List<Apple> mockApples() {
		return new ArrayList<>(List.of(
				new Apple(1, "Yellow", "Đà Nẵng", LocalDate.of(2022, 10, 10)),
				new Apple(2, "Green", "Quảng Nam", LocalDate.of(2022, 12, 30)),
				new Apple(3, "Red", "Đà Nẵng", LocalDate.of(2023, 10, 16)),
				new Apple(4, "Green", "Huế", LocalDate.of(2022, 9, 15)),
				new Apple(5, "Yellow", "Đà Nẵng", LocalDate.of(2023, 10, 10))
				));
	}

}
