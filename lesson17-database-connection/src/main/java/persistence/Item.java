package persistence;

import java.math.BigDecimal;
import java.util.Objects;

/*
 * Item: class chua cac thuoc tinh cua bang item trong database
 * 
 * load tu database do ra java
 */
public class Item {
	
	private Integer id;
	private String name;
	private String material;
	private BigDecimal buyPrice;
	private String color;
	//has-a --> item 1-1 group
	private ItemGroup group;
	
	public Item() {
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ItemGroup getGroup() {
		return group;
	}

	public void setGroup(ItemGroup group) {
		this.group = group;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item )) {
			return false;
		}
		Item that = (Item)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice
				+ ", color=" + color + ", group=" + group + "]";
	}
	
}
