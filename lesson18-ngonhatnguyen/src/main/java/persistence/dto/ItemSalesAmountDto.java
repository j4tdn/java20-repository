package persistence.dto;

import java.math.BigDecimal;
import java.sql.Time;
import java.util.Objects;

public class ItemSalesAmountDto {
	public static final String PROP_IT_ID = "itId";
	public static final String PROP_IT_NAME = "itName";
	public static final String PROP_SALES_AMOUNT = "itSalesAmount";
	
	private Integer itId;
	private String itName;
	private BigDecimal itSalesAmount;
	
	public ItemSalesAmountDto() {
	}

	public ItemSalesAmountDto(Integer itId, String itName, BigDecimal itSalesAmount) {
		super();
		this.itId = itId;
		this.itName = itName;
		this.itSalesAmount = itSalesAmount;
	}

	public Integer getItId() {
		return itId;
	}

	public void setItId(Integer itId) {
		this.itId = itId;
	}

	public String getItName() {
		return itName;
	}

	public void setItName(String itName) {
		this.itName = itName;
	}

	public BigDecimal getItSalesAmount() {
		return itSalesAmount;
	}

	public void setItSalesAmount(BigDecimal itSalesAmount) {
		this.itSalesAmount = itSalesAmount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ItemSalesAmountDto)) {
			return false;
		}
		
		ItemSalesAmountDto that = (ItemSalesAmountDto) obj;
		
		return getItId() == that.getItId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getItId());
	}

	@Override
	public String toString() {
		return "ItemSalesAmountDto [itId=" + itId + ", itName=" + itName + ", itSalesAmount=" + itSalesAmount + "]";
	}
	
}
