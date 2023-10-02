package bean;

import java.math.BigDecimal;

public class Item implements Comparable<Item>{
	private Integer id;
	private String name;
	private BigDecimal salesPrices;
	private Integer storeId;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(Integer id, String name, BigDecimal salesPrices, int i) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrices = salesPrices;
		this.storeId = i;
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
	public BigDecimal getSalesPrices() {
		return salesPrices;
	}
	public void setSalesPrices(BigDecimal salesPrices) {
		this.salesPrices = salesPrices;
	}
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrices=" + salesPrices + ", storeId=" + storeId + "]";
	}
	@Override
	public int compareTo(Item o) {
		return 0;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Item)) {
			return false;
		}
		Item that = (Item)obj;
		return getId().equals(that.getId());
	}
}
