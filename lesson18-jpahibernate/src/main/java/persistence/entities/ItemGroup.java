package persistence.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/*
 * Sử dụng ỎM framework để mapping  class trong Java với table trong Database
 * + tên class, attribute bất kỳ
 * + tên table, column  bất kỳ
 * + mapping class với table name
 * + mapping attributes với table columns
 * + mapping constraints
 * 
 * Không bắt buộc phải mapping 1/All classes với tables
 * khi nào cần truy vấn trả về dạng entitty mình mới mapping
 * để đỡ phải set tay column vói attribute
 * 
 */
@Entity
@Table(name = "item_group")


//@NamedQueries(
//		@NamedQuery (
//				name = ItemGroup.Q_GET_ALL,
//				query ="FROM ItemGroup")
//)

@NamedNativeQueries(
		@NamedNativeQuery (
				name = ItemGroup.Q_GET_ALL,
				query ="SELECT * FROM item_group",
				resultClass = ItemGroup.class)
)

public class ItemGroup {
	
	public static final String Q_GET_ALL ="Q_GET_ALL";
	//save ItemGroup into database table item_group
	///setId(null)
	//Database Layer --> Exception
	
	//prefer: Validation at Java Layer --> restrict pass wrong data into databse
	
	@Id
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	/*
	 * hibernate required empty constructor
	 */
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
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
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup )) {
			return false;
		}
		ItemGroup that = (ItemGroup)o;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
	
}
