package persistence.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name ="size")
public class Size {
	
	public Size() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name ="ID")
	private Integer id;
	
	@Column(name ="SIZE")
	private String size;
	@Column(name ="GENDER")
	private Boolean gender;
	@Column(name ="DESC")
	private String destription;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public String getDestription() {
		return destription;
	}
	public void setDestription(String destription) {
		this.destription = destription;
	}
	public Size(Integer id, String size, Boolean gender, String destription) {
		super();
		this.id = id;
		this.size = size;
		this.gender = gender;
		this.destription = destription;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Size))
			return false;
		Size that = (Size)o;
		return getId().equals(that.getId());
	
	}
	@Override
	public String toString() {
		return "Size [id=" + id + ", size=" + size + ", gender=" + gender + ", destription=" + destription + "]";
	}
	
}
