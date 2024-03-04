package persistence;

import java.time.LocalTime;

public class ItemDto3 {

	public static final String PROP_ID = "itemId";
	public static final String PROP_NAME = "itemName";
	public static final String PROP_AMOUNT = "amount";

	private Integer itemId;
	private String itemName;
	private Integer amount;

	public ItemDto3() {
	}

	public ItemDto3(Integer itemId, String itemName, Integer amount) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.amount = amount;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemDto3 [itemId=" + itemId + ", itemName=" + itemName + ", amount=" + amount + "]";
	}

}
