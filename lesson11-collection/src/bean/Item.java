package bean;

import java.math.BigDecimal;

public class Item /* implements Comparable<Item> */ {
	private Integer id;
	private String name;
	private BigDecimal salesPrices;
	private Integer storeId;

	public Item() {
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
	
	// comparator.compare(Item i1, Item i2) --> Comparator<T>
	// i1.compareTo(i2)						--> Comparable<T>

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item)) {
			return false;
		}
		Item that = (Item)o;	
		
		return getId().equals(that.getId());
	}
	
	// comparator.compare(Item i1, Item i2) --> Comparator<T>
		// i1.compareTo(i2)                     --> Comparable<T>

		// this --> i1
		// o --> i2
//		@Override
//		public int compareTo(Item o) {
//			Item i1 = this;
//			Item i2 = o;
//			// return i1.getId().compareTo(i2.getId());
//			return i2.getName().compareTo(i1.getName());
//		}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrices=" + salesPrices + ", storeId=" + storeId + "]";
	}
}
