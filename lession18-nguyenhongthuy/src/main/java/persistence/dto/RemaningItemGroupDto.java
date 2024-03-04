package persistence.dto;

public class RemaningItemGroupDto {
	public static String PROP_ITEM_ID = "itId";
	public static String PROP_ITEM_NAME = "itName";
	public static String PROP_AMOUNT_OF_ITEMS = "amountOfItems";
	
	private Integer itId;
	private String itName;
	private Integer amountOfItems;
	
	public RemaningItemGroupDto() {
	}

	public RemaningItemGroupDto(Integer itId, String itName, Integer amountOfItems) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.amountOfItems = amountOfItems;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public Integer getAmountOfItems() {
		return amountOfItems;
	}

	public void setAmountOfItems(Integer amountOfItems) {
		this.amountOfItems = amountOfItems;
	}

	@Override
	public String toString() {
		return "ItemRemaning [itId=" + itId + ", itName=" + itName + ", amountOfItems=" + amountOfItems + "]";
	}
	
}
