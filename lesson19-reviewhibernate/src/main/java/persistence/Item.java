package persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "MATERIAL")
	private String material;

	@Column(name = "BUY_PRICE")
	private Double buyPrice;

	@Column(name = "COLOR")
	private String color;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup itemGroup;

	public Item(Integer id, String name, String material, Double buyPrice, String color, ItemGroup itemGroup) {
		this.id = id;
		this.name = name;
		this.material = material;
		this.buyPrice = buyPrice;
		this.color = color;
		this.itemGroup = itemGroup;
	}

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

	public Double getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Double buyPrice) {
		this.buyPrice = buyPrice;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}
	
	

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice + ", color="
				+ color + ", itemGroup=" + itemGroup + "]";
	}

}
