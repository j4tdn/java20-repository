package persistence;


	import java.math.BigDecimal;
import java.time.LocalDateTime;
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
		
		@Column(name = "IMAGE_01")
		private String image01;
		
		@Column(name = "IMAGE_02")
		private String image02;
		
		@Column(name ="LAST_UPDATE_AT")
		private LocalDateTime last_Update_At;
		
		
		
		
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

		public LocalDateTime getLast_Update_At() {
			return last_Update_At;
		}

		public void setLast_Update_At(LocalDateTime last_Update_At) {
			this.last_Update_At = last_Update_At;
		}

		@Override
		public String toString() {
			return "Item [id=" + id + ", name=" + name + ", material=" + material + ", buyPrice=" + buyPrice
					+ ", color=" + color + ", image01=" + image01 + ", image02=" + image02 + ", last_Update_At="
					+ last_Update_At + ", group=" + group + "]";
		}

	}

