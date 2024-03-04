package persistence;

import java.time.LocalTime;

public class ItemDto2 {

	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT= "amount";

	private Integer id;
	private String name;
	private Integer amount;

	public ItemDto2() {
	}
	

	public ItemDto2(Integer id, String name, Integer amount) {
		this.id = id;
		this.name = name;
		this.amount = amount;
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

	public Integer getAmount() {
		return amount;
	}
	
	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	@Override
	public String toString() {
		return "ItemDto1 [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}
