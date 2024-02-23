package persistence.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Size {

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "GENDER")
	private Boolean gender;

	@Column(name = "DESC")
	private String desc;

	@Column(name = "SIZE")
	private String size;

	public Size() {
	}

	public Size(Integer id, Boolean gender, String desc, String size) {
		this.id = id;
		this.gender = gender;
		this.desc = desc;
		this.size = size;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
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

		if (!(o instanceof Size)) {
			return false;
		}

		Size that = (Size) o;
		return that.getId() == getId();
	}

	@Override
	public String toString() {
		return "Size [id=" + id + ", gender=" + gender + ", desc=" + desc + ", size=" + size + "]";
	}

}
