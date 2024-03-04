package persistence.dto;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Objects;

public class ItemGroupAmountDto {
	public static final String PROP_IT_ID = "itId";
	public static final String PROP_IT_NAME = "itName";
	public static final String PROP_OD_CREATED_AT = "itAmountOfItems";
	
	private Integer itId;
	private String itName;
	private BigDecimal itAmountOfItems;
	
	public ItemGroupAmountDto() {
	}

	public ItemGroupAmountDto(Integer itId, String itName, BigDecimal itAmountOfItems) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.itAmountOfItems = itAmountOfItems;
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

	public BigDecimal getItAmountOfItems() {
		return itAmountOfItems;
	}

	public void setItAmountOfItems(BigDecimal itAmountOfItems) {
		this.itAmountOfItems = itAmountOfItems;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ItemGroupAmountDto)) {
			return false;
		}
		
		ItemGroupAmountDto that = (ItemGroupAmountDto) obj;
		
		return getItId() == that.getItId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getItId());
	}
	
	@Override
	public String toString() {
		return "ItemAmontDto [itId=" + itId + ", itName=" + itName + ", itAmountOfItems=" + itAmountOfItems + "]";
	}
	
}
