package persistence.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * Sử dụng ORM framework để mapping class trong Java với database
 * + Tên class bất kỳ
 * + Tên table bất kỳ
 * + Mapping class với table name
 * + Mapping attributes với table columns
 * + Mapping constraints
 * 
 * Không bắt buộc phải mapping 1/ALL classes với tables
 * Khi nào cần truy vấn trả về dạng entity mình với mapping
 * để đỡ phải set tay column với attribute
 *  
 */

@Entity
@Table(name = "item_group")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@NamedQueries(
//@NamedQuery(
//		name = ItemGroup.Q_GET_ALL, 
//		query = "FROM ItemGroup" /*JPQL*/)
//)

@NamedNativeQueries(
@NamedNativeQuery(
	name = ItemGroup.Q_GET_ALL,
	query = "SELECT * FROM item_group", /*Native Query*/
	resultClass = ItemGroup.class)
)

public class ItemGroup {

	public static final String Q_GET_ALL = "Q_GET_ALL";
	
	// Save ItemGroup into database table item_group
	// setId(null)
	// Java Layer --> OK
	// Database Layer --> Exception
	
	// Prefer[optional]: Validation at Java Layer --> references
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	// @OneToMany => mặc định fetchType = LAZY
	@OneToMany(mappedBy = "group")
	private List<Item> items;
	
	/*
	 * Hibernate required empty constructor
	 */
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup) obj;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name +"]";
	}
}
