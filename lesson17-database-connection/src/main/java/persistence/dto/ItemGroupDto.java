package persistence.dto;

import java.util.Objects;

import persistence.ItemGroup;

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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ItemGroupDto)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup) obj;
		
		return getIgId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getIgId());
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", totalOfItems=" + totalOfItems + ", items="
				+ items + "]";
	}
	
	
}
