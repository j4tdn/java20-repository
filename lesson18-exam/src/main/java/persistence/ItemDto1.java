package persistence;

import java.time.LocalTime;

public class ItemDto1 {

	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_TIME= "time";

	private Integer id;
	private String name;
	private LocalTime time;

	public ItemDto1() {
	}

	public ItemDto1(Integer id, String name, LocalTime time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "ItemDto1 [id=" + id + ", name=" + name + ", time=" + time + "]";
	}

}
