package persistence.dto;

import java.util.Objects;

public class ItemGroupDto {

	private Integer igId;
	private String igName;
	private Long totalOfItems;
	private String items;
	
	/**
	 * Empty constructor
	 */
	public ItemGroupDto() {
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public Long getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(Long totalOfItems) {
		this.totalOfItems = totalOfItems;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getIgId());
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ItemGroupDto))
			return false;
		ItemGroupDto that = (ItemGroupDto)o;
		return getIgId().equals(that.getIgId());
	}
	
	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", totalOfItems=" + totalOfItems + ", items="
				+ items + "]";
	}
}
