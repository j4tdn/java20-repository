package bean;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Store: Cửa hàng
 * + id: mã cửa hàng
 * + desc: mô tả
 * + potential: số mặt hàng cần có để bán
 * + whId: mã kho, kho hàng chuyển mặt hàng đến cửa hàng
 */
public class Store {
	private Item item;
	private Integer id;
	private String desc;
	private BigDecimal potential;
	private Integer whId;
	private BigDecimal demand;




	public Store() {
	}

	

	public Item getItem() {
		return item;
	}



	public void setItem(Item item) {
		this.item = item;
	}



	public Store(Item item, Integer id, String desc, BigDecimal potential, Integer whId) {
		super();
		this.item = item;
		this.id = id;
		this.desc = desc;
		this.potential = potential;
		this.whId = whId;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public BigDecimal getPotential() {
		return potential;
	}

	public void setPotential(BigDecimal potential) {
		this.potential = potential;
	}

	public Integer getWhId() {
		return whId;
	}

	public void setWhId(Integer whId) {
		this.whId = whId;
	}
	

	public BigDecimal getDemand() {
		return demand;
	}



	public void setDemand(BigDecimal demand) {
		this.demand = demand;
	}



	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Store)) {
			return false;
		}

		Store that = (Store) o;

		return getId().equals(that.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}



	@Override
	public String toString() {
		return "Store [item=" + item + ", id=" + id + ", desc=" + desc + ", potential=" + potential + ", whId=" + whId
				+ "]";
	}


}