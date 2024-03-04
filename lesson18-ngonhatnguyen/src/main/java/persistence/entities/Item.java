package persistence.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@Column(name = "IMAGE_01")
	private String image01;
	
	@Column(name = "IMAGE_02")
	private String image02;
	
	@Column(name = "LAST_UPDATE_AT")
	private LocalDateTime lastUpdateAt;
	
	@Column(name = "BUY_PRICE")
	private BigDecimal buyPrice;
	
	@Column(name = "COLOR")
	private String color;
	
	@ManyToOne
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup group;
	
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
	
	public String getImage01() {
		return image01;
	}
	
	public void setImage01(String image01) {
		this.image01 = image01;
	}
	
	public String getImage02() {
		return image02;
	}
	
	public void setImage02(String image02) {
		this.image02 = image02;
	}
	
	public LocalDateTime getLastUpdateAt() {
		return lastUpdateAt;
	}
	
	public void setLastUpdateAt(LocalDateTime lastUpdateAt) {
		this.lastUpdateAt = lastUpdateAt;
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
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Item)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup) obj;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
}
