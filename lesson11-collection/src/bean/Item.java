package bean;

import java.math.BigDecimal;

public class Item implements Comparable<Item>{
	
	private Integer id;
	private String name;
	private BigDecimal salesPrice;
	private Integer storeId;
	
	public Item() {
	}

	public Item(Integer id, String name, BigDecimal salesPrice, Integer storeId) {
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
	
	// comparator.compare(Item i1, Item i2) --> Comparator<T>
	// i1.compareTo(i2)                     --> Comparable<T>
	
	// this --> i1
	// o --> i2
	@Override
	public int compareTo(Item o) {
		Item i1 = this;
		Item i2 = o;
		// return i1.getId().compareTo(i2.getId());
		return i2.getName().compareTo(i1.getName());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId + "]";
	}
}