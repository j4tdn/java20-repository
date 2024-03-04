package persistence.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	private BigDecimal buyPrice;
	
	@Column(name = "COLOR")
	private String color;
	
	@OneToMany(mappedBy = "item", fetch = FetchType.LAZY)
	private List<ItemDetail> details = new ArrayList<>();
	
	// A -> B -> C -> D
	// Relation: @OneToMany, @ManyToOne, @OneToOne, @ManyToMany
	//         : fetchType: EAGER, LAZY
	
	// @ManyToOne --> mặc định: fetchType - EAGER
	// Nguy cơ xảy ra lỗi performance: SELECT N + 1
	// N + 1 --> chỉ select 1 bảng nhưng mà nó tự lấy thêm N bảng quan hệ với nó
	// nếu các quan hệ mapping đều dùng EAGER
	// EAGER: Ban đầu khi get item --> luôn tự động get item group dù mình có cần ko
	
	// LAZY: khi get item --> tạo proxy cho item group
	//                    --> khi nào item.getItemGroup() thì nó mới truy vấn group cho mình  
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup group;
	
	/**
	 * Empty constructor
	 */
	public Item() {
	}
	
	public Item(Integer id, String name, String material, BigDecimal buyPrice, String color) {
		this.id = id;
		this.name = name;
		this.material = material;
		this.buyPrice = buyPrice;
		this.color = color;
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
	
	public void setGroup(ItemGroup group) {
		this.group = group;
	}
	
	public ItemGroup getGroup() {
		return group;
	}
	
	public List<ItemDetail> getDetails() {
		return details;
	}
	
	public void setDetails(List<ItemDetail> details) {
		this.details = details;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Item)) {
			return false;
		}
		
		Item that = (Item)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice + ", color="
				+ color + "]";
	}
}
