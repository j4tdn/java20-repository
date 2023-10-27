package bean;

import common.Category;

public class Dish {
	private String id;
	private String name;
	private int calories;
	private Category category;
	
	public Dish() {
	}

	public Dish(String id, String name, int calories, Category fish) {
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.category = fish;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", category=" + category + "]";
	}
}
