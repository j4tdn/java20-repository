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
	
	// @ManyToOne --> mặc định: fetchType.EAGER
	// Nguy cơ xảy ra lỗi performance: SELECT N + 1
	// SELECT N + 1: chỉ select 1 bảng nhưng nó tự lấy thêm N bảng quan hệ với nó
	// nếu các bảng quan hệ đều dùng EAGER
	// EAGER: Ban đầu khi get(truy vấn) item --> luôn tự động get item_group dù có cần sử dụng hay k
	//      : thường sử dụng EAGER khi biết chắc chắn bảng item_group không có hoặc có ít quan hệ
	//        với các bảng khác và các bảng đó phải sử dụng fetchType.LAZY
		
	// LAZY: khi get item --> tạo proxy cho item group
	//                    --> khi nào item.getItemGroup() để sử dụng(print, set, ..) thì mới get item_group
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITEM_GROUP_ID", referencedColumnName = "ID")
	private ItemGroup group;
	
	@OneToMany(mappedBy = "item")
	private List<ItemDetail> details = new ArrayList<>();
	
	/**
	 * Empty constructor
	 * 
	 * if has constructor with parameters -> must have empty constructor
	 * if no constructor with parameters -> maybe not empty constructor(not recommended)
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
		if (this == o)
			return true;
		if (!(o instanceof Item))
			return false;
		Item that = (Item)o;
		return getId().equals(that.getId());
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice + ", color="
				+ color + "]";
	}
}
