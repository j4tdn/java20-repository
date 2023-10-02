package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Item{
	
	private Integer id;
	private String name;
	private BigDecimal salesPrice;
	private Integer storeId;
	
	public Item() {
	}

	public Item(Integer id, String name, BigDecimal salesPrice, Integer storeId) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
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

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this.getId());
	}
	
	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Item other = (Item) obj;
//		return getId().equals(other.getId());
		return true;
	}

	public int compareTo(Item o) {
		Item i1 = this;
		Item i2 = o;
		return i1.getName().compareTo(i2.getName());
	}
	
}
