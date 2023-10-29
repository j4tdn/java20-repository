package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Store {

	private Integer storeId;
	private String referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private boolean isSelected;

	public Store() {
	}

	public Store(Integer storeId, String referenceStoreId, BigDecimal stockPreviousDay, BigDecimal expectedSales,
			boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public String getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(String referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public BigDecimal getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(BigDecimal stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(BigDecimal expectedSales) {
		this.expectedSales = expectedSales;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Store)) {
			return false;
		}
		
		Store that = (Store) (obj);
		return this.getStoreId().equals(that.getStoreId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getStoreId());
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected + "]";
	}

}
