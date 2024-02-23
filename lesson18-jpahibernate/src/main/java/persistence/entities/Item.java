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
	private List<ItemDetail> details = new ArrayList<ItemDetail>(); 
	
	// A -> B -> C -> D
	// Relation: @OneToMany, @ManyToOne ...
	// 		   : fetchType: EAGER, LAZY
	
	// @ManyToOne --> mặc định: fetchType - EAGER
	// Nguy cơ xảy ra lỗi performence: SElECT N + 1
	// N + 1 --> chỉ select 1 bảng nhưgn nó lấy n bảng quan hệ
	// nếu các bảng quan hệ mapping đều là eager
	
	// EAGER: khi get item --> luôn tự động get itemgroup dù có cần hay ko
	
	// LAZY: khi get item  --> tạo proxy cho itemGroup
	// 					   --> khi nào cần itemGroup thì nó truy vấn db lấy
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup group;
	
	/**
	 * Empty constructor
	 */
	public Item() {
	}
	
	public Item(Integer id, String name, String material, BigDecimal buyPrice, String color, ItemGroup group) {
		this.id = id;
		this.name = name;
		this.material = material;
		this.buyPrice = buyPrice;
		this.color = color;
		this.group = group;
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
	
	public ItemGroup getGroup() {
		return group;
	}
	
	public void setGroup(ItemGroup group) {
		this.group = group;
	}
	
	public List<ItemDetail> getDetails() {
		return details;
	}
	
	public void setDetails(List<ItemDetail> details) {
		this.details = details;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public boolean equals(Object o) {

		if (this == o) {
			return true;
		}

		if (!(o instanceof Item)) {
			return false;
		}

		Item that = (Item) o;
		return that.getId() == getId();
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice + ", color="
				+ color + "]";
	}
}
