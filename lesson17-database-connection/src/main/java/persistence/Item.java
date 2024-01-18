package persistence;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Item: class chứa các thuộc tính bảng item trong database 
 * Load từ database đổ ra java
 */
public class Item {
	
	private Integer id;
	private String name;
	private String material;
	private BigDecimal buyPrice;
	private String color;
	private ItemGroup group; // has-a -> ITEM 1-1 ITEM_GROUP

	/**
	 * Empty constructor
	 */
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
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice + ", color="
				+ color + ", group=" + group + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}

		if (!(o instanceof Item)) {
			return false;
		}

		Item that = (Item) o;
		return that.getId() == getId();
	}
	
}
