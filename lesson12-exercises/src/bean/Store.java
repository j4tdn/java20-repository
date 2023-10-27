package bean;

import java.math.BigDecimal;

public class Store {

	private String storeId;
	private Store referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private boolean isSelected;
	private BigDecimal allocationKey;
	private BigDecimal amountAllocated;
	private BigDecimal demand;
	
	public Store() {
	}

	public Store(String storeId, Store referenceStoreId, BigDecimal stockPreviousDay, BigDecimal expectedSales,
			boolean isSelected) {
		this.storeId = storeId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
	}

	
	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Store getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(Store referenceStoreId) {
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

	public BigDecimal getAllocationKey() {
		return allocationKey;
	}

	public void setAllocationKey(BigDecimal allocationKey) {
		this.allocationKey = allocationKey;
	}

	public BigDecimal getAmountAllocated() {
		return amountAllocated;
	}

	public void setAmountAllocated(BigDecimal amountAllocated) {
		this.amountAllocated = amountAllocated;
	}

	public BigDecimal getDemand() {
		return demand;
	}

	public void setDemand(BigDecimal demand) {
		this.demand = demand;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected
				+ ", allocationKey=" + allocationKey + ", amountAllocated=" + amountAllocated + ", demand=" + demand
				+ "]";
	}

}
