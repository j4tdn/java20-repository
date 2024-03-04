package persistence.dto;

import java.sql.Time;

public class ItemTimeDto {
	public static String PROP_ITEM_ID = "itId";
	public static String PROP_ITEM_NAME = "itName";
	public static String PROP_TIME_CREATED_AT = "timeCreatedOrder";
	
	private Integer itId;
	private String itName;
	private Time timeCreatedOrder;
	
	public ItemTimeDto() {
	}

	public ItemTimeDto(Integer itId, String itName, Time timeCreatedOrder) {
		this.itId = itId;
		this.itName = itName;
		this.timeCreatedOrder = timeCreatedOrder;
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

	public Time getTimeCreatedOrder() {
		return timeCreatedOrder;
	}

	public void setTimeCreatedOrder(Time timeCreatedOrder) {
		this.timeCreatedOrder = timeCreatedOrder;
	}

	@Override
	public String toString() {
		return "ItemDto [itId=" + itId + ", itName=" + itName + ", timeCreatedOrder=" + timeCreatedOrder + "]";
	}
	
	
	
}
