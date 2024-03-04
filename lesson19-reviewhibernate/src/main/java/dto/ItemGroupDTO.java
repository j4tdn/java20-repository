package dto;

public class ItemGroupDTO {

	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String AMOUNT = "amount";

	private Integer id;

	private String name;

	private Integer amount;

	public ItemGroupDTO() {
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
		return "ItemGroupDTO [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}
